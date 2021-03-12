import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		double ac, ae, bc, de;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("선분 AC를 입력하세요 : ");
		ac = sc.nextDouble();
		
		System.out.print("선분 AE를 입력하세요 : ");
		ae = sc.nextDouble();
		
		System.out.print("선분 BC를 입력하세요 : ");
		bc = sc.nextDouble();
		
		de = ae * bc / ac;
		
		/*
		 * 해당 코드는 변수명도 코드도 적절히 잘 작성해주신 것 같습니다!
		 * 
		 * 딱히 리뷰할 부분이 없네요!
		 * 
		 * */
		
		System.out.print("선분 DE의 길이는 " + de +"입니다.");
		
		sc.close();
	}

}
