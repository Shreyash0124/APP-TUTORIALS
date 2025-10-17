import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    JTextField tf;
    double num1, num2, result;
    char op;

    Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(new FlowLayout());

        tf = new JTextField(20);
        add(tf);

        String[] buttons = {"7","8","9","+","4","5","6","-","1","2","3","*","0","=","/","C"};
        for (String b : buttons) {
            JButton btn = new JButton(b);
            add(btn);
            btn.addActionListener(this);
        }

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.matches("[0-9]")) tf.setText(tf.getText() + s);
        else if (s.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(tf.getText());
            op = s.charAt(0);
            tf.setText("");
        } else if (s.equals("=")) {
            num2 = Double.parseDouble(tf.getText());
            switch (op) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }
            tf.setText("" + result);
        } else tf.setText("");
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
