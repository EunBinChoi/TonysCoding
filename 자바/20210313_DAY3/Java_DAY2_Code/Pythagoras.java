import java.util.Scanner;
public class Pythagoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cnt = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Input Length of Hypotenuse? (a, b) ");
				
		for (int a = 1; a < 100; a ++) {
			for (int b = 1; b <= 100; b ++) {
				for (int c = 1; c <= 100; c ++) {
					if (c*c == a*a + b*b) {
						System.out.printf("(a : %d, b : %d, c: %d)\n", a, b, c);
						cnt ++;
					}
					
				}
				
			}
			
		}
		System.out.printf("피타고라스 정리를 만족하는 직각 삼각형의 개수는: %d", cnt);
	}

}
