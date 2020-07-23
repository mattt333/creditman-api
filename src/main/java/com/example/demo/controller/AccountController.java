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

    @GetMapping(value = "/{id}")
    public Account getById(@PathVariable long id) {
        return service.getById(id);
    }

    @PostMapping
    public Account create(@RequestBody Account account){
        return service.create(account);
    }

    @PutMapping (value = "{id}")
    public Account update (@PathVariable long id, @ RequestBody Account account) {
        return service.update(id, account);
    }

    @DeleteMapping (value = "/{id}")
    public void delete (@PathVariable long id) {
        service.delete(id);
    }





}
