package practise11;

import java.util.Scanner;

public class BurcBul {

	public static void main(String[] args) {

		  int gun,ay; 
		  Scanner scan = new Scanner(System.in);
		  System.out.print("Dogum Tarihinizin Gun Degerini giriniz = ");
		  gun=scan.nextInt();
		  System.out.print("Dogum Tarihinizin Ayini Yaziniz = ");
		  ay=scan.nextInt();
		  
		  if((gun>=21 && ay==1) || (gun<=19 && ay==2))
		   System.out.println("Burcunuz = Kova");
		  else if((gun>=20 && ay==2) || (gun<=20 && ay==3))
		   System.out.println("Burcunuz = Balik");
		  else if((gun>=21 && ay==3) || (gun<=20 && ay==4))
		   System.out.println("Burcunuz = Koc");
		  else if((gun>=21 && ay==4) || (gun<=20 && ay==5))
		   System.out.println("Burcunuz = Boga");
		  else if((gun>=21 && ay==5) || (gun<=21 && ay==6))
		   System.out.println("Burcunuz = Ikizler");
		  else if((gun>=22 && ay==6) || (gun<=23 && ay==7))
		   System.out.println("Burcunuz = Yengec");
		  else if((gun>=24 && ay==7) || (gun<=23 && ay==8))
		   System.out.println("Burcunuz = Aslan"); 
		  else if((gun>=24 && ay==8) || (gun<=23 && ay==9))
		   System.out.println("Burcunuz = Basak"); 
		  else if((gun>=24 && ay==9) || (gun<=23 && ay==10))
		   System.out.println("Burcunuz = Terazi");
		  else if((gun>=24 && ay==10) || (gun<=22 && ay==11))
		   System.out.println("Burcunuz = Akrep");
		  else if((gun>=23 && ay==11) || (gun<=21 && ay==12))
		   System.out.println("Burcunuz = Yay");
		  else if((gun>=22 && ay==12) || (gun<=20 && ay==1))
		   System.out.println("Burcunuz = Oglak");
		  else 
		   System.out.println("Yanlis bir deger girdiniz");

	}

}
