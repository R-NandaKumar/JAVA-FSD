import java.sql.*;
import java.util.Scanner;
public class InsertRowDynamically {

	public static void main(String[] args) {
		try
		{
		//Registering Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Making Connection 
		Connection  conObj  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mphasisnewdb", "root", "root");
//INSERT INTO STUDENT(SNAME, COURSE, FEES) VALUES('PAVAN', 'JAVA', 15000.00)

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		String sname = sc.next();
		System.out.println("Student Course : ");
		String course = sc.next();
		System.out.println("Course Fees : ");
		float fees = sc.nextFloat();
		
		String  inscmd = "INSERT INTO STUDENT(SNAME, COURSE, FEES) VALUES('";
		inscmd = inscmd + sname + "','" + course + "'," + fees + ")";

		System.out.println(inscmd);
		
				Statement stmt = conObj.createStatement();
				stmt.executeUpdate(inscmd);
				System.out.println("Row is Added....");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
