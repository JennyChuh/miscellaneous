package dc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQL {
public static void main(String []args) throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/d1","root","123456");
	Statement statement = connection.createStatement();
	statement.executeUpdate("drop table if exists t1");
	statement.executeUpdate("create table t1(id int,name varchar(30))");
	statement.executeUpdate("insert into t1 values(20190001,'xiaoming')");
	ResultSet  resultSet = statement.executeQuery("select name from t1 " +
			"where id = '20190001'");
	while(resultSet.next()){
		System.out.println("results are :"+ resultSet.getString(1) +"!");
	}
	//Process process = Runtime.getRuntime().exec("cmd.exe /C start wmic process where name='cmd.exe' call terminate");
	//Runtime.getRuntime().exec("taskkill /f /im cmd.exe /t");
	Runtime.getRuntime().exec("c:/windows/system32/cmd.exe");
}
}
