package iterface;

public interface action_command {
	
	 String[] getAllTable();
	 String getName();
	 String getPrivilege();
	 
	 void addUser();
	 void setPrivilege();
	void addUser(int id, String Name, String Password);

}
