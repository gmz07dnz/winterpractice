package week03;

import java.util.Scanner;

public class StringMethods {

	/*
	 * StringMethods
       String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
       Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
      
​
      ORNEK:
​
       INPUT  :  goat
                       photo
                       ghost
                       kalem
​
​
       OUTPUT:  gat
                         hoto
                         ghost
                         lem
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string giriniz");
		String str = scan.nextLine();

		if (str.startsWith("gh")) {
			System.out.println(str);
		}else if(str.startsWith("g")) {
			System.out.println(str.substring(0,1)+ str.substring(2));
		}else if(str.charAt(1) == 'h') {
			System.out.println(str.substring(1));
		}
		scan.close();
	}
	


}
