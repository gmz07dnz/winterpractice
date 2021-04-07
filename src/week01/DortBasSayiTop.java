package week01;

import java.util.Scanner;

public class DortBasSayiTop {

	    /*
	      * Kullanicinin girdigi 4 basamakli sayinin rakamlari toplamini veren programi yaziniz.
	     */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" 4 basamakli bir sayi giriniz");
		int sayi = scan.nextInt();
		
		if(sayi>999 && sayi<10000) {
			
			int sumBas = 0;
			while (sayi!=0) {
				int bas = sayi%10;
				sayi /=10;
				sumBas +=bas;
			}
			
			System.out.println("Basamaklarinin toplami: " + sumBas);
			
		}else {
			System.out.println("Lutfen 4 basamakli bir sayi giriniz");
		}
		
		
		scan.close();
	}
}
