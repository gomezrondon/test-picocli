package com.gomezrondon.cli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import picocli.CommandLine;

@SpringBootApplication
public class CliApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CliApplication.class, args);
	}

	@Autowired
	private MainRunner mainRunner;

	@Override
	public void run(String... args) throws Exception {

		var service = CommandLine.populateCommand(mainRunner, args);
		String strUpper = service.executeOption();

		System.out.println(strUpper);
	}
}
