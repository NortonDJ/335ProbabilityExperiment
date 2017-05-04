import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui_custom {
    ExperimentController ec;
    private int number_of_trials;
    private int number_of_students;
    private int number_of_allowance;
    private String name_of_wheel = null;
    private String name_of_odd = null;

    JFrame frame;
    private JTextField trialNumber;
    private JTextField studentNumber;
    private JTextField allowanceNumber;
    private JTextField wheelFileName;
    private JTextField oddFileName;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Gui_custom window = new Gui_custom();
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
    public Gui_custom() {
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
        
        JLabel lblNewLabel = new JLabel("Trials:");
        lblNewLabel.setBounds(38, 89, 61, 16);
        frame.getContentPane().add(lblNewLabel);
        
        JLabel label = new JLabel("Students:");
        label.setBounds(38, 117, 61, 16);
        frame.getContentPane().add(label);
        
        JLabel lblAllowance = new JLabel("Allowance:");
        lblAllowance.setBounds(38, 150, 73, 16);
        frame.getContentPane().add(lblAllowance);
        
        JLabel lblWheelFile = new JLabel("Wheel File:");
        lblWheelFile.setBounds(38, 183, 73, 16);
        frame.getContentPane().add(lblWheelFile);
        
        JLabel lblOddFile = new JLabel("Odd File:");
        lblOddFile.setBounds(38, 211, 61, 16);
        frame.getContentPane().add(lblOddFile);
        
        JButton btnStartSimulation = new JButton("Start Simulation");
        btnStartSimulation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    number_of_trials = Integer.parseInt(trialNumber.getText());
                    number_of_students = Integer.parseInt(studentNumber.getText());
                    number_of_allowance = Integer.parseInt(allowanceNumber.getText());
                    name_of_wheel = wheelFileName.getText();
                    name_of_odd = oddFileName.getText();
                    ec.run(number_of_trials, number_of_students, number_of_students, name_of_wheel, name_of_odd);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(frame, "Please Enter Valid Number.");
                }
            }
        });

        btnStartSimulation.setBounds(334, 252, 133, 29);
        frame.getContentPane().add(btnStartSimulation);
        
        JButton btnExit = new JButton("BACK");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        btnExit.setBounds(6, 6, 117, 29);
        frame.getContentPane().add(btnExit);
        
        trialNumber = new JTextField();
        trialNumber.setBounds(111, 84, 130, 26);
        frame.getContentPane().add(trialNumber);
        trialNumber.setColumns(10);
        
        studentNumber = new JTextField();
        studentNumber.setBounds(111, 112, 130, 26);
        frame.getContentPane().add(studentNumber);
        studentNumber.setColumns(10);
        
        allowanceNumber = new JTextField();
        allowanceNumber.setBounds(111, 145, 130, 26);
        frame.getContentPane().add(allowanceNumber);
        allowanceNumber.setColumns(10);
        
        wheelFileName = new JTextField();
        wheelFileName.setBounds(111, 178, 130, 26);
        frame.getContentPane().add(wheelFileName);
        wheelFileName.setColumns(10);
        
        oddFileName = new JTextField();
        oddFileName.setBounds(111, 206, 130, 26);
        frame.getContentPane().add(oddFileName);
        oddFileName.setColumns(10);
    }
}
