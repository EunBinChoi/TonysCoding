import java.util.Scanner;
public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1, c = 0;
		int n;
		
		Scanner input = new Scanner(System.in);
		System.out.println("****************************");
		System.out.println("    Fibonacci Program");
		System.out.println("****************************");
		System.out.println("[Example]");
		System.out.println("term  : 0 1 2 3 4 5 6 ...");
		System.out.println("value : 0 1 1 2 3 5 8 ...");
		System.out.println("****************************");
		System.out.print("which term do you want to know? ");
		n = input.nextInt();
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		System.out.printf("term : %d => value : %d", n, c);
	}

}

/*
 * term  : 0 1 2 3 4 5 6 .. 
 * value : 0 1 1 2 3 5 8 .. 
 * */
