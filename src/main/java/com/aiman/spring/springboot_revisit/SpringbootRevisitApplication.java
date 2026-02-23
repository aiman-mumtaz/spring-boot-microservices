package com.aiman.spring.springboot_revisit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.aiman.spring.springboot_revisit.game.GameRunner;

@SpringBootApplication
public class SpringbootRevisitApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootRevisitApplication.class, args);

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
	}

}
