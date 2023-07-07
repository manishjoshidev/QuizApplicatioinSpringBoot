package QuizApp.SpringBootApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightAnswer;
    private String difficultylevel;
    private String category;
	public Object getRightAnswer() {
		// TODO Auto-generated method stub
		return null;
	}
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getQuestionTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getOption1() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getOption2() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getOption3() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getOption4() {
		// TODO Auto-generated method stub
		return null;
	}

    // Constructors, getters, and setters
    // ...
}

