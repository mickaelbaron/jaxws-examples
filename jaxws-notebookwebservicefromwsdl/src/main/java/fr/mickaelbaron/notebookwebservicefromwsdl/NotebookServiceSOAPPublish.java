package fr.mickaelbaron.notebookwebservicefromwsdl;

import jakarta.xml.ws.Endpoint;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 */
public class NotebookServiceSOAPPublish {

	public static void main(String[] args) {
		NotebookService current = new NotebookServiceImpl();
		Endpoint.publish("http://localhost:8080/notebookwebservicefromwsdl/notebook", current);
	}
}
