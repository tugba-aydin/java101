package practise1;
import java.util.Scanner;
public class Not_Ortalamasi {

	public static void main(String[] args) {
		int matematik, fizik,kimya, turkce, tarih, muzik;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Lütfen matematik notunuzu giriniz");
		matematik=scanner.nextInt();
		
		System.out.println("Lütfen fizik notunuzu giriniz");
		fizik=scanner.nextInt();
		
		System.out.println("Lütfen kimya notunuzu giriniz");
		kimya=scanner.nextInt();
		
		System.out.println("Lütfen türkçe notunuzu giriniz");
		turkce=scanner.nextInt();
		
		System.out.println("Lütfen tarih notunuzu giriniz");
		tarih=scanner.nextInt();
		
		System.out.println("Lütfen müzik notunuzu giriniz");
		muzik=scanner.nextInt();
		
		int toplamNot=matematik+fizik+kimya+turkce+tarih+muzik;
		double ortalama=(toplamNot)/6;
		
		System.out.println(ortalama>60?"Geçti":"Kaldý");
		
	}

}
