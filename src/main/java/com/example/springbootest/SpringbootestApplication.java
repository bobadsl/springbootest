package com.example.springbootest;

/**
 * Permettent d'utiliser les annotations pour configurer la classe
 * SpringbootestApplication
 *
 * dependance dans le build.gradle :
 *    	implementation 'org.springframework.boot:spring-boot-starter'
 */

import org.springframework.boot.SpringApplication; // Permettra de lancer l'application avec la méthode run()
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Annotation qui indique au framework Spring Boot que c'est un point d'entrée de l'application
 */
@SpringBootApplication
public class SpringbootestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootestApplication.class, args);
	}

}
