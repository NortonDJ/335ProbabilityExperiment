import java.util.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Gui_odds {

    JFrame frame;
    private JTextField single_textField;
    private JTextField even_textField;
    private JTextField odd_textField;
    private JTextField red_textField;
    private JTextField black_textField;
    private JTextField contains_textField;
    private JTextField line_textField;
    private JTextField group_textField;
    private JButton button;
    private JLabel label;
    private JTextField textField_trials;
    private JLabel label_1;
    private JTextField textField_students;
    private JLabel label_2;
    private JTextField textField_allowance;
    
    private int number_of_trials;
    private int number_of_students;
    private int number_of_allowance;
    
    private int number_of_single;
    private int number_of_even;
    private int number_of_odd;
    private int number_of_red;
    private int number_of_black;
    private int number_of_contains;
    private int number_of_line;
    private int number_of_group;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Gui_odds window = new Gui_odds();
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
    public Gui_odds() {
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
        
        JLabel lblSingle = new JLabel("Single");
        lblSingle.setBounds(265, 57, 61, 16);
        frame.getContentPane().add(lblSingle);
        
        JLabel lblNewLabel = new JLabel("Even");
        lblNewLabel.setBounds(265, 85, 61, 16);
        frame.getContentPane().add(lblNewLabel);
        
        JLabel lblOdd = new JLabel("Odd");
        lblOdd.setBounds(265, 113, 61, 16);
        frame.getContentPane().add(lblOdd);
        
        JLabel lblRed = new JLabel("Red");
        lblRed.setBounds(265, 141, 61, 16);
        frame.getContentPane().add(lblRed);
        
        JLabel lblBlack = new JLabel("Black");
        lblBlack.setBounds(265, 169, 61, 16);
        frame.getContentPane().add(lblBlack);
        
        JLabel lblContains = new JLabel("Contains");
        lblContains.setBounds(265, 197, 61, 16);
        frame.getContentPane().add(lblContains);
        
        JLabel lblLine = new JLabel("Line");
        lblLine.setBounds(265, 225, 61, 16);
        frame.getContentPane().add(lblLine);
        
        JLabel lblNewLabel_1 = new JLabel("Group");
        lblNewLabel_1.setBounds(265, 253, 61, 16);
        frame.getContentPane().add(lblNewLabel_1);
        
        single_textField = new JTextField();
        single_textField.setBounds(338, 52, 37, 26);
        single_textField.setText("35");
        frame.getContentPane().add(single_textField);
        single_textField.setColumns(10);
        
        even_textField = new JTextField();
        even_textField.setColumns(10);
        even_textField.setBounds(338, 80, 37, 26);
        even_textField.setText("1");
        frame.getContentPane().add(even_textField);
        
        odd_textField = new JTextField();
        odd_textField.setColumns(10);
        odd_textField.setBounds(338, 108, 37, 26);
        odd_textField.setText("1");
        frame.getContentPane().add(odd_textField);
        
        red_textField = new JTextField();
        red_textField.setColumns(10);
        red_textField.setBounds(338, 136, 37, 26);
        red_textField.setText("1");
        frame.getContentPane().add(red_textField);
        
        black_textField = new JTextField();
        black_textField.setColumns(10);
        black_textField.setBounds(338, 164, 37, 26);
        black_textField.setText("1");
        frame.getContentPane().add(black_textField);
        
        contains_textField = new JTextField();
        contains_textField.setColumns(10);
        contains_textField.setBounds(338, 192, 37, 26);
        contains_textField.setText("1");
        frame.getContentPane().add(contains_textField);
        
        line_textField = new JTextField();
        line_textField.setColumns(10);
        line_textField.setBounds(338, 220, 37, 26);
        line_textField.setText("2");
        frame.getContentPane().add(line_textField);
        
        group_textField = new JTextField();
        group_textField.setColumns(10);
        group_textField.setBounds(338, 248, 37, 26);
        group_textField.setText("2");
        frame.getContentPane().add(group_textField);
        
        button = new JButton("<- BACK");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        button.setBounds(6, 6, 117, 29);
        frame.getContentPane().add(button);
        
        label = new JLabel("Number of Trials:");
        label.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
        label.setBounds(16, 52, 130, 38);
        frame.getContentPane().add(label);
        
        textField_trials = new JTextField();
        textField_trials.setColumns(10);
        textField_trials.setBounds(161, 58, 61, 26);
        frame.getContentPane().add(textField_trials);
        
        label_1 = new JLabel("Number of Students:");
        label_1.setFont(new Font("Lucida Grande", Font. PLAIN, 13));
        label_1.setBounds(16, 80, 133, 38);
        frame.getContentPane().add(label_1);
        
        textField_students = new JTextField();
        textField_students.setColumns(10);
        textField_students.setBounds(161, 86, 61, 26);
        frame.getContentPane().add(textField_students);
        
        label_2 = new JLabel("Number of Allowance:");
        label_2.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
        label_2.setBounds(16, 108, 139, 38);
        frame.getContentPane().add(label_2);
        
        textField_allowance = new JTextField();
        textField_allowance.setColumns(10);
        textField_allowance.setBounds(161, 114, 61, 26);
        frame.getContentPane().add(textField_allowance);
        
        JButton btnSimulation = new JButton("Simulation");
        btnSimulation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                number_of_trials = Integer.parseInt(textField_trials.getText());
                number_of_students = Integer.parseInt(textField_students.getText());
                number_of_allowance = Integer.parseInt(textField_allowance.getText());
                ArrayList<Integer> balances = new ArrayList<Integer>();
                System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                System.out.println("YOU ARE RUNNING A CHANGE ODDS SIM");
                System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                System.out.println("INPUT PARAMETERS");
                System.out.println("TRIALS: " + number_of_trials);
                System.out.println("STUDENTS: " + number_of_students);
                System.out.println("ALLOWANCE: " + number_of_allowance);
                System.out.println("WHEEL FILE: " + "config_wheel_1.txt");
                System.out.println("ODDS FILE: " + "config_odds_1.txt");
                System.out.println(); 
                try{
                    for(int i = 0; i < number_of_trials; i++){
                        Casino c = CasinoFactory.makeCasino(number_of_trials, number_of_allowance, 
                        "config_wheel_1.txt", "config_odds_1.txt");
                        number_of_single = Integer.parseInt(single_textField.getText());
                        number_of_even = Integer.parseInt(even_textField.getText());
                        number_of_odd = Integer.parseInt(odd_textField.getText());
                        number_of_red = Integer.parseInt(red_textField.getText());
                        number_of_black = Integer.parseInt(black_textField.getText());
                        number_of_contains = Integer.parseInt(contains_textField.getText());
                        number_of_line = Integer.parseInt(line_textField.getText());
                        number_of_group = Integer.parseInt(group_textField.getText());
                        c.setOdds("single", number_of_single);
                        c.setOdds("even", number_of_even);
                        c.setOdds("odd", number_of_odd);
                        c.setOdds("red", number_of_red);
                        c.setOdds("black", number_of_black);
                        c.setOdds("contains", number_of_contains);
                        c.setOdds("line", number_of_line);
                        c.setOdds("group", number_of_group);
                        
                        Result r = c.run();
                        balances.add(r.getBalance());
                    }
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(frame, "Please Enter Valid Number.");
                }
                System.out.println("Simulation over after " + number_of_trials + " trials.");
                System.out.println(balances);
                double average = average(balances);
                System.out.println("Average balance for casino: " + average);
                System.out.println("Variance: " + variance(balances, average));
                System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
            }
        });
        btnSimulation.setBounds(377, 293, 117, 29);
        frame.getContentPane().add(btnSimulation);
    }
    
    public static double average(ArrayList<Integer> balances){
        long size = balances.size();
        if(size <= 0){
            return 0;
        }
        long sum = 0;
        for(Integer i : balances){
            sum += i;
        }
        return sum/(double)size;
    }
    
    public static double variance(ArrayList<Integer> balances, double average){
        long size = balances.size();
        if(size <= 0){
            return 0;
        }
        double sum = 0;
        for(Integer i : balances){
            sum += Math.pow((i - average),2);
        }
        return sum/((double)(size-1));
    }
}
