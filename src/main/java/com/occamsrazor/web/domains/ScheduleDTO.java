package com.occamsrazor.web.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ScheduleDTO {
    private String stadiumId,scheDate,gubun,hometeamId,awayteamId,homeScore,awayScore;
}
