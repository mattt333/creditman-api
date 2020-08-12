package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
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
        return structure_grade;
    }

    public void setStructure_grade(int structure_grade) {
        this.structure_grade = structure_grade;
    }

    public int getCash_grade() {
        return cash_grade;
    }

    public void setCash_grade(int cash_grade) {
        this.cash_grade = cash_grade;
    }

    public int getResult_grade() {
        return result_grade;
    }

    public void setResult_grade(int result_grade) {
        this.result_grade = result_grade;
    }

    public int getOverall_grade() {
        return overall_grade;
    }

    public void setOverall_grade(int overall_grade) {
        this.overall_grade = overall_grade;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

   /* public void computeOverallGrade(){
        Account account = this.accounts.get(0);
        this.overall_grade = account.getSales()/account.getEbitda();
    }*/
}
