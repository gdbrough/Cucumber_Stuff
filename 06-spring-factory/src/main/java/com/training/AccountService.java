package com.training;

public class AccountService {

	private static AccountService accountService = new AccountService();
	
	public AccountService() {
		// TODO Auto-generated constructor stub
	}
	
	public static AccountService createInstance() {
		return accountService;
	}
	
	public void printSomething() {
		System.out.println("Something printed from account service.");
	}
}
