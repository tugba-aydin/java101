package practise4;
import java.util.Scanner;
public class TaksimetreHesaplama {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Km giriniz...");
		
		float km=scan.nextFloat();
		double tutar=10.0;
		
		tutar+=km*2.20;
		if(tutar<20.0) {
			tutar=20.0;
		}
		
		System.out.println("Taksimetre tutarý: "+tutar);
	}

}
