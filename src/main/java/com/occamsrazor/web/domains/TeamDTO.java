package com.occamsrazor.web.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class TeamDTO {
    private String teamId,regionName,teamName,eTeamName,origYyyy,stadiumId,zipCode1,zipCode2,address,ddd,tel,fax,homepage,owner;
}
