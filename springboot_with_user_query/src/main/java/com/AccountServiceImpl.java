package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountRepository accountRepository;

	@Override
	public List<Account> getAllAccount() {
		List<Account> accList=accountRepository.findAll();
		return accList;
	}

	@Override
	public Account saveAccount(Account account) {
		accountRepository.save(account);
		return account;
	}

	@Override
	public List<Account> getAccountByCriteria(Float amount) {
		List<Account> accList=accountRepository.filterAccountByAmount(amount);
		return accList;
	}

	@Override
	public List<Account> getAccountByAmountName(Float amount, String name) {
		List<Account> accList=accountRepository.filterAccountByAmountName(name, amount);
		return accList;
	}

	@Override
	public List<Account> getAccountByQueryParam(Float amount) {
		List<Account> accList=accountRepository.filterAccountByAmount(amount);
		return accList;
	}

}
