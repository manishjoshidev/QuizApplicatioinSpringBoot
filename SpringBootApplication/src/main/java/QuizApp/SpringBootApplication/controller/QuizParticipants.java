package QuizApp.SpringBootApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 
import QuizApp.SpringBootApplication.model.participant;
import QuizApp.SpringBootApplication.services.ParticipantsService;

@RestController
public class QuizParticipants {
    @Autowired
    ParticipantsService participantsService;
    
    @GetMapping("/score")
    public ResponseEntity<List<participant>> getScore() {
        return participantsService.getScore();
    }
    
    @GetMapping("/candidateId")
    public ResponseEntity<String> getParticipantId() {
        return participantsService.getParticipantsId();
    }
}
