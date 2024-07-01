package Dev.app.runnerz;

import Dev.app.runnerz.run.Location;
import Dev.app.runnerz.run.run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


@SpringBootApplication
public class RunnerzApplication {
	public static final Logger log= LoggerFactory.getLogger(RunnerzApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RunnerzApplication.class, args);

	}
		@Bean
	CommandLineRunner runner(){
		return args -> {
			run run;
            run = new run(1,
					"First run",
					LocalDateTime.now(),
					LocalDateTime.now().plus(1, ChronoUnit.HOURS),
					5,
		"OUTDOOR");
			log.info("Run: "+run);

        };
		}
}
