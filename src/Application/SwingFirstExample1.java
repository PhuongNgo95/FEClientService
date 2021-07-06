package Application;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingFirstExample1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingFirstExample1 window = new SwingFirstExample1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingFirstExample1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// Creating instance of JFrame
		JFrame frame = new JFrame("Đăng Nhập phần mềm thu phí tại làn");
		// Setting the width and height of frame
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/*
		 * Creating panel. This is same as a div tag in HTML We can create several
		 * panels and add them to specific positions in a JFrame. Inside panels we can
		 * add text fields, buttons and other components.
		 */
		JPanel panel = new JPanel();
		// adding panel to frame
		frame.getContentPane().add(panel);
		/*
		 * calling user defined method for adding components to the panel.
		 */
		placeComponents(panel);

		// Setting the frame visibility to true
		frame.setVisible(true);
	}

	private static void placeComponents(JPanel panel) {

		/*
		 * We will discuss about layouts in the later sections of this tutorial. For now
		 * we are setting the layout to null
		 */
		panel.setLayout(null);

		// Creating JLabel
		JLabel userLabel = new JLabel("User");
		/*
		 * This method specifies the location and size of component. setBounds(x, y,
		 * width, height) here (x,y) are cordinates from the top left corner and
		 * remaining two arguments are the width and height of the component.
		 */
		userLabel.setBounds(10, 45, 80, 25);
		panel.add(userLabel);

		/*
		 * Creating text field where user is supposed to enter user name.
		 */
		JTextField userText = new JTextField(20);
		userText.setBounds(100, 45, 165, 25);
		panel.add(userText);

		// Same process for password label and text field.
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 75, 80, 25);
		panel.add(passwordLabel);

		/*
		 * This is similar to text field but it hides the user entered data and displays
		 * dots instead to protect the password like we normally see on login screens.
		 */
		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 75, 165, 25);
		panel.add(passwordText);

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(116, 185, 212, 35);
		panel.add(lblNewLabel);

		JLabel lblNewLabel1 = new JLabel();
		lblNewLabel1.setBounds(116, 185, 212, 35);
		panel.add(lblNewLabel1);

		// Creating login button
		JButton loginButton = new JButton("login");
		loginButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (userText.getText().contentEquals("admin") && passwordText.getText().contentEquals("123")) {
//        			panel.add(lblNewLabel);
					lblNewLabel.setText("Đăng Nhập Thành Công");
//					panel.show();
				} else {
//					panel.add(lblNewLabel1);
					lblNewLabel1.setText("Sai Tên Đăng nhập Hoặc mật khẩu");
//					panel.show();
				}
			}
		});
		loginButton.setBounds(10, 105, 80, 25);
		panel.add(loginButton);
	}
}
