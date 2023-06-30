package QuizApp.SpringBootApplication.dao;
import QuizApp.SpringBootApplication.model.Question;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
	
	List<Question>findByCategory(String category);
	@Query(value="select * from question q where q.category=:category order by random() LIMIT:numQ",nativeQuery=true)
	List<QuizApp.SpringBootApplication.model.Question> findRandomQuestionByCategory(String category,int numQ);
	void save(org.aspectj.weaver.patterns.TypePatternQuestions.Question question);

}
