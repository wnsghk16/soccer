package com.occamsrazor.web.mappers;

import com.occamsrazor.web.domains.TeamDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamMapper {
    public List<TeamDTO> selectAll();
}
