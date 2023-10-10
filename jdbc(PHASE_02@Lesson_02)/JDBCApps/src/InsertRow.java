import java.sql.*;
public class InsertRow {

	public static void main(String[] args) {
		try
		{
		//Registering Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Making Connection 
		Connection  conObj  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mphasisnewdb", "root", "root");
//INSERT INTO STUDENT(SNAME, COURSE, FEES) VALUES('PAVAN', 'JAVA', 15000.00)

		Statement stmt = conObj.createStatement();
		stmt.executeUpdate("INSERT INTO STUDENT(SNAME, COURSE, FEES) VALUES('PAVAN', 'JAVA', 15000.00)");
		System.out.println("Row is Added....");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
