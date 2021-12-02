package practise8;

import java.util.Scanner;

public class SinifGecme {

	public static void main(String[] args) {
	      int matematik,fizik,turkce,kimya,muzik;
	      double ortalama=0;
	      int sayac=0;
	      Scanner scan=new Scanner(System.in);
	      
	      System.out.println("Matematik notu: ");
	      matematik=scan.nextInt();
	      System.out.println("Fizik notu: ");
	      fizik=scan.nextInt();
	      System.out.println("Turkce notu: ");
	      turkce=scan.nextInt();
	      System.out.println("Kimya notu: ");
	      kimya=scan.nextInt();
	      System.out.println("Muzik notu: ");
	      muzik=scan.nextInt();
	      
	      if(matematik>=0&&matematik<=100)
	      {
	          ortalama+=matematik;
	          sayac++;
	      } 
	      if(fizik>=0&&fizik<=100) {      
	          ortalama+=fizik;
	          sayac++;
	      }
	      if(turkce>=0&&turkce<=100){
	          ortalama+=turkce;
	          sayac++;
	      } 
	      if(kimya>=0&&kimya<=100) {      
	          ortalama+=kimya;
	          sayac++;
	      }
	      if(muzik>=0&&muzik<=100) {      
	          ortalama+=muzik;
	          sayac++;
	      }
	      
	      System.out.println("Ortalama: "+(ortalama/sayac));
	}

}
