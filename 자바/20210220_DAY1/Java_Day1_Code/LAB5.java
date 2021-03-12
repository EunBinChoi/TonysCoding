import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		double x, y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("마일을 입력하세요 : ");
		x = sc.nextDouble();
		
		y = x * 1.609;
		
		System.out.print((int)x + "마일은 " + y + "킬로미터 입니다.");
		/*
		 * 여기서 x를 int로 바꾸신 이유가 있을까요?
		 * 
		 * 만약 본인이 마일을 입력받을 떄 실수형으로 받으면
		 * 굳이 출력을 int로 해줄 필요는 없으실 것 같아요!
		 * 
		 * 제 실행결과에 저렇게 나와있어서 그렇게 하신 것 같은데
		 * 나머지 부분은 다 좋습니다!
		 * 
		 * 변수명을 좀 더 의미있게 지어주시면 좋을 것 같아요!
		 * 예를 들어 x => mile, y => km
		 * 
		 * */
		sc.close();
	}

}
