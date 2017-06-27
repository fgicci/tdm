package com.gicci.sport.tdm.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
	"com.gicci.sport.tdm.controller"
})
public class TdmApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(TdmApplication.class, args);
	}
}
