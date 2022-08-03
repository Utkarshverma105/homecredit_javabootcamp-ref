package com.homecredit.bankingapp.service;

import com.homecredit.bankingapp.exception.AccountException;
import com.homecredit.bankingapp.model.Account;

import java.util.Collection;

public class AccountServiceTreSetImpl implements AccountService {
    @Override
    public boolean create(Account account) throws AccountException {
        return false;
    }

    @Override
    public boolean update(int accountId, Account account) throws AccountException {
        return false;
    }

    @Override
    public boolean delete(int accountId) throws AccountException {
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
