package practise7;
import java.util.Scanner;
public class KullaniciGirisi {

	public static void main(String[] args) {
		String password,option,prevPassword;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Sifre: ");
		password=scan.nextLine();
		
		prevPassword=password;
		if(password.equals("java123")) {
			System.out.println("Giris yaptiniz..");
		}
		
		else {
			System.out.println("Yanlis sifre girdiniz. Sifre sifirlamak istiyor musunuz?: ");
			option=scan.nextLine();
			if(option.equals("Evet")) {
			  while(password!="java123") {	
				System.out.println("Yeni Sifre: ");
				password=scan.nextLine();
				if(password.equals(prevPassword)) {
					System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
				}
				
				else {
					System.out.println("Sifre olusturuldu");
					break;
				}
			}
			}
			else {
				System.out.println("Sifre sifirlamak istemediniz..");
			}
		}
	}

}
