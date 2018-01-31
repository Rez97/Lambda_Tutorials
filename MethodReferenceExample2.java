package Unit3Package;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import java8lambdabasics.person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		
		List<person> people= Arrays.asList(
				new person("Charles", "Dickens", 60),
				new person("Lewis", "Carroll", 42),
				new person("Thomas", "Carlyle", 51),
				new person("Charlotte", "Bronte", 45),
				new person("Matthew", "Arnold", 39)
				);
		
		
		System.out.println("Printing all persons");
		performConditionally(people, p -> true, System.out::println); // p->method(p)
		//performConditionally(people, p -> true, p -> System.out.println(p));	//you can replace this with method references 

	}
	
    private static void performConditionally(List<person> people, Predicate <person> pre, Consumer <person> cons) {
	   for(person p: people) {
		if(pre.test(p)) { //predicate checks which type of people should be acted upon.
		cons.accept(p);
	}	
	}
}
}
