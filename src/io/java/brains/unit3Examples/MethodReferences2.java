package io.java.brains.unit3Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.java.brains.unit1Examples.Person;

public class MethodReferences2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("shubhangi", "khobare", 23), new Person("Ankur", "Mali", 23),
				new Person("Manisha", "chavan", 30), new Person("shivanya", "Malik", 34)

		);
		System.out.println("print all records" + people);
		printConditionally(people, p -> true, System.out::println);// p->method(p)

	}

	private static void printConditionally(List<Person> pepole, Predicate<Person> predicate,
			Consumer<Person> consumer) {

		for (Person p : pepole) {
			if (predicate.test(p)) {
				consumer.accept(p);

			}
		}

	}
}
