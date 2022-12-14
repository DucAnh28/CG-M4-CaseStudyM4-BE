package com.ducanh.casestudy.controller;

import com.ducanh.casestudy.model.Coach;
import com.ducanh.casestudy.model.Player;
import com.ducanh.casestudy.service.coach.ICoachService;
import com.ducanh.casestudy.service.player.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private IPlayerService playerService;
    @Autowired
    private ICoachService coachService;

    @GetMapping("/coach")
    public ResponseEntity<Iterable<Coach>> displayAllCoach() {
        List<Coach> coaches = (List<Coach>) coachService.findAll();
        return new ResponseEntity<>(coaches, HttpStatus.OK);
    }

    @GetMapping("/player")
    public ResponseEntity<Iterable<Player>> displayAllPlayer(){
        List<Player> players = (List<Player>) playerService.findAll();
        return new ResponseEntity<>(players,HttpStatus.OK);
    }
}
