package io.java.brains.unit1Examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1Example {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("shubhangi", "Mali", 23), new Person("Priya", "chavan", 26),
				new Person("Shivanya", "Malik", 24), new Person("Priti", "chavala", 54),
				new Person("Ankur", "Malik", 24)

		);
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		System.out.println("Print All records");
		printConditionally(people, p -> true);

		printConditionally(people, p -> p.getLastName().startsWith("M"));

		printConditionally(people, p -> p.getFirstName().startsWith("S"));

		System.out.println();

	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate) {

		for (Person p : people) {
			if (predicate.test(p)) {
				System.out.println(p);
			}

		}

	}

}
