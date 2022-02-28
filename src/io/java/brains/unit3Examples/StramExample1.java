package io.java.brains.unit3Examples;

import java.util.Arrays;
import java.util.List;

import io.java.brains.unit1Examples.Person;

public class StramExample1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("shubhangi", "Mali", 23), new Person("Priya", "chavan", 26),
				new Person("Shivanya", "Malik", 24), new Person("Priti", "chavala", 54),
				new Person("Ankur", "Malik", 24)

		);
		people.stream()
		.filter(p->p.getFirstName().startsWith("P"))
		.forEach(p->System.out.println(p.getFirstName()));

	}

}
