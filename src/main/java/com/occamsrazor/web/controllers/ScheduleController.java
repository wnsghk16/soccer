package com.occamsrazor.web.controllers;

import com.occamsrazor.web.domains.ScheduleDTO;
import com.occamsrazor.web.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {
    @Autowired ScheduleService scheduleService;
    @GetMapping("")
    public List<ScheduleDTO> getAll(){
        return scheduleService.retriveAll();
    }
}
