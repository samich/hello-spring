package com.example.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

public class AppConfigTest {

	@Bean
	public String name() {
		return "Ariel";
	}
	
	@Bean
	public int age() {
		return 7;
	}
	
	@Bean(name="age2")
	public int age1() {
		return 8;
	}
	
	@Bean
	public Person person1() {
		Person person = new Person("Megan", 18);
		return person;		
	}
	
	@Bean
	public Address address1() {
		Address address = new Address("201 Lake Road", "Trenton, NJ");
		return address;
	}
		
	@Bean
	public Address address3() {
		Address address = new Address("374 Charla Lane", "Mound Valley, KS");
		return address;
	}
	
	//set a bean as primary
	@Bean
	@Primary
	public Person person2() {
		Person person = new Person(name(), age1());
		return person;
	}
	
	@Bean
	@Primary
	public Address address2() {
		Address address = new Address("843 Brookview Drive", "Jasper, TX");
		return address;
	}
		
	//get bean by passing parameters to method
	@Bean
	public Person person3(String name, int age) {
		Person person = new Person(name, age);
		return person;
	}
	
	//get bean by passing parameters to method
	@Bean
	public Person person4(String name, int age) {
		Person person = new Person(name, 14);
		return person;
	}
	
	@Bean
	public AnotherPerson person5(String name, int age, Address address3) {
		AnotherPerson person = new AnotherPerson(name, 14, address3);
		return person;
	}

	//set a bean as a qualifier
	@Bean
	@Qualifier("address3Qualifier")
	public Address address4() {
		Address address = new Address("1121 Columbia Boulevard", "Las Vegas, NV");
		return address;
	}
	
	//use the qualifier bean instead of primary bean
	@Bean
	public AnotherPerson person6(String name, int age, @Qualifier("address3Qualifier") Address address) {
		AnotherPerson person = new AnotherPerson(name, 14, address);
		return person;
	}
	
}
