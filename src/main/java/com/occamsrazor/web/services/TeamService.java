package com.occamsrazor.web.services;

import com.occamsrazor.web.domains.TeamDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TeamService {
    public List<TeamDTO> retriveAll();
}
