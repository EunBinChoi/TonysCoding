import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		double x, y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구의 반지름을 입력하세요 : ");
		x = sc.nextDouble();
		
		y = 4/3*x*x*x;
		/*
		 * 이 부분에서 구의 부피를 구하는 방법은
		 * 4/3*x*x*x에서 pi값도 들어가야할 것 같아요!
		 * 
		 * 따라서 y = 4/3*x*x*x*pi;
		 * 
		 * 
		 * 
		 * */
		
		System.out.print("구의 부피는 : " + y);
		
		sc.close();
	}

}
