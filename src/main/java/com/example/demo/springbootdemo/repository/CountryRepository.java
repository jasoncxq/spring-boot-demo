package com.example.demo.springbootdemo.repository;

import com.example.demo.springbootdemo.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long>{

}
