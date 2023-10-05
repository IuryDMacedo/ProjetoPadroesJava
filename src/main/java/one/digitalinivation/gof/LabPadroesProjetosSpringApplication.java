package one.digitalinivation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/*
*
* projeto Spring boot gerado via spring initializr.
* Os seguintes modulos foram selecionados:
* Spring data JPA
* Spring Web
* H2 Database
* openFeign
*
*
* @author IuryMacedo
*
*/
@SpringBootApplication
@EnableFeignClients(basePackages = "one.digitalinivation.gof.service")
public class LabPadroesProjetosSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetosSpringApplication.class, args);
	}

}
