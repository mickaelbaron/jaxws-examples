package fr.mickaelbaron.notebookwebservicewithsoaphandler;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 */
public class Person {
	
	private String name;

	private String address;

	private String birthyear;

	public Person() {
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthyear() {
		return birthyear;
	}

	public void setBirthyear(String birthyear) {
		this.birthyear = birthyear;
	}
}