package com.occamsrazor.web.controllers;

import com.occamsrazor.web.domains.StadiumDTO;
import com.occamsrazor.web.services.StadiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stadiums")
public class StadiumController {
    @Autowired StadiumService stadiumService;
    @GetMapping("")
    public List<StadiumDTO> getAll(){
        return stadiumService.retriveAll();
    }
}
