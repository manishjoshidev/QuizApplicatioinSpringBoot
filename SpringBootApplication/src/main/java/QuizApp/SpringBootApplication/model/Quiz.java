package QuizApp.SpringBootApplication.model;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data

public class Quiz {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	@ManyToMany
	private List<Question>question;
	public void setTitle(String title2) {
		// TODO Auto-generated method stub
		
	}
	public void setQuestions(List<Question> questions) {
		// TODO Auto-generated method stub
		
	}
	public List<Question> getQuestions() {
		// TODO Auto-generated method stub
		return null;
	}
}
