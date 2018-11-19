package fr.mickaelbaron.helloworldquietwebservice;

import javax.jws.WebService;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 */
@WebService
public class HelloWorldService {

	public String makeHelloWorld(String value) {
		return "Hello World to " + value;
	}

	public String simpleHelloWorld() {
		return "Hello World to everybody";
	}
}