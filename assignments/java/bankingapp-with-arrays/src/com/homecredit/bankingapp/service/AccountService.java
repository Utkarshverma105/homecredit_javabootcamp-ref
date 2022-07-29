package com.homecredit.bankingapp.service;

import com.homecredit.bankingapp.model.Account;

public interface AccountService {
    public boolean create(Account account);
    public boolean update(int accountId, Account account);
    public boolean delete(int accountId);
    public Account get(int accountId);

    public Account[] getAll();
}
