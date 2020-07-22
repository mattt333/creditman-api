package com.example.demo.service;

import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AccountService {
    @Autowired
    AccountRepository repository;

    public List<Account> getAll(){
        return repository.findAll();
    }
    public Account create(Account account){
        return repository.save(account);
    }
}
