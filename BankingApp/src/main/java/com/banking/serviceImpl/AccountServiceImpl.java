package com.banking.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.dao.AccountRepo;
import com.banking.dao.CustomerRepo;
import com.banking.entity.Account;
import com.banking.entity.Customer;
import com.banking.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	AccountRepo accountrepo;
	
	@Autowired
	CustomerRepo customerrepo;

	@Override
	public Account addAccount(Account account) {
		Customer cstmr=new Customer(account.getCustomer().getName());
		  System.out.println(cstmr.getId());
		  System.out.println(cstmr.getName());

		  cstmr=customerrepo.save(cstmr); 
		  System.out.println(cstmr.getId());
		  
		  account.setCustomer(cstmr);
		 
		Account acnt=accountrepo.save(account);
		return acnt;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fundTransfer(Long from, Long to, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getBalance(Long accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
