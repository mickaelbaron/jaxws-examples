package fr.mickaelbaron.notebookwebserviceasyncclient;

import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.Response;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 */
public class NotebookServiceAsyncClient {
	public static void main(String[] args) throws InterruptedException {
		NotebookService_Service notebookService = new NotebookService_Service();
		NotebookService noteBookPort = notebookService.getNotebookPort();

		Person refPerson = new Person();
		refPerson.setName("Baron Mickael");
		refPerson.setAddress("Poitiers");
		refPerson.setBirthyear("1976");

		noteBookPort.addPersonWithComplexTypeAsync(refPerson, new AsyncHandler<AddPersonWithComplexTypeResponse>() {

			@Override
			public void handleResponse(Response<AddPersonWithComplexTypeResponse> res) {
				if (!res.isCancelled() && res.isDone()) {
					try {
						AddPersonWithComplexTypeResponse value = res.get();
						System.out.println(value.isAddPersonWithComplexTypeResult());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});

		Thread.sleep(10000);

		System.out.println("Finished.");
	}
}
