import java.awt.EventQueue;
//
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui_AddGreenSpace {
    ExperimentController ec;
    
	JFrame frame;
	private JTextField textField_additionalGreen;
	private JLabel lblNumberOfTrials;
	private JTextField textField_trials;
	private JLabel lblNumberOfStudents;
	private JTextField textField_students;
	private JLabel lblNumberOfAllowance;
	private JTextField textField_allowance;
	private JButton btnSimulation;

	private int number_of_trials;
    private int number_of_students;
    private int number_of_allowance;
    private int sizeOfGreen;
    private int number_of_additional_green_space;
    
    private JLabel lblSizeOfAdditional;
    private JTextField textField_sizeOfGreen;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_AddGreenSpace window = new Gui_AddGreenSpace();
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
	public Gui_AddGreenSpace() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	    ec = new ExperimentController();
	    
		frame = new JFrame();
		frame.setBounds(150, 150, 500, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNumberOfAdditional = new JLabel("Number of Additional Green Space:");
		lblNumberOfAdditional.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNumberOfAdditional.setBounds(36, 54, 258, 38);
		frame.getContentPane().add(lblNumberOfAdditional);
		
		textField_additionalGreen = new JTextField();
		textField_additionalGreen.setBounds(306, 61, 130, 26);
		frame.getContentPane().add(textField_additionalGreen);
		textField_additionalGreen.setColumns(10);
		
		JButton btnBack = new JButton("<- BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnBack.setBounds(0, 0, 117, 29);
		frame.getContentPane().add(btnBack);
		
		lblNumberOfTrials = new JLabel("Number of Trials:");
		lblNumberOfTrials.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNumberOfTrials.setBounds(36, 154, 258, 38);
		frame.getContentPane().add(lblNumberOfTrials);
		
		textField_trials = new JTextField();
		textField_trials.setColumns(10);
		textField_trials.setBounds(306, 161, 130, 26);
		frame.getContentPane().add(textField_trials);
		
		lblNumberOfStudents = new JLabel("Number of Students:");
		lblNumberOfStudents.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNumberOfStudents.setBounds(36, 204, 258, 38);
		frame.getContentPane().add(lblNumberOfStudents);
		
		textField_students = new JTextField();
		textField_students.setColumns(10);
		textField_students.setBounds(306, 211, 130, 26);
		frame.getContentPane().add(textField_students);
		
		lblNumberOfAllowance = new JLabel("Number of Allowance:");
		lblNumberOfAllowance.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNumberOfAllowance.setBounds(36, 254, 258, 38);
		frame.getContentPane().add(lblNumberOfAllowance);
		
		textField_allowance = new JTextField();
		textField_allowance.setColumns(10);
		textField_allowance.setBounds(306, 261, 130, 26);
		frame.getContentPane().add(textField_allowance);
		
		btnSimulation = new JButton("Simulation");
		btnSimulation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					sizeOfGreen = Integer.parseInt(textField_additionalGreen.getText());
                    number_of_trials = Integer.parseInt(textField_trials.getText());
                    number_of_students = Integer.parseInt(textField_students.getText());
                    number_of_allowance = Integer.parseInt(textField_allowance.getText());
                    number_of_additional_green_space = Integer.parseInt(textField_additionalGreen.getText());
                    ec.greenSpaces(number_of_trials, number_of_students, number_of_allowance,
                        "config_wheel_1.txt", "config_odds_1.txt", number_of_additional_green_space, sizeOfGreen);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(frame, "Please Enter Valid Number.");
                }
			}
		});
		btnSimulation.setBounds(377, 293, 117, 29);
		frame.getContentPane().add(btnSimulation);
		
		lblSizeOfAdditional = new JLabel("Size of Additional Green Space:");
		lblSizeOfAdditional.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSizeOfAdditional.setBounds(36, 104, 258, 38);
		frame.getContentPane().add(lblSizeOfAdditional);
		
		textField_sizeOfGreen = new JTextField();
		textField_sizeOfGreen.setColumns(10);
		textField_sizeOfGreen.setBounds(306, 111, 130, 26);
		frame.getContentPane().add(textField_sizeOfGreen);
	}

}
