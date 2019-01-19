package com.example.demo.springbootdemo;

import com.example.demo.springbootdemo.domain.Country;
import com.example.demo.springbootdemo.repository.CountryRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {JpaConfiguration.class,SpringBootDemoApplication.class})
public class SpringBootDemoApplicationTests {
	private static Logger logger = LoggerFactory.getLogger(SpringBootDemoApplicationTests.class);

	@Autowired
	private CountryRepository countryRepository;
	@Before
	public void createCountry(){
		Country country = new Country();
		country.setCountrycode("86");
		country.setCountryname("China");
		countryRepository.save(country);
		assert country.getId()>0:"create error";
	}
	@Test
	public void getData(){
		List<Country> countrys = countryRepository.findAll();
		assert countrys !=null:"getdata is null";
		for(Country country:countrys){
			logger.info("===country name={}",country.getCountryname());
		}
	}
	public void contextLoads() {
	}

}

