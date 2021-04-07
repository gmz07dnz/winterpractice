package week05;

public class MultiDimensionalArray01 {

	
	      /*
	       *  Girilen Multidimensional arraydeki cift sayilari toplayan bir method  yaziniz
         *
         *
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         *
         *
         */
	
	public static void main(String[] args) {
		
		int multiArr[][] =  {{1,3,6},{2,8},{5,7,9,14}};

		ciftMultiArrSum(multiArr);
		
		
	}

		public static void ciftMultiArrSum(int[][] multiArr) {
		
			int sum = 0;
			for(int i= 0; i< multiArr.length; i++) {
				for (int j=0; j<multiArr[i].length; j++) {
					if (multiArr[i][j] %2 ==0) {
					sum += multiArr[i][j];
					}
				}
			}
			
			System.out.println("Multdimensional array cift  elemanlarinin toplami: " + sum);
			
			
		}

}
