package practise2;
import java.util.Scanner;
public class KDVTutari {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double miktar,KDVliFiyat,KDVTutari;
		
		System.out.println("Bir tutar giriniz");
		miktar=scan.nextDouble();
		
		if(miktar>=0&&miktar<=1000) {
			KDVTutari=miktar*0.18;
			KDVliFiyat=KDVTutari+miktar;
			System.out.println("KDV tutarý: "+KDVTutari+" KDVli fiyat: "+KDVliFiyat);
		}
		else if(miktar>1000) {
			KDVTutari=miktar*0.08;
			KDVliFiyat=KDVTutari+miktar;
			System.out.println("KDV tutarý: "+KDVTutari+" KDVli fiyat: "+KDVliFiyat);
		}
		else {
			System.out.println("Hatalý tutar giriþi!");
		}
	}

}
