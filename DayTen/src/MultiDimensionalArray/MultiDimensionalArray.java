package MultiDimensionalArray;



class MLArray{
	
	public static void PrintArrays(int[] []arr) {
		for(int i =0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				
			}System.out.println();
		}
	}
}


public class MultiDimensionalArray {
	
	public static void main(String[] args) {
		int c[][]= {{10,20},{30,40},{50,60},{70,80}};
		System.out.println("No of Rows in Array:" +c.length);
		System.out.println(c[1].length);
		
		MLArray.PrintArrays(c);
	}

}
