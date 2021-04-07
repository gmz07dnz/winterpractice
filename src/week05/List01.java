package week05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List01 {

	/*
	    * Kullanicidan int  list uzunlugunu isteyin
		 * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
		 * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
		 *
		 * n = 5 icin (listin uzunlugu);
		 * input { 1 , 2 , 2 , 3 , 4}
		 * output {2}
		 *
		 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen list uzunlugunu giriniz");
		int length = scan.nextInt();
		System.out.println("Lütfen list uzunlugu kadar int eleman giriniz");
		List<Integer> list = new ArrayList<>();
		for (int i =0; i<length; i++) {
			list.add(scan.nextInt());
		}
		
		tekrarliEleman(list);
		System.out.println(tekrarliEleman(list));

		scan.close();
	}

	public  static List<Integer> tekrarliEleman(List<Integer> list) {
		List<Integer> tekrarliElmnList = new ArrayList<>();
		
		for (int w : list) {
			if ((list.indexOf(w) !=list.lastIndexOf(w)) && (!tekrarliElmnList.contains(w))) {
				tekrarliElmnList.add(w);
			}
		}
	
		return tekrarliElmnList;
	}

}
