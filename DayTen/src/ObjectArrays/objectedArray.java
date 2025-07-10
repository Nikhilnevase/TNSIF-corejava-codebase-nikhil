package ObjectArrays;

public class objectedArray {
	
	public static void main(String[] args) {
		
		
		Student []arr;
		arr= new Student [5];
		arr[0]= new Student(101,"nikhil");
		arr[1]= new Student(102,"nikhil");
		arr[2]= new Student(103,"nikhil");
		arr[3]= new Student(104,"nikhil");
		arr[4]= new Student(105,"nikhil");
		
		for(int i=0; i<=arr.length-1;i++) {
			
			System.out.println("Details of Student :" +arr[i].getName()+" "+arr[i].getRollNo());
		}
		
	}

}
