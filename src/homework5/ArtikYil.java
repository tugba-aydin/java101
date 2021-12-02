package homework5;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		int yil;
		Scanner scan = new Scanner(System.in);
		System.out.println("Yil giriniz: ");
		yil = scan.nextInt();

		if (yil % 4 == 0) {
			if (yil % 100 == 0) {
				if (yil % 400 == 0)
					System.out.println(yil + " artik yildir.");
				else
					System.out.println(yil + " artik yil degildir.");
			} else
				System.out.println(yil + "  artik yildir.");
		} else
			System.out.println(yil + " artik yil degildir.");
	}

}
