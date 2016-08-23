package frame;

import java.awt.Font;
import Data.Data;
import Users.Group;
import Users.User;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.TableModel;


public class MainFrame extends JFrame {
	
	private JPanel panel;
	
	Data showData = new Data();

	
	
	
	public void registerPanel() throws Exception
	{
		initComponents();
	}

	private void initComponents() {
		
		Font fontB = new Font("FontB", Font.BOLD, 11);
		Font fontI = new Font("FontI", Font.ITALIC, 15);
		
		panel = new JPanel();
		setTitle("Discount Terminal");
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		

		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		fileMenu.setFont(fontB);

		JMenuItem addUser = new JMenuItem("New Client");
		addUser.setFont(fontB);
		fileMenu.add(addUser);

		addUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					User user = new User();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		JMenuItem addGroup = new JMenuItem("New Group Clients");
		addGroup.setFont(fontB);
		fileMenu.add(addGroup);

		addGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Group newGroup = new Group();
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.setFont(fontB);
		fileMenu.add(exitItem);

		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		

		fileMenu.addSeparator();
		menuBar.add(fileMenu);

		

		
		add(menuBar);
		setJMenuBar(menuBar);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		
		
	}
	
}
