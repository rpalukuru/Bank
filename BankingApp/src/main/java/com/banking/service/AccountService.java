package com.banking.service;

import java.util.List;

import com.banking.entity.Account;
import com.banking.entity.Customer;


public interface AccountService {
	
	public Account addAccount(Account account); 
	public Customer addCustomer(Customer customer); 

	public List<Account> getAllAccounts(); 
	public List<Customer> getAllCustomers(); 
	public String fundTransfer(Long from,Long to,double amount) ;
	public Account getBalance(Long accountNumber);

}
