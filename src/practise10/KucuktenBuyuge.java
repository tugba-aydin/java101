package practise10;

import java.util.Scanner;

public class KucuktenBuyuge {

	public static void main(String[] args) {
		int sayi1,sayi2,sayi3,enb,enk,mid;
	      Scanner scan=new Scanner(System.in);
	      System.out.println("Sayi1 degeri: ");
	      sayi1=scan.nextInt();
	      System.out.println("Sayi2 degeri: ");
	      sayi2=scan.nextInt();
	      System.out.println("Sayi3 degeri: ");
	      sayi3=scan.nextInt();
	      
	      if ((sayi1<sayi2)&&(sayi1<sayi3))
	      {
	          enk=sayi1;
	          if(sayi2<=sayi3){
	              mid=sayi2;
	              enb=sayi3;
	          }
	          else{
	              mid=sayi3;
	              enb=sayi2;
	          }
	      }
	      else if((sayi2<sayi1)&&(sayi2<sayi3)) 
	      {
	          enk=sayi2;
	          if(sayi1<=sayi3){
	              mid=sayi1;
	              enb=sayi3;
	          }
	          else{
	              mid=sayi3;
	              enb=sayi1;
	          }
	      }
	      else{
	          enk=sayi3;
	          if(sayi1<=sayi2){
	              mid=sayi1;
	              enb=sayi2;
	          }
	          else{
	              mid=sayi2;
	              enb=sayi1;
	          }
	      }
	      System.out.println("Kucukten buyuge sayilar...: "+enk+" "+mid+" "+enb);

	}

}
