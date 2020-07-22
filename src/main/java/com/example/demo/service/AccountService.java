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

    public Account getById(long id){
        return repository.findById(id).get();
    }

    public Account create(Account account){
        return repository.save(account);
    }

    public Account update (long id , Account account) {
        Account AccountToUpdate = repository.findById(id).get();
        AccountToUpdate.setCompany(account.getCompany());
        AccountToUpdate.setYear(account.getYear());
        AccountToUpdate.setEquity(account.getEquity());
        AccountToUpdate.setLong_term_debt(account.getLong_term_debt());
        AccountToUpdate.setAssets(account.getAssets());
        AccountToUpdate.setCash(account.getCash());
        AccountToUpdate.setShort_term_debt(account.getCash());
        AccountToUpdate.setCustomer(account.getCustomer());
        AccountToUpdate.setSupplier(account.getSupplier());
        AccountToUpdate.setSales(account.getSales());
        AccountToUpdate.setEbitda(account.getEbitda());
        AccountToUpdate.setEbit(account.getEbit());
        AccountToUpdate.setNet_result(account.getNet_result());


        return repository.save(AccountToUpdate);
    }

    public void delete (long id) {
        repository.deleteById(id);
    }
}
