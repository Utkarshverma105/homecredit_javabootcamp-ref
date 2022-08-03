package com.homecredit.bankingapp.util;

import com.homecredit.bankingapp.model.Account;

import java.util.Collection;

public class AccountUtils {

    public static boolean isValidAccount(int accountId, Collection<Account> accounts) {
        boolean isValid = false;
        for (Account account: accounts) {
            if(account.getAccountId() != accountId) {
                isValid = true;
            }
        }
        return isValid;
    }
}
