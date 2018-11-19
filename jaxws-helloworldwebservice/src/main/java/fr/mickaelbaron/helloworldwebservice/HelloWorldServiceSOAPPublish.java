package fr.mickaelbaron.helloworldwebservice;

import javax.xml.ws.Endpoint;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 */
public class HelloWorldServiceSOAPPublish {

	public static void main(String[] args) {
		HelloWorldService current = new HelloWorldServiceImpl();
		Endpoint.publish("http://localhost:8080/helloworldwebservice/helloworld", current);
	}
}
