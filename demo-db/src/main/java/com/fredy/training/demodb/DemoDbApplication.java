package com.fredy.training.demodb;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoDbApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJDBCDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(DemoDbApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		logger.info("all users -> {}", dao.findAll());
		
		
	}
}
