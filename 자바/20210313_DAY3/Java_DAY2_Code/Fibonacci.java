import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 0, b = 1, c;
		int i;
		
		for (i = 2; i <= 10; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.printf("%d, ", c);
			
		}
		System.out.println("...");
	}

}
