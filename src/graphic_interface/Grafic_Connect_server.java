package graphic_interface;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import sql_Logic.Action_connect;

public class Grafic_Connect_server extends JFrame{
	private  String login;
	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	private  String password;
	private static final int WEIGHT = 370;
	private static final int HEIGHT = 150;
	
	public Grafic_Connect_server() {
	
		JFrame connect_frame = new JFrame("Подключение к серверу");
		connect_frame.setSize(WEIGHT, HEIGHT);
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((screenSize.getWidth() - connect_frame.getWidth()) / 2);
		int y = (int) ((screenSize.getHeight() - connect_frame.getHeight()) / 2);
		connect_frame.setBounds(x, y, connect_frame.getWidth(), connect_frame.getHeight());
	
		connect_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel(new BorderLayout(1,4));
		JPanel panel_top = new JPanel(new GridLayout(2,2,10,5));
		JPanel panel_bottom = new JPanel(new GridLayout(1,4,115,5));
		JPanel panel_right = new JPanel(new GridLayout(1, 1));
		
		

		
		panel_top.add(new JLabel("     Login"));
		JTextField login_field = new JTextField(20);
		
		panel_top.add(login_field);
		panel_top.add(new JLabel("     Password"));
		JPasswordField password_field = new  JPasswordField(20);
		
		panel_top.add(password_field);
		
		JButton button_connect = new JButton("Подключиться");
		button_connect.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Grafic_Connect_server.this.login= login_field.getText();
				String pass=  String.valueOf( password_field.getPassword());
				Action_connect  Aconect = new Action_connect(login_field.getText(), pass);
				
			}
		});
		panel_bottom.add(button_connect);
		
		
		
		
		panel.add(panel_top,BorderLayout.NORTH);
		panel.add(panel_bottom,BorderLayout.SOUTH);
		panel.add(panel_right,BorderLayout.EAST);
		connect_frame.add(panel);
		
		//connect_frame.setPreferredSize(new Dimension(WEIGHT, HEIGHT));
		connect_frame.setVisible(true);
		
		
		
		
	}

}
