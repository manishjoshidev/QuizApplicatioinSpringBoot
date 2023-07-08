package QuizApp.SpringBootApplication.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import QuizApp.SpringBootApplication.dao.ParticipantDao;
import QuizApp.SpringBootApplication.model.participant;

@Service
public class ParticipantsService {
	@Autowired
   ParticipantDao participantDao;

	public ResponseEntity<List<participant>> getScore() {
        try {
            return new ResponseEntity<List<participant>>(participantDao.getId(),HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<>( HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> getParticipantsId() {
        try {
            return new ResponseEntity<String>(participantDao.getScore(),HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<>("", HttpStatus.BAD_REQUEST);
    }
}
