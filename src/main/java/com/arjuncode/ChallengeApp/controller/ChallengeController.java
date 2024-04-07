package com.arjuncode.ChallengeApp.controller;

import com.arjuncode.ChallengeApp.Challenge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ChallengeController {

    //we need to store challenges
    private List<Challenge> challenges = new ArrayList<>();

    public ChallengeController() {
        //create new object of challenge class
        Challenge challenge1 = new Challenge(1L, "January", "This is the January month challenge");
        challenges.add(challenge1);
    }

    @GetMapping("/challenges")
    public List<Challenge> getAllChallenges(){
        return challenges;
    }

    @PostMapping("/challenges")
    public String addChallenge(@RequestBody Challenge challenge){
        challenges.add(challenge);
        return "Challenge added successfully";
    }
}
