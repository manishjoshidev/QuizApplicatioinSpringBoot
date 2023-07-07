package QuizApp.SpringBootApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import QuizApp.SpringBootApplication.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
