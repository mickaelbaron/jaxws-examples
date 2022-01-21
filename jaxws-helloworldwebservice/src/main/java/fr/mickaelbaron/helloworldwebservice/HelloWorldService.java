package fr.mickaelbaron.helloworldwebservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 */
@WebService(name = "HelloWorldService", targetNamespace = "http://helloworldwebservice.mickaelbaron.fr/")
public interface HelloWorldService {

	@WebMethod(operationName = "makeHelloWorld")
	@WebResult(name = "helloWorldResult")
	String makeHelloWorld(@WebParam(name = "value") String value);

	@WebMethod(operationName = "simpleHelloWorld")
	@WebResult(name = "helloWorldResult")
	String simpleHelloWorld();
}
