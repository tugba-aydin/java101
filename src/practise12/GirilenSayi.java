package practise12;
import java.util.Scanner;
public class GirilenSayi {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sayi,sayac=0,i=0;
		double ortalama=0;
		
		System.out.println("Sayi girin: ");
		sayi=scan.nextInt();
		while(i<=sayi) {
			if(i%3==0&&i%4==0) {
				ortalama+=i;
				sayac++;
			}
			i++;
		}
		ortalama=ortalama/sayac;
		System.out.println("Ortalama: "+ortalama);
	}

}
