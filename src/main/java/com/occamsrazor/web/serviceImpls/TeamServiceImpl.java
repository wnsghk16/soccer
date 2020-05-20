package com.occamsrazor.web.serviceImpls;

import com.occamsrazor.web.domains.TeamDTO;
import com.occamsrazor.web.mappers.TeamMapper;
import com.occamsrazor.web.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired TeamMapper teamMapper;
    @Override
    public List<TeamDTO> retriveAll() {
        return teamMapper.selectAll();
    }
}
