import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui_CarveWheel {

	JFrame frame;
	private JTextField textField_0;
	private JTextField textField_00;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_CarveWheel window = new Gui_CarveWheel();
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
	public Gui_CarveWheel() {
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
		
		JLabel label = new JLabel("0");
		label.setBounds(17, 6, 37, 16);
		label.setForeground(Color.GREEN);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("00");
		label_1.setBounds(17, 34, 37, 16);
		label_1.setForeground(Color.GREEN);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("1");
		label_2.setForeground(Color.RED);
		label_2.setBounds(17, 62, 37, 16);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("2");
		label_3.setForeground(Color.BLACK);
		label_3.setBounds(17, 90, 37, 16);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("3");
		label_4.setForeground(Color.RED);
		label_4.setBounds(17, 118, 37, 16);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("4");
		label_5.setForeground(Color.BLACK);
		label_5.setBounds(17, 146, 37, 16);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("5");
		label_6.setForeground(Color.RED);
		label_6.setBounds(17, 174, 37, 16);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("6");
		label_7.setForeground(Color.BLACK);
		label_7.setBounds(17, 202, 37, 16);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("7");
		label_8.setForeground(Color.RED);
		label_8.setBounds(17, 230, 37, 16);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("8");
		label_9.setForeground(Color.BLACK);
		label_9.setBounds(17, 256, 37, 16);
		frame.getContentPane().add(label_9);
		
		textField_0 = new JTextField();
		textField_0.setBounds(39, 1, 65, 26);
		frame.getContentPane().add(textField_0);
		textField_0.setText("1");
		textField_0.setColumns(10);
		
		textField_00 = new JTextField();
		textField_00.setBounds(39, 29, 65, 26);
		frame.getContentPane().add(textField_00);
		textField_00.setText("1");
		textField_00.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(39, 57, 65, 26);
		textField_1.setText("1");
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(39, 85, 65, 26);
		textField_2.setText("1");
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(39, 113, 65, 26);
		textField_3.setText("1");
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(39, 141, 65, 26);
		textField_4.setText("1");
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(39, 169, 65, 26);
		textField_5.setText("1");
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(39, 197, 65, 26);
		textField_6.setText("1");
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(39, 225, 65, 26);
		textField_7.setText("1");
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(39, 251, 65, 26);
		textField_8.setText("1");
		frame.getContentPane().add(textField_8);
		
		JLabel label_10 = new JLabel("9");
		label_10.setForeground(Color.RED);
		label_10.setBounds(116, 6, 37, 16);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("10");
		label_11.setForeground(Color.BLACK);
		label_11.setBounds(116, 34, 37, 16);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("11");
		label_12.setForeground(Color.BLACK);
		label_12.setBounds(116, 62, 37, 16);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("12");
		label_13.setForeground(Color.RED);
		label_13.setBounds(116, 90, 37, 16);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("13");
		label_14.setForeground(Color.BLACK);
		label_14.setBounds(116, 118, 37, 16);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("14");
		label_15.setForeground(Color.RED);
		label_15.setBounds(116, 146, 37, 16);
		frame.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("15");
		label_16.setForeground(Color.BLACK);
		label_16.setBounds(116, 174, 37, 16);
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("16");
		label_17.setForeground(Color.RED);
		label_17.setBounds(116, 202, 37, 16);
		frame.getContentPane().add(label_17);
		
		JLabel label_18 = new JLabel("17");
		label_18.setForeground(Color.BLACK);
		label_18.setBounds(116, 230, 37, 16);
		frame.getContentPane().add(label_18);
		
		JLabel label_19 = new JLabel("18");
		label_19.setForeground(Color.RED);
		label_19.setBounds(116, 256, 37, 16);
		frame.getContentPane().add(label_19);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(140, 1, 65, 26);
		textField_9.setText("1");
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(140, 29, 65, 26);
		textField_10.setText("1");
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(140, 57, 65, 26);
		textField_11.setText("1");
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(140, 85, 65, 26);
		textField_12.setText("1");
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(140, 113, 65, 26);
		textField_13.setText("1");
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(140, 141, 65, 26);
		textField_14.setText("1");
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(140, 169, 65, 26);
		textField_15.setText("1");
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(140, 197, 65, 26);
		textField_16.setText("1");
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(140, 225, 65, 26);
		textField_17.setText("1");
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(140, 251, 65, 26);
		textField_18.setText("1");
		frame.getContentPane().add(textField_18);
		
		JLabel label_20 = new JLabel("19");
		label_20.setForeground(Color.RED);
		label_20.setBounds(217, 6, 37, 16);
		frame.getContentPane().add(label_20);
		
		JLabel label_21 = new JLabel("20");
		label_21.setForeground(Color.BLACK);
		label_21.setBounds(217, 34, 37, 16);
		frame.getContentPane().add(label_21);
		
		JLabel label_22 = new JLabel("21");
		label_22.setForeground(Color.RED);
		label_22.setBounds(217, 62, 37, 16);
		frame.getContentPane().add(label_22);
		
		JLabel label_23 = new JLabel("22");
		label_23.setForeground(Color.BLACK);
		label_23.setBounds(217, 90, 37, 16);
		frame.getContentPane().add(label_23);
		
		JLabel label_24 = new JLabel("23");
		label_24.setForeground(Color.RED);
		label_24.setBounds(217, 118, 37, 16);
		frame.getContentPane().add(label_24);
		
		JLabel label_25 = new JLabel("24");
		label_25.setForeground(Color.BLACK);
		label_25.setBounds(217, 146, 37, 16);
		frame.getContentPane().add(label_25);
		
		JLabel label_26 = new JLabel("25");
		label_26.setForeground(Color.RED);
		label_26.setBounds(217, 174, 37, 16);
		frame.getContentPane().add(label_26);
		
		JLabel label_27 = new JLabel("26");
		label_27.setForeground(Color.BLACK);
		label_27.setBounds(217, 202, 37, 16);
		frame.getContentPane().add(label_27);
		
		JLabel label_28 = new JLabel("27");
		label_28.setForeground(Color.RED);
		label_28.setBounds(217, 230, 37, 16);
		frame.getContentPane().add(label_28);
		
		JLabel label_29 = new JLabel("28");
		label_29.setForeground(Color.BLACK);
		label_29.setBounds(217, 256, 37, 16);
		frame.getContentPane().add(label_29);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(243, 1, 65, 26);
		textField_19.setText("1");
		frame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(243, 29, 65, 26);
		textField_20.setText("1");
		frame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(243, 57, 65, 26);
		textField_21.setText("1");
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(243, 85, 65, 26);
		textField_22.setText("1");
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(243, 113, 65, 26);
		textField_23.setText("1");
		frame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(243, 141, 65, 26);
		textField_24.setText("1");
		frame.getContentPane().add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(243, 169, 65, 26);
		textField_25.setText("1");
		frame.getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(243, 197, 65, 26);
		textField_26.setText("1");
		frame.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(243, 225, 65, 26);
		textField_27.setText("1");
		frame.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(243, 251, 65, 26);
		textField_28.setText("1");
		frame.getContentPane().add(textField_28);
		
		JLabel label_30 = new JLabel("29");
		label_30.setForeground(Color.BLACK);
		label_30.setBounds(320, 6, 37, 16);
		frame.getContentPane().add(label_30);
		
		JLabel label_31 = new JLabel("30");
		label_31.setForeground(Color.RED);
		label_31.setBounds(320, 34, 37, 16);
		frame.getContentPane().add(label_31);
		
		JLabel label_32 = new JLabel("31");
		label_32.setForeground(Color.BLACK);
		label_32.setBounds(320, 62, 37, 16);
		frame.getContentPane().add(label_32);
		
		JLabel label_33 = new JLabel("32");
		label_33.setForeground(Color.RED);
		label_33.setBounds(320, 90, 37, 16);
		frame.getContentPane().add(label_33);
		
		JLabel label_34 = new JLabel("33");
		label_34.setForeground(Color.BLACK);
		label_34.setBounds(320, 118, 37, 16);
		frame.getContentPane().add(label_34);
		
		JLabel label_35 = new JLabel("34");
		label_35.setForeground(Color.RED);
		label_35.setBounds(320, 146, 37, 16);
		frame.getContentPane().add(label_35);
		
		JLabel label_36 = new JLabel("35");
		label_36.setForeground(Color.BLACK);
		label_36.setBounds(320, 174, 37, 16);
		frame.getContentPane().add(label_36);
		
		JLabel label_37 = new JLabel("36");
		label_37.setForeground(Color.RED);
		label_37.setBounds(320, 202, 37, 16);
		frame.getContentPane().add(label_37);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(349, 1, 65, 26);
		textField_29.setText("1");
		frame.getContentPane().add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(349, 29, 65, 26);
		textField_30.setText("1");
		frame.getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(349, 57, 65, 26);
		textField_31.setText("1");
		frame.getContentPane().add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(349, 85, 65, 26);
		textField_32.setText("1");
		frame.getContentPane().add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(349, 113, 65, 26);
		textField_33.setText("1");
		frame.getContentPane().add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(349, 141, 65, 26);
		textField_34.setText("1");
		frame.getContentPane().add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(349, 169, 65, 26);
		textField_35.setText("1");
		frame.getContentPane().add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(349, 197, 65, 26);
		textField_36.setText("1");
		frame.getContentPane().add(textField_36);
		
		btnNewButton = new JButton("Simulation");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(330, 225, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("<- Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(330, 251, 117, 29);
		frame.getContentPane().add(btnNewButton_1);
	}
}
