package com.homecredit.bankingapp;

import com.homecredit.bankingapp.service.AccountService;
import com.homecredit.bankingapp.service.AccountServiceArrListImpl;

public class BankingAppMain {
    public static void main(String[] args) {
        // ArrayList Impl
        AccountService service = new AccountServiceArrListImpl();
        // LinkedList Impl
//        AccountService service = new AccountServiceLnkListImpl();

        // TODO: Show Account Management menu
        // TODO: Logic to perform CRUD operations goes here with exception handling
    }
}
