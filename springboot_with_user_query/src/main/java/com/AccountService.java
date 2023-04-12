package com;

import java.util.List;

import org.springframework.stereotype.Service;


public interface AccountService {
	public List<Account> getAllAccount();
	public Account saveAccount(Account account);
	public List<Account> getAccountByCriteria(Float amount);
	public List<Account> getAccountByAmountName(Float amount,String name);
	public List<Account> getAccountByQueryParam(Float amount);
		
}
