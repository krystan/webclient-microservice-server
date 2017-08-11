package com.forwardthinkingit.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AccountController {
    @Autowired
    AccountRepository _accountRepository;

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/accountList")
    public String accountList(Model model) {
        model.addAttribute("accounts", _accountRepository.getAllAccounts());
        return "accountList";
    }

    @RequestMapping("/accountDetails")
    public String accountDetails(@RequestParam("number") String id, Model model) {
        model.addAttribute("account", _accountRepository.getAccount(id));
        return "accountDetails";
    }
}
