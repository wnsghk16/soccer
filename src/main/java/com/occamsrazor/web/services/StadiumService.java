package com.occamsrazor.web.services;

import com.occamsrazor.web.domains.StadiumDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StadiumService {
    public List<StadiumDTO> retriveAll();
}
