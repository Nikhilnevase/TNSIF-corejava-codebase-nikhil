package jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTable {

	public static void main(String[] args) {
		
		try {
			//step 1: Load or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is load successfully");
			
			//step 2: create connection 
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dypatil", "root", "root");
			System.out.println("Connection created successfully");
			
			//step 3: create a statement 
			Statement stmt=con.createStatement();
			
			System.out.println("Statement created succesfully");
			
			//step 4: write a query
			
			String q="create table student(stdid int, name varchar(20), subject varchar(20), duration double)";
			
			
			boolean s=stmt.execute(q);
			
			
			//Insert Data in Table
			
			String q1="insert into student values(104, 'Aditya','Java',89.97)";
		
		  boolean s1=stmt.execute(q1);
			
		  
		  // Take input from user and Insert it to Table using Prepared statement
			Scanner sc=new Scanner(System.in);
			int id=0;
			String name="";
			String subject="";
		    double duration=0.0;
			PreparedStatement psmt=null;
			
			System.out.println("Enter the Student Id: ");
			id=sc.nextInt();
			System.out.println("Enter the Student name: ");
			name=sc.next();
			System.out.println("Enter the Subject: ");
			subject=sc.next();
			System.out.println("Enter the course duration: ");
			duration=sc.nextDouble();
			psmt=con.prepareStatement("insert into student values(?,?,?,?)");
			psmt.setInt(1,id);
			psmt.setString(2, name);
			psmt.setString(3, subject);
			psmt.setDouble(4, duration);
			int row =psmt.executeUpdate();
			System.out.println(row+" row affected");
			 
			// Alter the Table to Assign primary key
          String q2="alter table student add primary key(stdid)";
			int s2=stmt.executeUpdate(q);
			
			// Delete element from table 
			
            String q3="delete from student where stdid=?";
		    boolean s3=stmt.execute(q3);
		    
		    // update data from table
	         String q4="update student set subject='DBMS' where stdid=104";
			  boolean s4=stmt.execute(q4);
			  
			  
			  //ResultSet 
			  
			/*  java.sql.ResultSet rs=stmt.executeQuery("select * from student");
				System.out.println("stdid\t name \t subject \t duration");
				
				
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+
						"\t"+rs.getString(3)+"\t"+rs.getDouble(4));
			}*/
			
			
		}
		catch(Exception e)
		{
			System.err.println(e);
		}

	}

}
