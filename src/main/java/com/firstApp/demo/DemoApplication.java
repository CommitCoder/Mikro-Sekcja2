package com.firstApp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

	// spring context
	ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

	//1 First lesson ##################################
		// Dog visible when has @Component annotation
		// SINGLETON Dog is created with instatiation  - sout() ..... Creating a dog
//		Dog dog = context.getBean(Dog.class);
//		dog.sayHello();
//
//		Dog dog2= context.getBean(Dog.class);
//		dog2.sayHello();



	// 2 Second lesson - bean is by default a singleton so dog and dog2 refers to same object
	// - dog is created only once - constructor message ...

//	Dog dog = context.getBean(Dog.class);
//		dog.setName("Reks");
//
//	Dog dog2= context.getBean(Dog.class);
//		System.out.println(dog2.getName()); // Reks


		

	}
}
