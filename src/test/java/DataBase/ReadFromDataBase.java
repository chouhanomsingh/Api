package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadFromDataBase {

	public static void main(String[] args) throws SQLException {
//		//step1:create driver instance
//		Driver driver=new Driver();
//		
//		//step2:Register to JDBC driver
//		DriverManager.registerDriver(dbdriver);
		
		//step3:Establish JDBC connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceselenium","root","root");
		
		//step4:create statement
		Statement statement=connection.createStatement();
		
		//step:5 Execute Query to fetch data
		ResultSet result=statement.executeQuery("select * from student");
		
		while(result.next()) {
			System.out.println(result.getInt("sid")+"/t"+result.getString("sname")+"/t"+result.getString("phno")+"/t"+result.getString("course"));
			
		}
		//step6:close database
		connection.close();
		
	}

}
