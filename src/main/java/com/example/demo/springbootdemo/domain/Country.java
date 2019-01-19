package com.example.demo.springbootdemo.domain;

import javax.persistence.*;

@Entity

@Table(name="country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String countryname;
    private String countrycode;

    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return id;
    }

    public void setCountryname(String countryname){
        this.countryname = countryname;
    }

    public String getCountryname(){
        return countryname;
    }

    public void setCountrycode(String countrycode){
        this.countrycode = countrycode;
    }

    public String getCountrycode(){
        return countrycode;
    }
}
