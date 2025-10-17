import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ATMSimulation extends JFrame implements ActionListener {
    JPasswordField pinField;
    JButton login, balance, deposit, withdraw;
    JLabel message;
    double balanceAmt = 10000;

    ATMSimulation() {
        setTitle("ATM Simulation");
        setSize(400, 300);
        setLayout(new FlowLayout());

        message = new JLabel("Enter PIN: ");
        pinField = new JPasswordField(10);
        login = new JButton("Login");

        add(message); add(pinField); add(login);
        login.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String pin = new String(pinField.getPassword());
        if (pin.equals("1234")) {
            getContentPane().removeAll();
            balance = new JButton("Check Balance");
            deposit = new JButton("Deposit");
            withdraw = new JButton("Withdraw");
            message = new JLabel("");

            add(balance); add(deposit); add(withdraw); add(message);

            balance.addActionListener(ev -> message.setText("Balance: ₹" + balanceAmt));
            deposit.addActionListener(ev -> {
                balanceAmt += 1000;
                message.setText("Deposited ₹1000. New Balance: ₹" + balanceAmt);
            });
            withdraw.addActionListener(ev -> {
                balanceAmt -= 500;
                message.setText("Withdrawn ₹500. New Balance: ₹" + balanceAmt);
            });

            revalidate(); repaint();
        } else {
            message.setText("Invalid PIN!");
        }
    }

    public static void main(String[] args) {
        new ATMSimulation();
    }
}
