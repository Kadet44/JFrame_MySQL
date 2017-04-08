package sql_Logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection_MySql {
	private static  String url = "jdbc:mysql://localhost:3306/UserDB";
	private static  String user ;
	private static  String password ;
	private static String name_BD  = "db";
	
	public static String getName_BD() {
		return name_BD;
	}

	private static  java.sql.Connection con;
	private static Statement stmt;
	private static ResultSet rs;
	
	public Connection_MySql() {
		
	}
    
	public Connection_MySql(String user, String password) {
	//this.url = url;
	this.user = user;
	this.password = password;
		
	}
	
	public Statement connection_start(){
			
		try{
		
			con = DriverManager.getConnection(url,user,password);
			stmt = con.createStatement();
			//ResultSet inner_join = stmt.executeQuery("SELECT people.Name, departemt.Dep FROM people INNER JOIN departemt ON people.JoinId = departemt.DepId;");
			//stmt.executeUpdate("INSERT INTO db (id,price,name) VALUES (5,10,'first');");
			//rs = stmt.executeQuery(query);
			//ResultSet bd_select = stmt.executeQuery("select * from db;");
		
			/*while(inner_join. next()) {
				//int count = rs.getInt(1);
				//System.out.println("id = "+ count);
				System.out.println();
				System.out.print( inner_join.getString(1)+ " ");
				System.out.print( inner_join.getString(2)+ " ");
				//System.out.print( inner_join.getString(3)+ " ");
			}*/
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
		return stmt; 
			
	 }
	
	public void close_connection(){
		
		try { con.close();}catch (SQLException se){System.out.println("first exeption");}
		try { stmt.close();} catch (SQLException se) {System.out.println("second ex");	}
		//try{rs.close();}catch (SQLException se) { System.out.println("Third ex");	}
	}

}
