import java.util.Scanner;
public class StandardWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double height, weight;
		double standardWeight;
		System.out.print("Input Height : ");
		height = input.nextDouble();
		System.out.print("Input Weight : ");
		weight = input.nextDouble();
		standardWeight = (height - 100) * 0.9;
		
		// 저체중인지, 표준인지, 과체중인지 판단하는 프로그램
		if (weight > standardWeight) {
			System.out.println("Larger than Standard Weight");
			
		}
		else if (weight < standardWeight) {
			System.out.println("Lower than Standard Weight");
			
		}
		else {
			System.out.println("Standard Weight!! (good)");
		}
		
	}

}
