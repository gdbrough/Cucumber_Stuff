package com.training;

public class DefaultServiceLocator {

	private static ClientService clientService = new ClientService();
	private static AccountService accountService = new AccountService();

	
	public DefaultServiceLocator() {
		// TODO Auto-generated constructor stub
	}
	
	public ClientService createClientServiceInstance() {
		return clientService;
	}

	public AccountService createAccountServiceInstance() {
		return accountService;
	}
}
