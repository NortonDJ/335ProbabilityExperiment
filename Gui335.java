import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui335 {
    ExperimentController ec;
	private int number_of_trials;
	private int number_of_students;
	private int number_of_allowance;

	private JFrame frame;
	private JTextField trialNumber;
	private JTextField studentNumber;
	private JTextField allowanceNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui335 window = new Gui335();
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
	public Gui335() {
		initialize();
		ec = new ExperimentController();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Trials:");
		lblNewLabel.setBounds(6, 6, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("Students:");
		label.setBounds(6, 34, 61, 16);
		frame.getContentPane().add(label);
		
		JLabel lblAllowance = new JLabel("Allowance:");
		lblAllowance.setBounds(6, 62, 73, 16);
		frame.getContentPane().add(lblAllowance);
		
		JLabel lblWheelFile = new JLabel("Wheel File:");
		lblWheelFile.setBounds(6, 90, 73, 16);
		frame.getContentPane().add(lblWheelFile);
		
		JLabel lblOddFile = new JLabel("Odd File:");
		lblOddFile.setBounds(6, 118, 61, 16);
		frame.getContentPane().add(lblOddFile);
		
		JButton btnStartSimulation = new JButton("Start Simulation");
		btnStartSimulation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number_of_trials = Integer.parseInt(trialNumber.getText());
				number_of_students = Integer.parseInt(studentNumber.getText());
				number_of_allowance = Integer.parseInt(allowanceNumber.getText());
				ec.run(number_of_trials, number_of_students, number_of_allowance, "config_wheel_1.txt", "config_odds_1.txt");
			}
		});
		btnStartSimulation.setBounds(81, 195, 133, 29);
		frame.getContentPane().add(btnStartSimulation);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(226, 195, 117, 29);
		frame.getContentPane().add(btnExit);
		
		trialNumber = new JTextField();
		trialNumber.setBounds(79, 1, 130, 26);
		frame.getContentPane().add(trialNumber);
		trialNumber.setColumns(10);
		
		studentNumber = new JTextField();
		studentNumber.setBounds(81, 29, 130, 26);
		frame.getContentPane().add(studentNumber);
		studentNumber.setColumns(10);
		
		allowanceNumber = new JTextField();
		allowanceNumber.setBounds(81, 57, 130, 26);
		frame.getContentPane().add(allowanceNumber);
		allowanceNumber.setColumns(10);
		
		JLabel lblConfigwheeltxt = new JLabel("config_wheel_1.txt");
		lblConfigwheeltxt.setBounds(81, 90, 123, 16);
		frame.getContentPane().add(lblConfigwheeltxt);
		
		JLabel lblConfigoddstxt = new JLabel("config_odds_1.txt");
		lblConfigoddstxt.setBounds(79, 118, 125, 16);
		frame.getContentPane().add(lblConfigoddstxt);
	}
}
