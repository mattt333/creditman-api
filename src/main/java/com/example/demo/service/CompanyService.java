package com.example.demo.service;


import com.example.demo.entity.Company;
import com.example.demo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository repository;

    public List <Company> getAll(){
        return repository.findAll();
    }

    public Company getById(long id) {
        return repository.findById(id).get();
    }

    public Company create (Company company){
        return repository.save(company);
    }

    public Company update (long id, Company company){
        Company companyToUpdate = repository.findById(id).get();
        companyToUpdate.setName(company.getName());
        companyToUpdate.setAccounts(company.getAccounts());
        companyToUpdate.setCountry(company.getCountry());
        companyToUpdate.setStructure_grade(company.getStructure_grade());
        companyToUpdate.setCash_grade(company.getCash_grade());
        companyToUpdate.setResult_grade(company.getResult_grade());
        companyToUpdate.setOverall_grade(company.getOverall_grade());
        return repository.save(companyToUpdate);
    }

    public void delete (long id){
        repository.deleteById(id);
    }
}
