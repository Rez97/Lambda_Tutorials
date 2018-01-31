package Unit3Package;

public class MethodReferenceExample1 {
	
	//Method Reference is an alternative method of writing lambda expression. Sometimes easier to read.

	public static void main(String[] args) {
		
		//printMessage();
		
		//objective is to create a new thread object and called the printMessage through it.
		
		//this lambda is performing a method execution
		//what we are practically doing is we are passing on some values onto the method .The parameters need to be the same for both of them.
		//Thread t= new Thread(() -> printMessage());
		// ".start" is a built in method of thread that we can use.
		//t.start();
		
		
		//this is a method reference expression
		//simpler syntax
		//give the class name where you have the method: "MethodReferenceExample1" :: name of the method  () ->functionName()
		//MethodReferenceExample1::printMessage === () -> printMessage()
		Thread t= new Thread(MethodReferenceExample1::printMessage);
		t.start();
		

	}

	
	public static void printMessage() {
		System.out.println("Hello");
	}
}
