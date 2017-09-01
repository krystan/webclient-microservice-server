package com.forwardthinkingit.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class RemoteAccountRepository implements AccountRepository {

    @Autowired
    protected RestTemplate _restTemplate;

    protected String _serviceUrl;

    public RemoteAccountRepository(String serviceUrl) {
        _serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
                : "http://" + serviceUrl;
    }

    @Override
    public List<Account> getAllAccounts() {
        Account[] accounts = _restTemplate.getForObject(_serviceUrl+"/accounts", Account[].class);
        return Arrays.asList(accounts);
    }

    @Override
    public Account getAccount(String number) {
        return _restTemplate.getForObject(_serviceUrl + "/accounts/{id}",
                Account.class, number);
    }
}
