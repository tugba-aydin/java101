package practise1;
import java.util.Scanner;
public class Not_Ortalamasi {

	public static void main(String[] args) {
		int matematik, fizik,kimya, turkce, tarih, muzik;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("L�tfen matematik notunuzu giriniz");
		matematik=scanner.nextInt();
		
		System.out.println("L�tfen fizik notunuzu giriniz");
		fizik=scanner.nextInt();
		
		System.out.println("L�tfen kimya notunuzu giriniz");
		kimya=scanner.nextInt();
		
		System.out.println("L�tfen t�rk�e notunuzu giriniz");
		turkce=scanner.nextInt();
		
		System.out.println("L�tfen tarih notunuzu giriniz");
		tarih=scanner.nextInt();
		
		System.out.println("L�tfen m�zik notunuzu giriniz");
		muzik=scanner.nextInt();
		
		int toplamNot=matematik+fizik+kimya+turkce+tarih+muzik;
		double ortalama=(toplamNot)/6;
		
		System.out.println(ortalama>60?"Ge�ti":"Kald�");
		
	}

}
