package br.jardim.hrconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HrSpringServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrSpringServerApplication.class, args);
	}

}
