package QuizApp.SpringBootApplication.model;

import jakarta.persistence.Entity;

@Entity
public class participant {
	 private String Id;
     private String name;
     private String QuizId;
	public participant(String id, String name, String quizId) {
		super();
		Id = id;
		this.name = name;
		QuizId = quizId;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuizId() {
		return QuizId;
	}
	public void setQuizId(String quizId) {
		QuizId = quizId;
	}
      
     
}