package com.capgemini.bankapp.dao.impl;

import java.util.Set;

import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.database.BankAccountDatabase;
import com.capgemini.bankapp.model.BankAccount;

public class BankAccountDaoImpl implements BankAccountDao {

	@Override
	public double getBalance(long accountId) {
		Set<BankAccount> accounts = BankAccountDatabase.getAllBankDetails();
		// TODO:
		for (BankAccount b : accounts) {
			if (b.getAccountId() == accountId) {
				return b.getBalance();
			}

		}
		return 0.0;
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		Set<BankAccount> accounts = BankAccountDatabase.getAllBankDetails();
		for (BankAccount b : accounts) {
			if (b.getAccountId() == accountId) {
				b.setBalance(newBalance);
				return b.getBalance();
			}
		}
		return 0;

	}
}
