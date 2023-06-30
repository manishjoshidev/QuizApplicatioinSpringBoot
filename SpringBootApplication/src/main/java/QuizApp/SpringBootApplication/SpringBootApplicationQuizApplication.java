package QuizApp.SpringBootApplication;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringBootApplicationQuizApplication {  //Application will run from here

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationQuizApplication.class, args);
	}

}
