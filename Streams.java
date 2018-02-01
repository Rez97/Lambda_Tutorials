package Unit3Package;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import java8lambdabasics.person;

public class Streams {

	public static void main(String[] args) {
		
		List<person> people= Arrays.asList(
				new person("Charles", "Dickens", 60),
				new person("Lewis", "Carroll", 42),
				new person("Thomas", "Carlyle", 51),
				new person("Charlotte", "Bronte", 45),
				new person("Matthew", "Arnold", 39)
				);
		
		//create an assembly line to perform the actions.
		//As of java 8, every object comes with a stream method.
		
		people.stream()
		.filter(p ->p.getLastname().startsWith("C"))  //this takes on a condition
		.forEach(p -> System.out.println(p.getFirstName()));; //based in the analogy it takes on the list of the people
		//stream takes the people list and creates a assembly chain.
		
		
		
		//stream is composed of three different elements
		//1) source (collections)
		//2) operation that need to be performed on the stream
		//3) terminal conditions (end condition)
		
	    long count = people.stream().filter(p ->p.getLastname().startsWith("C")).count();
	    
	    System.out.println(count);
		
	}

}
