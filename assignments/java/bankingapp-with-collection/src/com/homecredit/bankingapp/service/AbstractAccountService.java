package com.homecredit.bankingapp.service;

import com.homecredit.bankingapp.model.Account;

import java.util.Collection;

public abstract class AbstractAccountService implements AccountService {
    public boolean isValidAccount(int accountId, Collection<Account> accounts) {
        boolean isValid = false;
        for (Account account: accounts) {
            if(account.getAccountId() != accountId) {
                isValid = true;
            }
        }
        return isValid;
    }
}
