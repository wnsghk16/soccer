package com.occamsrazor.web.serviceImpls;

import com.occamsrazor.web.domains.StadiumDTO;
import com.occamsrazor.web.mappers.StadiumMapper;
import com.occamsrazor.web.services.StadiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StadiumServiceImpl implements StadiumService {
    @Autowired StadiumMapper stadiumMapper;
    @Override
    public List<StadiumDTO> retriveAll() {
        return stadiumMapper.selectAll();
    }
}
