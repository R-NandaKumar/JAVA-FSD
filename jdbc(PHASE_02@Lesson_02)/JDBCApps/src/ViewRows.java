import java.sql.*;
public class ViewRows {

	public static void main(String[] args) {
		try
		{
		//Registering Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Making Connection 
		Connection  conObj  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mphasisnewdb", "root", "root");

		Statement stmt = conObj.createStatement();
		
		ResultSet  rs = stmt.executeQuery("Select * from student");
			while(rs.next())
			{
				System.out.println("Roll Number : " + rs.getInt("rollno"));
				System.out.println("Student name : " + rs.getString("sname"));
				System.out.println("Course : " + rs.getString("course"));
				System.out.println("Fees : " + rs.getFloat("fees"));
				System.out.println("-------------");
			}
			rs.close();
			conObj.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
