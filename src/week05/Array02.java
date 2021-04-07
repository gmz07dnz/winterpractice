package week05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array02 {

	      /*
	      *  verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
		  * not kisa metodlar kullanmayiniz
          * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
          */
	
	
	public static void main(String[] args) {
		
		int  n = 3;
		
		int arr [] = {11,2,33,24,33,15,56,72,8};
		
		int temp =0;
		
		for (int i = 0; i<arr.length-1; i++) {
		for(int j = i+1; j<arr.length ; j ++) {
			 if(arr[i]>arr[j]) {
				 temp =arr[i];
				 arr[i] = arr[j];
				 arr[j] =temp;
			 }
		  }
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Max "+ n +" deger: ");
		for (int i =1; i<=n; i++) {
		
		System.out.println( arr[arr.length-i]);;
		}
		
		// Teacher's solving
		

		int arr1 [] = {2,5,3,9,8,12,6,7,4,11};
		int n1= 4;
		
		// bir list olusturun
		
		List <Integer> list = new ArrayList<>();
		
		// list elemanlarini ekleyiniz
		
		for(int each : arr1) {
			list.add(each);
		}
		
		List <Integer> newList = new ArrayList<>();
		
		int count = 1;
		
		while(count <= n1) {
			
			int max = list.get(0); // max = listin ilk elemani
			
			for(int i = 0 ; i < list.size() ; i++) {
				if(list.get(i) > max) {
					max = list.get(i);
				}
			}
			
			newList.add(max);
			list.remove(list.indexOf(max)); // ayni buyuk sayi olmamasi icin bulunan en buyuk sayi ilk listten silinir
			count++;
			
		}
		
		System.out.println("Arrayin ilk "+ n1+ " maksimum degerleri " + newList);
	}
		

	}


