package homework3;

import java.util.Scanner;

public class UcakBileti {

	public static void main(String[] args) {
	    int mesafe,yas,yolculukTipi;
	      double normalTutar=0,yasindirim=0,yolculukindirim=0,indirim=0,toplam=0;
	      Scanner scan=new Scanner(System.in);
	      
	      System.out.println("Mesafeyi km turunden giriniz : ");
	      mesafe=scan.nextInt();
	      System.out.println("Yasinizi giriniz : ");
	      yas=scan.nextInt();
	      System.out.println("Yolculuk tipini giriniz (1 => Tek Yon , 2 => Gidis Donus ): ");
	      yolculukTipi=scan.nextInt();
	      
	      if (mesafe>=1){
	          normalTutar=mesafe*0.10;
	          if(yas<12){
	              yasindirim=normalTutar*0.50;
	          }
	          else if(yas>=12&&yas<=24){
	              yasindirim=normalTutar*0.10;
	          }
	          else if(yas>65){
	              yasindirim=normalTutar*0.30;
	          }
	          else yasindirim=0;
	          
	          indirim=normalTutar-yasindirim;
	          
	          switch(yolculukTipi){
	              case 1:
	                  break;
	              case 2:
	                  yolculukindirim=indirim*0.20;
	                  break;
	              default:
	                  System.out.println("Hatali veri girdiniz.");
	          }
	          
	          if(yolculukindirim>0){
	              toplam=(indirim-yolculukindirim)*2;
	          }
	          else toplam=indirim;
	          
	          System.out.println("Toplam tutar: "+toplam+" TL");
	      } 
	      else System.out.println("Hatali veri girdiniz.");

	}

}
