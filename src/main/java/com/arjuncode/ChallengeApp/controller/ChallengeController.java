package com.arjuncode.ChallengeApp.controller;

import com.arjuncode.ChallengeApp.Challenge;
import com.arjuncode.ChallengeApp.service.ChallengeService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ChallengeController {

    private ChallengeService challengeService;

    //we need to store challenges


    public ChallengeController(ChallengeService challengeService) {
        this.challengeService = challengeService;
    }

    @GetMapping("/challenges")
    public List<Challenge> getAllChallenges(){
        return challengeService.getAllChallenges();
    }

    @PostMapping("/challenges")
    public String addChallenge(@RequestBody Challenge challenge){
        boolean isChallengeAdded = challengeService.addChallenge(challenge);
        if(isChallengeAdded){
            return "Challenge added successfully";
        }
        return "Challenge not added";
    }

    @GetMapping("/challenges/{month}")
    public Challenge getChallenges(@PathVariable String month){
        Challenge challenge =  challengeService.getChallenges(month);
        if(challenge != null){
            return challenge;
        }
        return null;
    }
}
