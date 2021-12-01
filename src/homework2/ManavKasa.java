package homework2;
import java.util.Scanner;
public class ManavKasa {

	public static void main(String[] args) {
		
		int armut,elma,domates,muz,patlican;
		double toplam;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Armut Kac Kilo? :");
		armut=scan.nextInt();
		System.out.println("Elma Kac Kilo? :");
		elma=scan.nextInt();
		System.out.println("Domates Kac Kilo? :");
		domates=scan.nextInt();
		System.out.println("Muz Kac Kilo? :");
		muz=scan.nextInt();
		System.out.println("Patlican Kac Kilo? :");
		patlican=scan.nextInt();
		
		toplam=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5);
		System.out.println("Toplam Tutar: "+toplam+" TL");
	}

}
