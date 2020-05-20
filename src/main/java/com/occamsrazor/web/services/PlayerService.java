package com.occamsrazor.web.services;

import com.occamsrazor.web.domains.PlayerDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PlayerService {
    public List<PlayerDTO> retriveAll();
}
