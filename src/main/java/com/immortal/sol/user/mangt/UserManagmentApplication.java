package com.immortal.sol.user.mangt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class UserManagmentApplication {
	
	public static final Logger _logger = LoggerFactory.getLogger(UserManagmentApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(UserManagmentApplication.class, args);
		_logger.info("----Welcome to User Management Application----");
	}
	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.immortal.sol.user.mangt")).build();
	}

}
