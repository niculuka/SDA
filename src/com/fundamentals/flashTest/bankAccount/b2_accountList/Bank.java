package com.fundamentals.flashTest.bankAccount.b2_accountList;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accountList = new ArrayList<>();

    public Account openCurrentAccount() {
        Account account = new Account();
        accountList.add(account);
        return account;
    }
}
