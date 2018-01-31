package Unit3Package;

import java.util.Arrays;
import java.util.List;

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
		
		people.stream(); //based in the analogy it takes on the list of the people
		
		
	}

}
