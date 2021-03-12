import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		double x, y;
		final double pyeongtometer = 3.3058;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 평인지 입력하시오 : ");
		x = sc.nextDouble();
		
		
		// 이런 식으로 final로 상수정의를 해서
		// 변수명으로 접근하면 더 가독성이 좋을 것 같습니다.
		// 코드에 상수값을 최대한 적게 넣는 것이 좋습니다!
		y = x * pyeongtometer;
		
		
		//y = x * 3.3058;
		
		System.out.print((int)x + "평은 " + y + "평방미터입니다.");
		
		sc.close();
	}

}
