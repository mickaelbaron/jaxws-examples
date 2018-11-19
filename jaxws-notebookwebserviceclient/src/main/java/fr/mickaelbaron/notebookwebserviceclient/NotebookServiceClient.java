package fr.mickaelbaron.notebookwebserviceclient;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 */
public class NotebookServiceClient {
	public static void main(String[] args) {
		NotebookService_Service notebookService = new NotebookService_Service();
		NotebookService noteBookPort = notebookService.getNotebookPort();
		Person refPerson = new Person();
		refPerson.setName("Baron Mickael");
		refPerson.setAddress("Poitiers");
		refPerson.setBirthyear("1976");

		boolean addPersonWithComplexType = noteBookPort.addPersonWithComplexType(refPerson);

		System.out.println(addPersonWithComplexType);
	}
}
