import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		boolean x;
		int y, z;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수도입니까?(수도 : 1 수도 아님 : 0) : ");
		x = (sc.nextInt() == 1) ? true : false;
		
		System.out.print("인구(단위 : 백만) : ");
		y = sc.nextInt();
		
		System.out.print("부자의 수(단위 : 백만) : ");
		z = sc.nextInt();
		
		boolean xyz = (x == true && y >= 200) || (z >= 100);
		// 위의 조건식이 약간 잘못된 것 같네요!
		// 거대도시가 될 수 있는 방법은 아래의 두 가지 조건 중 하나를 만족해야한다고 가정!
		// 1. 한 나라의 수도이고 인구가 100만 이상
		// 2. 부자인 인구가 50만 이상
		
		// (x == true && y >= 100) || (z >= 50)
		
		
		System.out.print("메트로폴리스 여부 : " + xyz);
		
		sc.close();
	}

}
