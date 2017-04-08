package sql_Logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import iterface.action_command;

public class SQL_action implements action_command{
	private Statement stat;
	private String name_bd = Connection_MySql.getName_BD();
	
	public SQL_action(Statement stat) {
	this.stat = stat;
	}
	
	@Override
	public String[] getAllTable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		try {
			ResultSet name = stat.executeQuery("SELECT login FROM User;");
			while (name.next()){
				System.out.println(name.getString(1));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String getPrivilege() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(int id , String login, String Password) {
		try {
			System.out.println("INSERT INTO User (id, login, password) VALUES (" + id+",'"+ login+"','"+Password+"');");
			stat.executeUpdate("INSERT INTO User (id, login, password) VALUES (" + id+",'"+ login+"','"+Password+"');");
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		
	}

	@Override
	public void setPrivilege() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		
	}

}
