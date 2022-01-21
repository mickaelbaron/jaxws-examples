package fr.mickaelbaron.notebookwebserviceclientwithsoaphandler;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.handler.Handler;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 */
public class NotebookServiceClient {
	public static void main(String[] args) {
		NotebookService_Service notebookService = new NotebookService_Service();
		NotebookService noteBookPort = notebookService.getNotebookPort();
		
		List<Handler> myHandler = new ArrayList<>();
		myHandler.add(new SOAPLoggingHandler());
		
		((BindingProvider)noteBookPort).getBinding().setHandlerChain(myHandler);
		
		Person refPerson = new Person();
		refPerson.setName("Baron Mickael");
		refPerson.setAddress("Poitiers");
		refPerson.setBirthyear("1976");
				
		boolean addPersonWithComplexType = noteBookPort.addPersonWithComplexType(refPerson);
		
		System.out.println(addPersonWithComplexType);
	}
}
