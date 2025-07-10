package ObjectArrays;



public class JaggedArray {
	static void printArray(int c[][]) {
		
		System.out.println("Array of the elements are as follows ");
		
		for(int i =0; i<=c.length; i++) {
			
			for(int j =0; j<=c.length;j++) {
				
				System.out.println(c[i][j]);
			}
		}
	}

}
