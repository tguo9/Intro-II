/**
	A driver class to test the Counter class.
	@author Tao Guo
**/

public class CounterDriver {

	public static void main(String[] args) {
		
		//Set up two counter.
		Counter c1 = new Counter();
		Counter c2 = new Counter();

		System.out.println("Counter 1: ");
		
		//Counter 1 click twice.
		c1.click();
		c1.click();

		//Print the counter 1 result.
		System.out.println(c1);
		
		//Click the conter again.
		c1.click();
		
		//Print the result by using the get methods.
		System.out.println(c1);
		
		//Reset the counter 1.
		c1.reset();
		
		//Print out the Counter 1 result.
		System.out.println(c1);

		System.out.println("");

		System.out.println("Counter 2: ");
		
		//Click counter 2 once.
		c2.click();
		
		//Print the counter 2 result.
		System.out.println(c2);
		
		//Click the conter again.
		c2.click();
		
		//Print the result by using the get methods.
		System.out.println(c2);

		//Reset the counter 2.
		c2.reset();
		
		//Print out the Counter 2 result.
		System.out.println(c2);


	}
}