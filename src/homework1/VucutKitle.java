package homework1;
import java.util.Scanner;

public class VucutKitle {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen boyunuzu (metre cinsinden) giriniz : ");
		float boy=scan.nextFloat();
		
		System.out.println("Lutfen kilonuzu giriniz : ");
		float kilo=scan.nextFloat();
		
		double sonuc=kilo/(boy*boy);
		System.out.println("Vucut Kitle Indeksiniz : "+sonuc);
	}
}
