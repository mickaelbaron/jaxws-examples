package fr.mickaelbaron.helloworldwebservice;

import javax.jws.WebService;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 */
@WebService(endpointInterface = "fr.mickaelbaron.helloworldwebservice.HelloWorldService", serviceName = "HelloWorldService", portName = "HelloWorldPort")
public class HelloWorldServiceImpl implements HelloWorldService {

	public String makeHelloWorld(String value) {
		return "Hello World to " + value;
	}

	public String simpleHelloWorld() {
		return "Hello World to everybody";
	}
}
