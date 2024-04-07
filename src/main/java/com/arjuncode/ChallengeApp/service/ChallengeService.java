package com.arjuncode.ChallengeApp.service;

import com.arjuncode.ChallengeApp.Challenge;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChallengeService {

    private List<Challenge> challenges = new ArrayList<>();

    private Long nextId = 1L;

    public ChallengeService(){
//        Challenge challenge1 = new Challenge(1L, "January", "This is the January month challenge");
//        challenges.add(challenge1);
    }

    public List<Challenge> getAllChallenges(){
        return challenges;
    }

    public boolean addChallenge(Challenge challenge){
        if(challenge != null){
            challenge.setId(nextId++);
            challenges.add(challenge);
            return true;
        } else{
            return false;
        }

    }


    public Challenge getChallenges(String id) {
        for(Challenge challenge: challenges){
            if(challenge.getMonth().equalsIgnoreCase(id)){
                return challenge;
            }
        }
        return null;
    }
}
