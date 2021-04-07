package week05;

import java.util.Arrays;

public class Array03 {

	  /* 
	    *Iki integer Array parametreli bir metod olusturun ve bu iki Array tek bir
		 * array olarak return etsin
		 *
		 * Ipucu : copyOf() metodunu kullanabilirsiniz
		 *
         * Input1={1,2,3,4}
         * Input2={5,6}
         *
         * Output={1,2,3,4,5,6}
         *
         */
	public static void main(String[] args) {

		int arr1[] = {1,2,3,4};
		int arr2[] = {5,6};
		
		System.out.println(Arrays.toString(tekArray(arr1,arr2)));;
	}
	
	
	public static  int[] tekArray(int[] arr1, int[] arr2) {
		int arrNew[] = Arrays.copyOf(arr1, arr1.length+arr2.length);
	
	for (int i =0 ; i< arr2.length; i++) {
		arrNew[arr1.length+i]=arr2[i];
		}
		return arrNew;
	}

}
