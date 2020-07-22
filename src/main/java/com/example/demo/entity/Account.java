package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity

public class Account {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private long id;
    private int year;
    private int equity;
    private int long_term_debt;
    private int assets;
    private int cash;
    private int short_term_debt;
    private int customer;
    private int inventory;
    private int supplier;
    private int sales;
    private int ebitda;
    private int ebit;
    private int net_result;

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

    public int getLong_term_debt() {
        return long_term_debt;
    }

    public void setLong_term_debt(int long_term_debt) {
        this.long_term_debt = long_term_debt;
    }

    public int getAssets() {
        return assets;
    }

    public void setAssets(int assets) {
        this.assets = assets;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getShort_term_debt() {
        return short_term_debt;
    }

    public void setShort_term_debt(int short_term_debt) {
        this.short_term_debt = short_term_debt;
    }

    public int getCustomer() {
        return customer;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getSupplier() {
        return supplier;
    }

    public void setSupplier(int supplier) {
        this.supplier = supplier;
    }

    public int getEbitda() {
        return ebitda;
    }

    public void setEbitda(int ebitda) {
        this.ebitda = ebitda;
    }

    public int getEbit() {
        return ebit;
    }

    public void setEbit(int ebit) {
        this.ebit = ebit;
    }

    public int getNet_result() {
        return net_result;
    }

    public void setNet_result(int net_result) {
        this.net_result = net_result;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
