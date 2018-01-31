package Unit3Package;

import java.util.Arrays;
import java.util.List;

import java8lambdabasics.person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		
		List<person> people= Arrays.asList(
				new person("Charles", "Dickens", 60),
				new person("Lewis", "Carroll", 42),
				new person("Thomas", "Carlyle", 51),
				new person("Charlotte", "Bronte", 45),
				new person("Matthew", "Arnold", 39)
				);
		
		//how do we loop through this list.
		//1) For Loop
		System.out.println("Using the for loop");
		for(int i=0; i< people.size();i++) {
			System.out.println(people.get(i));
		}

		
		//using the for-each iterations (also known as for-in loop)
		
		System.out.println("Using the for-in loop");
		for(person t: people) {
			System.out.println(t);
		}
		
		
		//both of these codes are expressed as "external iterator" in other words you are controlling the iterations.
		
		//Java 8 introduced a new iterations called "internal iterations", basically giving the control to another person, in this case the "run time"
		
		
		//writing down an lambda function in the parameters, the run time will know when to stop.
		System.out.println("Using the lambda for-each loop");
		people.forEach(h -> System.out.println(h));
		//can be written down as a method reference
		//people.forEach(System.out::println);
		
	}

}
