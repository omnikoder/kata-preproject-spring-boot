package root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import root.entities.User;
import root.repositories.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		var context = SpringApplication.run(Application.class, args);
		var userRepo = context.getBean(UserRepository.class);

		userRepo.save(new User("Макс", 20, "max@mail.com"));

		context.close();
	}
}
