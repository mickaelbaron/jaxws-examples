package fr.mickaelbaron.notebookwebservice;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 */
@WebService(name = "NotebookService", targetNamespace = "http://notebookwebservice.mickaelbaron.fr/")
public interface NotebookService {

	@WebMethod(operationName = "addPersonWithComplexType")
	@WebResult(name = "addPersonWithComplexTypeResult")
	boolean addPersonWithComplexType(@WebParam(name = "newPerson") Person newPerson);

	@WebMethod(operationName = "addPersonWithSimpleType")
	@WebResult(name = "addPersonWithSimpleTypeResult")
	@Oneway
	void addPersonWithSimpleType(@WebParam(name = "name") String name, @WebParam(name = "address") String address,
			@WebParam(name = "birthyear") String birthyear);

	@WebMethod(operationName = "getPersonByName")
	@WebResult(name = "getPersonResult")
	Person getPersonByName(@WebParam(name = "personName") String name);

	@WebMethod(operationName = "getPersons")
	@WebResult(name = "getPersonsResult")
	Person[] getPersons();
}
