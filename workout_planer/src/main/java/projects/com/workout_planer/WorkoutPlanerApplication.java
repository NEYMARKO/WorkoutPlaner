package projects.com.workout_planer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WorkoutPlanerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkoutPlanerApplication.class, args);
	}
}
