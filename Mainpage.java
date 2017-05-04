import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mainpage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainpage window = new Mainpage();
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
	public Mainpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(150, 150, 500, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMathProject = new JLabel("Math335 Project");
		lblMathProject.setBounds(0, 0, 520, 28);
		lblMathProject.setHorizontalAlignment(SwingConstants.CENTER);
		lblMathProject.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		frame.getContentPane().add(lblMathProject);
		
		JLabel lblByChenYizhong = new JLabel("by Chen, Yizhong and Norton, Darren");
		lblByChenYizhong.setBounds(44, 312, 450, 10);
		lblByChenYizhong.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		lblByChenYizhong.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblByChenYizhong);
		
		JButton customButton = new JButton("Custom");
		customButton.setBounds(6, 91, 98, 78);
		customButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gui_custom window = new Gui_custom();
					window.frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		frame.getContentPane().add(customButton);
		
		JButton addGreenButton = new JButton("Add Green Space");
		addGreenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gui_AddGreenSpace window = new Gui_AddGreenSpace();
					window.frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		addGreenButton.setBounds(116, 91, 128, 78);
		frame.getContentPane().add(addGreenButton);
		
		JButton carveButton = new JButton("Carve Wheels");
		carveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gui_CarveWheel window = new Gui_CarveWheel();
					window.frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		carveButton.setBounds(256, 91, 128, 78);
		frame.getContentPane().add(carveButton);
		
		JButton oddButton = new JButton("Modify Odds");
		oddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Gui_odds window = new Gui_odds();
					window.frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		oddButton.setBounds(396, 91, 98, 78);
		frame.getContentPane().add(oddButton);
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitButton.setBounds(199, 271, 117, 29);
		frame.getContentPane().add(exitButton);
	}
}
