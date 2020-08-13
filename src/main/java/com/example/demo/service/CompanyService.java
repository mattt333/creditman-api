package com.example.demo.service;


import com.example.demo.entity.Account;
import com.example.demo.entity.Company;
import com.example.demo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository repository;

    public List <Company> getAll(){

        //List<Company> companies= repository.findAll();
        /*for (Company company : companies) {
            Account account = company.getAccounts().get();
            int overall_grade = account.getSales()/account.getEquity();
            company.setOverall_grade(overall_grade);
        }

        return companies;*/
        return repository.findAll();
    }

    public Company getById(long id) {
        return repository.findById(id).get();
        /*Company company= repository.findById(id).get();
        int computed_grade;
        try {
            Account lastAccount = Collections.max(company.getAccounts(), Comparator.comparing(Account::getYear));
            computed_grade = lastAccount.getSales()/lastAccount.getEquity();
            company.setOverall_grade(computed_grade);
            repository.save(company);
        } catch (NoSuchElementException e) {
            computed_grade = 12;
        }
        finally {
            return company;
        }*/

        }




    public Company create (Company company){
        return repository.save(company);
    }

    public Company update (long id, Company company){
        Company companyToUpdate = repository.findById(id).get();
        companyToUpdate.setName(company.getName());
        companyToUpdate.setAccounts(company.getAccounts());
        companyToUpdate.setCountry(company.getCountry());
        companyToUpdate.setStructure_grade();
        companyToUpdate.setCash_grade();
        companyToUpdate.setResult_grade();
        companyToUpdate.setOverall_grade();
        return repository.save(companyToUpdate);
    }

    public void delete (long id){
        repository.deleteById(id);
    }

    public void setOverallGrade(){

    }
}
