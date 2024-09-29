package com.amjath.BankingManagemt.service;

import com.amjath.BankingManagemt.entity.Account;

import java.util.List;

public interface AccountService {
    public Account createAccount(Account account);
    public Account getAccountDetailsByAccountNumber(Long accountNumber);
    public List<Account> getAllAccountDetails();
    public Account depositAmount(Long accountNumber,Double amount);
    public Account withdrawAmount(long accountNumber, Double amount);
    public void closeAccount(Long accountNumber);

}
