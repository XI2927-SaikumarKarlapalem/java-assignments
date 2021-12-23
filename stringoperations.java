package assignment;

import java.util.List;
import java.util.stream.*;
public class stringoperations {
	public static void main(String[]args)
	{
		var<> names=List.of("sai","kumar","malli","naga",90,99,87);
		System.out.println(names);
		System.out.println("------------------------------------------------------------------");
		String name1="           saikumar";
		String name2="nagamalli       ";
		String name3="   sukumar    ";
		System.out.println("By using strip method to remove all blank spaces!");
		System.out.println(name3.strip());
		System.out.println("------------------------------------------------------------------");
		System.out.println("By using strip leading to remove white spaces before the string.");
		System.out.println(name3.stripLeading());
		System.out.println("------------------------------------------------------------------");
		System.out.println("By using strip trailing to remove white spaces after the string.");
		System.out.println(name3.stripTrailing());
		System.out.println("------------------------------------------------------------------");
		System.out.println(name3.repeat(5));
		System.out.println("------------------------------------------------------------------");
		System.out.println(name1.isBlank());
		System.out.println("------------------------------------------------------------------");
		names.forEach(System.out::println);
		System.out.println("------------------------------------------------------------------");
		String guests="ram\nrohith\nrahul\nvarun\nsandeep";
		Stream<String> m=guests.lines();
		m.forEach(System.out::println);
		System.out.println(guests.lines().count());
		
	}

}
