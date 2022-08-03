package com.homecredit.bankingapp.service;

import com.homecredit.bankingapp.exception.AccountException;
import com.homecredit.bankingapp.exception.AccountValidationException;
import com.homecredit.bankingapp.exception.NoAccountFoundException;
import com.homecredit.bankingapp.model.Account;
import com.homecredit.bankingapp.util.AccountUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AccountServiceArrListImpl extends  AbstractAccountService{
    private List<Account> accounts = new ArrayList<>();

    @Override
    public boolean create(Account account) throws AccountException {
        if(account.getName() == null || account.getName().isEmpty())
        {
            throw new AccountValidationException("Account Name can't be empty");
        }
        return accounts.add(account);
    }

    @Override
    public boolean update(int accountId, Account updatedAccount) throws AccountException{
        Account accountForUpdate = null;
        boolean isUpdateSuccess = false;
        int index = 0;
        for (Account account: accounts) {
            if(account.getAccountId() == accountId) {
                accountForUpdate = account;
            }
            index++;
        }

        if(accountForUpdate == null) {
//        if(this.isValidAccount(accountId, Collections.unmodifiableList(accounts))) {
//        if(AccountUtils.isValidAccount(accountId, Collections.unmodifiableList(accounts))) {
                throw new NoAccountFoundException("No account found for given account id - " + accountId);
            } else {
                accounts.set(index, updatedAccount);
                isUpdateSuccess = true;
            }
        return isUpdateSuccess;

    }

    @Override
    public boolean delete(int accountId) {
        return false;
    }

    @Override
    public Account get(int accountId) {
        return null;
    }

    @Override
    public Collection<Account> getAll() {
        return null;
    }
}
