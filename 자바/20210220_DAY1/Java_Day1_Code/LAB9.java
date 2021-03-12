import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		double x, y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("힘을 입력하세요 : ");
		x = sc.nextDouble();
		
		System.out.print("면적 을 입력하세요 : ");
		y = sc.nextDouble();
		
		double z = x / y;
		/*
		 * 코드를 잘 짜셔서 리뷰할 부분은 딱히 없지만
		 * 변수 명을 좀 더 의미있게 작성해주시면 좋을 것 같습니다!
		 * 
		 * 예를 들어,
		 * 
		 * 압력 (pressure)
		 * 크기 (proportion)
		 * 넓이 (square)
		 * */
		
		System.out.print("압력의 세기는 " + z + "입니다");
		
		sc.close();
	}

}
