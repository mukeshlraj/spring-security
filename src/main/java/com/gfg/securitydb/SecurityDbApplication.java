package com.gfg.securitydb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SecurityDbApplication implements CommandLineRunner {

	@Autowired
	AppRepository appRepository;

	@Autowired
	PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SecurityDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		AppUser appUser = AppUser.builder()
				.username("Ram")
				.password(passwordEncoder.encode("ram123"))
				.authorities("STUDENT")
				.build();

		appRepository.save(appUser);
	}
}
