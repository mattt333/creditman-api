package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

@Entity

public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String name;
    private String country;
    private int structure_grade;
    private int cash_grade;
    private int result_grade;
    private int overall_grade;

    @OneToMany(mappedBy = "company")
    @JsonManagedReference
    private List<Account> accounts;

    public Company() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getStructure_grade() {
        this.setStructure_grade();
        return structure_grade;
    }

    public void setStructure_grade() {
        try {
            Account lastAccount = Collections.max(this.getAccounts(), Comparator.comparing(Account::getYear));
            this.structure_grade = lastAccount.getEquity()/lastAccount.getLong_term_debt();
        }
        catch (Exception e){
            this.structure_grade = 0;
        }
    }

    public int getCash_grade() {
        this.setCash_grade();
        return cash_grade;
    }

    public void setCash_grade() {
        try {
            Account lastAccount = Collections.max(this.getAccounts(), Comparator.comparing(Account::getYear));
            this.cash_grade = lastAccount.getCash()*24/lastAccount.getSales();
        }
        catch (Exception e){
            this.cash_grade = 0;
        }
    }

    public int getResult_grade() {
        this.setResult_grade();
        return result_grade;
    }

    public void setResult_grade() {
        try {
            Account lastAccount = Collections.max(this.getAccounts(), Comparator.comparing(Account::getYear));
            this.result_grade = lastAccount.getEbit()*50/lastAccount.getSales();
        }
        catch (Exception e){
            this.result_grade = 0;
        }
    }

    public int getOverall_grade() {
        this.setOverall_grade();
        return overall_grade;
    }

    public void setOverall_grade() {
        try {
            this.overall_grade = (this.cash_grade+this.result_grade+this.structure_grade)/3;
        }
        catch (Exception e){
            this.overall_grade = 0;
        }

    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }


}
