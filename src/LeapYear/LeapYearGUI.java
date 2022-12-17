package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI(){
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setTitle("Leap Year Checker");

        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = 0;
                temp = Integer.parseInt(tfYear.getText());

                if(temp % 400 == 0){
                    JOptionPane.showMessageDialog(null,"Leap year");
                }else if(temp % 4 == 0 && temp % 100 != 0){
                    JOptionPane.showMessageDialog(null, "Leap year");
                }else{
                    JOptionPane.showMessageDialog(null, "Not a leap year");
                }
            }
        });
    }
    public static void main(String[] args){
        JFrame fr = new LeapYearGUI();
    }
}
