package week05;

import java.util.Scanner;

public class Array01 {

	/*
	* Kullanicidan int array uzunlugunu isteyin
	 * Arrayin uzunlugu kadar kullanicidan array elemanlarini girmesini isteyin
	 * Array elemanlarini toplamini return eden metod yazin
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen array uzunlugunu giriniz");
		int length = scan.nextInt();
		System.out.println("Lütfen array uzunlugu kadar int eleman giriniz");
		int array[] = new int[length];
		
		int i = 0;
		while(i<length) {
			array[i] = scan.nextInt();
		i++;
		}
		
		sumArray(array);
		System.out.println("Array toplami: "+ sumArray(array));
		
		scan.close();
	}
	
	public static int sumArray(int[] array) {
		int sum =0;
		for (int w : array) {
			sum += w;
		}
		return sum;
	}

}
