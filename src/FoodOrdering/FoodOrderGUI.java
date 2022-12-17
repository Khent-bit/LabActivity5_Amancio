package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrderGUI(){
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setTitle("Food Ordering System");
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = 0;

                try {
                    if (cPizza.isSelected()) {
                        total += 100;
                    }
                    if (cBurger.isSelected()) {
                        total += 80;
                    }
                    if (cFries.isSelected()) {
                        total += 65;
                    }
                    if (cSoftDrinks.isSelected()) {
                        total += 55;
                    }
                    if (cTea.isSelected()) {
                        total += 50;
                    }
                    if (cSundae.isSelected()) {
                        total += 40;
                    }
                    if (rbNone.isSelected()) {
                        total -= 0;
                    }
                    if (rb5.isSelected()) {
                        double temp = total * .05;
                        total -= temp;
                    }
                    if (rb10.isSelected()) {
                        double temp = total * .10;
                        total -= temp;
                    }
                    if (rb15.isSelected()) {
                        double temp = total * .15;
                        total -= temp;
                    }
                    if(total == 0){
                        throw new IllegalArgumentException();
                    }
                    JOptionPane.showMessageDialog(null, String.format("The total price is %.2f", total));
                }catch(IllegalArgumentException a){
                    JOptionPane.showMessageDialog(null, "No order selected!");
                }
            }
        });

    }
    public static void main(String[] args){
        JFrame fr = new FoodOrderGUI();
    }
}
