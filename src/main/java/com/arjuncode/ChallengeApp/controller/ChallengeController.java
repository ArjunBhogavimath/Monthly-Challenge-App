package com.arjuncode.ChallengeApp.controller;

import com.arjuncode.ChallengeApp.Challenge;
import com.arjuncode.ChallengeApp.service.ChallengeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/challenges")
public class ChallengeController {

    private ChallengeService challengeService;


    public ChallengeController(ChallengeService challengeService) {
        this.challengeService = challengeService;
    }

    @GetMapping
    public ResponseEntity<List<Challenge>> getAllChallenges(){
        return new ResponseEntity<>(challengeService.getAllChallenges(), HttpStatus.OK) ;
    }

    @PostMapping
    public ResponseEntity<String> addChallenge(@RequestBody Challenge challenge){
        boolean isChallengeAdded = challengeService.addChallenge(challenge);
        if(isChallengeAdded){
            return new ResponseEntity<>("Challenge added successfully",HttpStatus.OK);
        }
        return new ResponseEntity<>("Challenge not added",HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{month}")
    public ResponseEntity<Challenge> getChallenges(@PathVariable String month){
        Challenge challenge =  challengeService.getChallenges(month);
        if(challenge != null){
            return new ResponseEntity<>(challenge, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{month}")
    public ResponseEntity<String> updateChallenge(@PathVariable String month,@RequestBody Challenge updatedChallenge){
        boolean isChallengeUpdated = challengeService.updateChallenge(month, updatedChallenge);
        if(isChallengeUpdated){
            return new ResponseEntity<>("Challenge updated successfully",HttpStatus.OK);
        }
        return new ResponseEntity<>("Challenge failed to updated",HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteChallenge(@PathVariable Long id){
        boolean isChallengeDeleted = challengeService.deleteChallenge(id);
        if(isChallengeDeleted){
            return new ResponseEntity<>("Challenge deleted successfully",HttpStatus.OK);
        }
        return new ResponseEntity<>("Challenge failed to delete",HttpStatus.NOT_FOUND);
    }
}
