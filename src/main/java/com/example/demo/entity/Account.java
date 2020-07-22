package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity

public class Account {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private long id;
    private int equity;
    private int sales;

    @ManyToOne
    @JsonBackReference
    private Company company;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public int getEquity() {
        return equity;
    }

    public void setEquity(int equity) {
        this.equity = equity;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
