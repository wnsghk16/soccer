package com.occamsrazor.web.mappers;

import com.occamsrazor.web.domains.StadiumDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StadiumMapper {
    public List<StadiumDTO> selectAll();
}
