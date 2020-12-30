import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class Proton {

	private JFrame frame;
	private JTextField txtSalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proton window = new Proton();
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
	public Proton() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 522, 274);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Basic Salary =");
		lblNewLabel.setBounds(22, 32, 114, 25);
		frame.getContentPane().add(lblNewLabel);
		
		txtSalary = new JTextField();
		txtSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtSalary.setBounds(131, 32, 291, 25);
		frame.getContentPane().add(txtSalary);
		txtSalary.setColumns(10);
		
		JButton btnNewButton = new JButton("Proton X50");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Proton X50 :-"
						+ "\nMonthly installment: RM 950.00"
						+ "\nAccesories: 1. Sunroof & Sunshade \n2. Multimedia Screen - Full LCD Monitor \n3. Colour: Jet Grey/Red"
						+ "\nFeatures: 1.Auto Parking and Auto Start/Stop \n2.AI Technology");
			}
		});
		btnNewButton.setBounds(87, 84, 144, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Proton X70");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Proton X70 :-"
						+ "\nMonthly installment: RM 850.00"
						+ "\nAccesories: 1. Sunroof \n2. Multimedia Screen - Full LCD Monitor \n3. Colour: Red/White"
						+ "\nFeatures: 1. Auto Parking \n2. Auto Wipers");
			}
		});
		btnNewButton_1.setBounds(87, 124, 144, 31);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Proton Persona");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Proton Persona :-"
						+ "\nMonthly installment: RM 650.00"
						+ "\nAccesories: 1. Leather Seats Material \n2. Audio System - Touch Screen Monitor \n3. Colour: Red/Silver"
						+ "\nFeatures: 1.Eco Drive Assist \n2.Auto Headlamps");
			}
		});
		btnNewButton_2.setBounds(273, 84, 149, 31);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Proton Saga");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Proton Saga :-"
						+ "\nMonthly installment: RM 500.00"
						+ "\nAccesories: 1. Fabric Seats Material  \n2. Audio System - Standard Audio \n3. Colour: Red/Black"
						+ "\nFeatures: 1.Auto Headlamps");
			}
		});
		btnNewButton_3.setBounds(273, 124, 149, 31);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("Please choose car model: ");
		lblNewLabel_1.setBounds(22, 68, 222, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
