package com.capgemini.bankapp.dao;

public interface BankAccountDao {
	public double getBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);

}
