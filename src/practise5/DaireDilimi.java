package practise5;
import java.util.Scanner;

public class DaireDilimi {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Radius degerini giriniz");
		float radius=scan.nextFloat();
		System.out.println("Angle degerini giriniz");
		int angle=scan.nextInt();
		
		double result= (3.14 * (radius*radius) * angle) / 360;
		System.out.println("Alan: "+result);
	}
}
