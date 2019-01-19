package com.example.demo.springbootdemo.controller;

import com.example.demo.springbootdemo.domain.Country;
import com.example.demo.springbootdemo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CounryController {
    @Autowired
    private CountryRepository countryRepository;
    @RequestMapping(value="/")
    public String test(ModelMap model){
        List<Country> list = countryRepository.findAll();
        model.addAttribute("countrys",list);
        return "countryList";
    }
}
