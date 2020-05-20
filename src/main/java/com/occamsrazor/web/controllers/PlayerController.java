package com.occamsrazor.web.controllers;

import com.occamsrazor.web.domains.PlayerDTO;
import com.occamsrazor.web.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/players")
public class PlayerController {
    @Autowired PlayerService playerService;
    @Autowired PlayerDTO player;

    @GetMapping("")
    public List<PlayerDTO> getAll(){
        return playerService.retriveAll();
    }
    @PostMapping("/{playerId}/access")
    public PlayerDTO login(@PathVariable String playerId, @RequestBody PlayerDTO player){
        System.out.println("뷰와 연결이 성공!" + playerId);
        System.out.println("뷰와 연결이 성공!" + player.getBackNo());
        return player;
    }
}
