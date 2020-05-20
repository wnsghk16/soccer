package com.occamsrazor.web.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class StadiumDTO {
    private String stadiumId,stadiumName,hometeamId,seatCount,address,ddd,tel;
}
