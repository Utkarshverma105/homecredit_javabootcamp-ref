package com.homecredit.bankingapp.service;

import com.homecredit.bankingapp.model.Account;

public class AccountServiceArrImpl implements  AccountService{
    @Override
    public boolean create(Account account) {
        return false;
    }

    @Override
    public boolean update(int accountId, Account account) {
        return false;
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
    public Account[] getAll() {
        return new Account[0];
    }
}
