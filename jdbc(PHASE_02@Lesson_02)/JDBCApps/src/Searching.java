import java.sql.*;
import java.util.Scanner;
public class Searching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll Number : ");
		int rno = sc.nextInt();
		try
		{
		//Registering Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Making Connection 
		Connection  conObj  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mphasisnewdb", "root", "root");

		Statement stmt = conObj.createStatement();
		
		ResultSet  rs = stmt.executeQuery("Select * from student where rollno="+rno);
			
			if(rs.next())
			{
				System.out.println("Roll Number : " + rs.getInt("rollno"));
				System.out.println("Student name : " + rs.getString("sname"));
				System.out.println("Course : " + rs.getString("course"));
				System.out.println("Fees : " + rs.getFloat("fees"));
			}
			else
				System.out.println("Student Not Found.....");
			rs.close();
			conObj.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
