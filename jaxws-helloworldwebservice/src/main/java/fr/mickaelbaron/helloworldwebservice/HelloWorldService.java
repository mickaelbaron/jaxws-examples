package fr.mickaelbaron.helloworldwebservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

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
