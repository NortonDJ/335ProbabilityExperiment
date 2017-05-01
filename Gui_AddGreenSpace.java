import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui_AddGreenSpace {

	JFrame frame;
	private JTextField textField;

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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNumberOfAdditional = new JLabel("Number of Additional Green Space:");
		lblNumberOfAdditional.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNumberOfAdditional.setBounds(99, 75, 258, 38);
		frame.getContentPane().add(lblNumberOfAdditional);
		
		textField = new JTextField();
		textField.setBounds(159, 125, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBack = new JButton("<- BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnBack.setBounds(0, 0, 117, 29);
		frame.getContentPane().add(btnBack);
	}

}
