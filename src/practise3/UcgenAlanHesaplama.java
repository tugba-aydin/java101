package practise3;
import java.util.Scanner;
public class UcgenAlanHesaplama {

	public static void main(String[] args) {
		int a,b,c;
		double alan,u;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("1. kenar: ");
		a=scan.nextInt();
		System.out.println("2. kenar: ");
		b=scan.nextInt();
		System.out.println("3. kenar: ");
		c=scan.nextInt();
		
		u=(a+b+c)/2;
		alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
		
		System.out.println(alan);
	}
}
