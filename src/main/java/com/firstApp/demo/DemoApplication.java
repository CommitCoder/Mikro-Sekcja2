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
//		dog.setName("Reksio");
//		dog.sayHello();
//
//		Dog dog2= context.getBean(Dog.class);
//		dog2.sayHello();
//		System.out.println(dog2.getName());



	// 2 Second lesson - bean is by default a singleton so dog and dog2 refers to same object
	// - dog is created only once - constructor message ...

//	Dog dog = context.getBean(Dog.class);
//		dog.setName("Reks");
//
//	Dog dog2= context.getBean(Dog.class);
//		System.out.println(dog2.getName()); // Reks


		// 3 lesson if we don't create a dog sout from constructor will be performed anyway
		// because of @Component - dog is created when spring wakes up and create a context



		// 4 lesson prototype is not created when spring context is waking up
		// no sout from dog when prototype


		// 5 lesson  x2 time create a dog sout and getter gives null
		//PROTOTYPE

//		Dog dog = context.getBean(Dog.class);
//		dog.setName("Reksio");
//		dog.sayHello();
//
//		Dog dog2= context.getBean(Dog.class);
//		dog2.sayHello();
//		System.out.println(dog2.getName());



		// 6 lesson injecting Toy to Dog

		Dog dog = context.getBean(Dog.class);
		dog.sayHello();



	}
}
