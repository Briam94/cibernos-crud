package com.co.cibernos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com..co.cibernos")
public class EnterpriseCibernosMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnterpriseCibernosMsApplication.class, args);
	}

}
