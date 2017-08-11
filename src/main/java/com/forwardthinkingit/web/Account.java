package com.forwardthinkingit.web;

import java.io.Serializable;

public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long _amount;
    private String _number;
    private String _name;

    public Long getAmount() {
        return _amount;
    }

    public void setAmount(Long amount) {
        _amount = amount;
    }

    public String getNumber() {
        return _number;
    }

    public void setNumber(String number) {
        _number = number;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    @Override
    public String toString() {
        return "Account [amount" + _amount + ", number=" + _number + ", name=" + _name + "]";
    }
}
