import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input character: ");
		char ch = input.next().charAt(0);
		System.out.println("Input two integer: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int res = 0; 
		
		
		if(ch == '+') {
			res = a + b;
			
		}
		else if (ch == '-') {
			res = a - b;
			
		}
		else if (ch == '*') {
			res = a * b;
			
		}
		else if (ch == '/' && b != 0) {
			res = a / b;
			
		}
		else {
			System.out.println("no operator");
		}
		System.out.printf("result: %d\n", res);
		
	}

}
