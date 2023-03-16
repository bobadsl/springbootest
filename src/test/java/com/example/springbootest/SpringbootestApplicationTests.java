package com.example.springbootest;



/**
 * Permettent d'utiliser les annotations pour configurer la classe
 * SpringbootestApplicationTests
 *
 * dependance dans le build.gradle :
 *    testImplementation 'org.springframework.boot:spring-boot-starter-test'
 */
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;


/**
 * Annotation qui indique au framework Spring Boot que c'est une classe de test
 */
@SpringBootTest
class SpringbootestApplicationTests {


	/**
	 * Annotation qui indique à Spring Boot que c'est une méthode de test
	 * La méthode test() apparaitra dans le rapport de tests
	 */
	@Test
	void test() {
		Assert.isTrue((4/2) == 2, "Non égaux");
		Assert.isInstanceOf(String.class, new String(), "Pas une chaîne");

		List<Integer> liste = new ArrayList<Integer>();
		liste.add(1);
		Assert.notEmpty(liste, "Est vide)");

		Integer i = null;
		Assert.isNull(i, "Doit être null");
	}

}
