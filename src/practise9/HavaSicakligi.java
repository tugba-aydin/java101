package practise9;

import java.util.Scanner;

public class HavaSicakligi {

	public static void main(String[] args) {
		int isi;
	      String sonuc="";
	      Scanner scan=new Scanner(System.in);
	      System.out.println("Sicaklik girin: ");
	      isi=scan.nextInt();
	      
	      switch(isi){
	          case 5:
	          case 6:
	          case 7:
	          case 8:
	          case 9:
	          case 10:
	          case 11:
	          case 12:
	          case 13:
	          case 14:
	              sonuc="Sinemaya gidebilirsiniz";
	              break;
	          case 15:
	          case 16:
	          case 17:
	          case 18:
	          case 19:
	          case 20:
	          case 21:
	          case 22:
	          case 23:
	          case 24:
	          case 25:
	              sonuc="Piknige gidebilirsiniz";
	              break;
	          default:
	              sonuc=isi<5?"Kayak yapabilirsiniz":"Yuzmeye gidebilirsiniz";
	      }
	      
	      System.out.println(sonuc);

	}

}
