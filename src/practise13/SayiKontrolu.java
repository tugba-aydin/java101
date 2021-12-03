package practise13;
import java.util.Scanner;
public class SayiKontrolu {

	public static void main(String[] args) {
		int sayi,toplam=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Sayi giriniz: ");
		sayi=scan.nextInt();
		while(sayi%2==0) {
			if(sayi%4==0) {
				toplam+=sayi;
			}
			System.out.println("Sayi giriniz: ");
			sayi=scan.nextInt();
		}
		System.out.println("Toplam: "+toplam);
	}

}
