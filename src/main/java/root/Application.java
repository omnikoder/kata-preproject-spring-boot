package root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import root.repositories.UserRepositoryImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		var context = SpringApplication.run(Application.class, args);
		var userRepo = context.getBean(UserRepositoryImpl.class);

		userRepo.getUsers().forEach(System.out::println);

		context.close();
	}
}
