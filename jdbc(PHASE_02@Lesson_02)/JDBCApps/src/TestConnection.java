import java.sql.*;
public class TestConnection {

	public static void main(String[] args) {
		try
		{
		//Registering Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Making Connection 
		Connection  conObj  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mphasisnewdb", "root", "root");

		if(conObj!=null)
			System.out.println("Connected.....");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
