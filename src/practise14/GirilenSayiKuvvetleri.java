package practise14;

import java.util.Scanner;

public class GirilenSayiKuvvetleri {

	public static void main(String[] args) {
		int sayi;
		Scanner scan=new Scanner(System.in);
		System.out.println("Sayi girin:");
		sayi=scan.nextInt();
		for(int i=0;i<=sayi;i++) {
			System.out.println("Sayinin 4 kuvvetleri:"+i+"^4"+" : "+Math.pow(i, 4));
			System.out.println("Sayinin 5 kuvvetleri:"+i+"^5"+" : "+Math.pow(i, 5));
		}
	}

}
