package com.example.demo.controller;

import com.example.demo.entity.Company;
import com.example.demo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/companies")

public class CompanyController {
    @Autowired
    CompanyService service;
    @GetMapping
    public List<Company> getAll(){

        return service.getAll();
    }

    @GetMapping (value = "/{id}")
    public  Company getById (@PathVariable long id){
        return service.getById(id);
    }

    @PostMapping
    public  Company company (@RequestBody Company company){
        return service.create(company);
    }

    @PutMapping (value = "/{id}")
    public Company company (@PathVariable long id , @RequestBody Company company){
        return service.update(id, company);
    }

    @DeleteMapping (value = "/{id}")
    public void delete (@PathVariable long id) {
        service.delete(id);
    }

}
