package sql_Logic;

import java.sql.Statement;

public class Action_connect {
	public Action_connect(String login, String pass) {
		// TODO Auto-generated constructor stub
	
	
		Connection_MySql connection = new Connection_MySql(login,pass);
		Statement statement_main = connection.connection_start();
	    SQL_action action = new SQL_action(statement_main);
	    //  action.getName();
	    //action.addUser(2,"test-PC", "12345");
	    connection.close_connection();
	}

}
