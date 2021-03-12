import java.util.Scanner;
public class Seperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input one character: ");
		ch = input.next().charAt(0);
		
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Volume");
			break;
		default:
			System.out.println("Consonant");
			break;
		
		}
	}

}
