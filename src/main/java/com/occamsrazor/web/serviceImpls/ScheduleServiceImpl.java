package com.occamsrazor.web.serviceImpls;

import com.occamsrazor.web.domains.ScheduleDTO;
import com.occamsrazor.web.mappers.ScheduleMapper;
import com.occamsrazor.web.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired ScheduleMapper scheduleMapper;

    @Override
    public List<ScheduleDTO> retriveAll() {
        return scheduleMapper.selectAll();
    }
}
