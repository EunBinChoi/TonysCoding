import java.util.Scanner;


/*
 * 해당 문제는 코드리뷰해줄 부분이 없이
 * 잘 작성해주신 것 같네요!
 * 
 * 마지막에 Scanner 객체인 sc를 close 해주시는 부분도
 * 정말 좋습니다!
 * */

public class Test {

	public static void main(String[] args) {
		double x, y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨 온도를 입력 하세요 : ");
		
		x = sc.nextDouble();
		
		y = (double)5/9*(x-32);
		
		System.out.print("섭씨 온도는 : " + y);
		
		sc.close();
	}

}