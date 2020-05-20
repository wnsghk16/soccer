package com.occamsrazor.web.mappers;

import com.occamsrazor.web.domains.ScheduleDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleMapper {
    public List<ScheduleDTO> selectAll();
}
