package io.java.brains.unit3Examples;

import java.util.Arrays;
import java.util.List;

import io.java.brains.unit1Examples.Person;

public class CollectionIterationEx {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("shubhangi", "khobare", 23), new Person("Ankur", "Mali", 23),
				new Person("Manisha", "chavan", 30), new Person("shivanya", "Malik", 34)

		);
		System.out.println("using for loop");

		for (Person p : people) {
			System.out.println(p);
		}
		System.out.println("Using for each loop");
		people.forEach(p -> System.out.println(p));

		people.forEach(System.out::println);
	}

}
