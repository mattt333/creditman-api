package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/accounts")

public class AccountController {
    @Autowired
    AccountService service;

    @GetMapping
    public List<Account> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Account create(@RequestBody Account account){
        return service.create(account);
    }



}
