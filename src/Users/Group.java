package Users;

import java.awt.*;

import javax.swing.*;

public class Group extends JFrame{
	
	private JLabel nameGroup;
	private JTextField nameGroupIn;

	public Group() throws Exception{
		initComponents();
	}
	
	private void initComponents() throws Exception {
		
		JFrame frame = new JFrame();
		setTitle("Create new Clients Group");
		setSize(400, 200);
		setResizable(false);
		setLocationRelativeTo(null);		
		
		
		Font font = new Font("Game", Font.BOLD, 15);
		
		nameGroup = new JLabel("Name Group: ");
		nameGroup.setBounds(50, 20, 300, 20);
		add(nameGroup);

		nameGroupIn = new JTextField();
		nameGroupIn.setBounds(50, 50, 300, 20);
		add(nameGroupIn);
		
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

	}
}
