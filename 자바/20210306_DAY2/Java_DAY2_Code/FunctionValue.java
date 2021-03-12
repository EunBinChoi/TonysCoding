import java.util.Scanner;
public class FunctionValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		long answer;
		int x;
		
		System.out.print("Input: ");
		x = input.nextInt();
		
		if (x <= 0) {
			
			answer = x * x * x - 9 * x + 2;
		}
		else {
			
			answer = 7 * x + 2;
		}
		System.out.printf("The answer is %d", answer);
	}

}
