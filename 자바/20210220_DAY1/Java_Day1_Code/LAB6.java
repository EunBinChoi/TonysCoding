import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		int x;

		Scanner sc = new Scanner(System.in);

		System.out.print("연도를 입력하세요 : ");
		x = sc.nextInt();

		boolean y = (x % 4 == 0 && x % 100 != 0) || (x % 400 == 0) ? true : false;
		

		/*
		 * 해당 방법을
		 * 
		 * String checker = (x % 4 == 0 && x % 100 != 0) || (x % 400 == 0) ? "윤년" : "평년";
		 * 
		 * 이렇게 하시면 더 좋을 것 같아요!
		 * */
		System.out.print(y);

		sc.close();


		
		
//		int x;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("연도를 입력하세요 : ");
//		x = sc.nextInt();
//		
//		if((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)) {
//			System.out.print("입력받은 연도는 '윤년' 입니다.");
//		}else {
//			System.out.print("입력받은 연도는 윤년이 아닙니다.");
//		}
//
//		sc.close();
	}

}

