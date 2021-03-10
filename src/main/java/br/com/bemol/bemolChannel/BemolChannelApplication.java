package br.com.bemol.bemolChannel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class BemolChannelApplication {

	public static void main(String[] args) {
		SpringApplication.run(BemolChannelApplication.class, args);
	}

}
