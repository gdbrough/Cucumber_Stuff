package com.training;

public class ClientService {

	private static ClientService clientService = new ClientService();
	
	public ClientService() {
		// TODO Auto-generated constructor stub
	}
	
	public static ClientService createInstance() {
		return clientService;
	}
	
	public void printSomething() {
		System.out.println("Something printed from client service.");
	}
}
