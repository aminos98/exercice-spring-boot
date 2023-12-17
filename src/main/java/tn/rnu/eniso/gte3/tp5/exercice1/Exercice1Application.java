package tn.rnu.eniso.gte3.tp5.exercice1;

import org.aspectj.bridge.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercice1Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercice1Application.class, args);
		EnisoWS.hello();
		EnisoWS.send(new Message());
	}

}
