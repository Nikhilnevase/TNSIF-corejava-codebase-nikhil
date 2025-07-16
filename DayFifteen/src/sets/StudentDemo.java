package sets;

import java.util.HashSet;
import java.util.Set;

public class StudentDemo {
	
	public static void main(String[] args) {
		
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(101,"nikhil",90.98));
		set.add(new Student(102,"nilesh",80.98));
		set.add(new Student(103,"nevase",90.98));
		set.add(new Student(101,"nikhil",90.98));
		set.add(new Student(104,"Sushant",85.98));
		set.add(new Student(105,"Amay",87.98));
		set.add(new Student(101,"nikhil",90.98));
		
		
	}

}
