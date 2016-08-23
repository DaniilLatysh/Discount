package Users;

import Data.ConnectDataBase;
import Data.*;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class User extends JFrame{
	

	private JLabel title, fname, lname, phone;
	private JTextField fnameIn, lnameIn, phoneIn;
	private JButton create, cancel;
	private JFrame frame;
	private Font font;
	private ConnectDataBase db;

	public User() throws Exception{
		initComponents();
	}
	
	
	private void initComponents() throws Exception {
		
		frame = new JFrame();
		setTitle("Create new Clients");
		setSize(400, 400);
		setResizable(false);
		setLocationRelativeTo(null);		
		
		
		font = new Font("Game", Font.BOLD, 15);
		Font fontB = new Font("Game", Font.BOLD, 15);
		
		title = new JLabel("Add new client: ");
		title.setBounds(50, 20, 300, 20);
		title.setFont(fontB);
		add(title);
		
		fname = new JLabel("Name: ");
		fname.setBounds(50, 50, 300, 20);
		add(fname);

		fnameIn = new JTextField();
		fnameIn.setBounds(50, 80, 300, 20);
		add(fnameIn);
		
		lname = new JLabel("Last Name: ");
		lname.setBounds(50, 110, 300, 20);
		add(lname);
		
		lnameIn = new JTextField();
		lnameIn.setBounds(50, 140, 300, 20);
		add(lnameIn);
		
		phone = new JLabel("Phone number: ");
		phone.setBounds(50, 170, 300, 20);
		add(phone);
		
		phoneIn = new JTextField();
		phoneIn.setBounds(50, 200, 300, 20);
		add(phoneIn);
		
		create = new JButton();
		create.setBounds(50, 270, 100, 20);
		create.setText("Create");
		add(create);
		
		cancel = new JButton();
		cancel.setBounds(250, 270, 100, 20);
		cancel.setText("Cancel");
		add(cancel);
		
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					dispose();
				}catch (Exception eCancel) {
					System.out.println(eCancel);
				}
			}
		});
		
		
		create.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					createUser(fnameIn.getText(), lnameIn.getText(), phoneIn.getText());
					
				}catch (Exception eCreate) {
					System.out.println(eCreate);
				}			
			}
		});
		
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

	}
	
	
	
	
	public void createUser(String firstName, String lastName, String phone){
		int id = 0;
		
		try{
			Data session = new Data();
			session.createTableClients();
			System.out.println(firstName + lastName + phone);
			
			db = new ConnectDataBase("jdbc:mysql://localhost/", "",
					"root", "5813");
			db.update("USE discountsystem;");
			db.update("INSERT INTO clients (FirstName, LastName, phone) "
					+ "VALUES ('"+firstName+"','"+lastName+"','"+phone+"');");
			dispose();
			
		}catch(Exception eCr){
			System.out.println(eCr + "!");
		}
			
	}
	
	
	
	
	

}