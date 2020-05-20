package com.occamsrazor.web.services;

import com.occamsrazor.web.domains.ScheduleDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ScheduleService {
    public List<ScheduleDTO> retriveAll();
}
