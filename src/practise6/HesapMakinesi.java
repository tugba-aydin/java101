package practise6;
import java.util.Scanner;
public class HesapMakinesi {

	public static void main(String[] args) {
		int sayi1,sayi2,secim;
		Scanner scan=new Scanner(System.in);
		System.out.println("Birinci sayi:");
		sayi1=scan.nextInt();
		System.out.println("Ýkinci sayi:");
		sayi2=scan.nextInt();
		
		System.out.println("1-Toplama\n2-Cýkarma\n3-Carpma\n4-Bolme ");
		System.out.println("Secim yapinin: ");
		
		secim=scan.nextInt();
		
		switch(secim) {
		case 1:
			System.out.println("Toplam: "+(sayi1+sayi2));
			break;
		case 2:
			System.out.println("Cikarma: "+(sayi1-sayi2));
			break;
		case 3:
			System.out.println("Carpma: "+(sayi1*sayi2));
			break;
		case 4:
			System.out.println("Bolme: "+(sayi1/sayi2));
			break;
		default:
			System.out.println("Yanlis secim yaptiniz...");
		}
	}

}
