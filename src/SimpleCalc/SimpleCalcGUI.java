package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI(){
        this.setContentPane(panel1);
        this.setVisible(true);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Simple Calculator");
        lblResult.setEditable(false);
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = 0, num2;

                try {
                    num1 = Double.parseDouble(tfNumber1.getText());
                    num2 = Double.parseDouble(tfNumber2.getText());

                    int sign = cbOperations.getSelectedIndex();

                    if(num2 == 0 && sign == 3){
                        throw new ArithmeticException();
                    }
                    double res = (new double[]{num1 + num2, num1 - num2, num1 * num2, num1 / num2})[sign];
                    lblResult.setText(String.format("%.0f", res));
                }catch(ArithmeticException a){
                    JOptionPane.showMessageDialog(null,"You can't divide number by zero!");
                }catch(Exception a){
                    JOptionPane.showMessageDialog(null, "Invalid input");
                }
            }
        });
    }
    public static void main(String[] args){
        JFrame fr = new SimpleCalcGUI();
    }
}
