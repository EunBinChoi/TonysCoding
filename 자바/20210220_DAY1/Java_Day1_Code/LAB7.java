import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		double x, y, z;
		final double feettoinch = 12;
		final double inchtocm = 2.54;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하세요 : ");
		x = sc.nextDouble();
		
		y = x / (feettoinch * inchtocm);
		z = x / inchtocm;
		
		// 상수 값을 넣는 것보다 final로 정의하면
		// feettoinch, inchtocm 이런 식으로 이름을 넣을 수 있으니까
		// 가독성이 더 좋아질 것 같습니다!
		
		
//		y = x / 30.48;
//		z = x / 2.54;
		
		System.out.print((int)x + "cm는 " + (int)y + "피트 " + z + "인치입니다.");
		
		sc.close();	
	}

}

