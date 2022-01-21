package fr.mickaelbaron.helloworldquietwebservice;

import jakarta.xml.ws.Endpoint;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 */
public class HelloWorldServiceSOAPPublish {

	public static void main(String[] args) {
		HelloWorldService current = new HelloWorldService();
		Endpoint.publish("http://localhost:8080/helloworldquietwebservice/helloworldquiet", current);
	}
}