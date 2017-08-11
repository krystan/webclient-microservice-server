package com.forwardthinkingit.web;

import java.util.List;

public interface AccountRepository {
    List<Account> getAllAccounts();
    Account getAccount(String number);
}
