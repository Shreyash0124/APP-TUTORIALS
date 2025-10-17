import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShoppingCart extends JFrame implements ActionListener {
    JCheckBox laptop, phone, headphones;
    JButton bill;
    JLabel result;

    ShoppingCart() {
        setTitle("Shopping Cart");
        setSize(400, 300);
        setLayout(new FlowLayout());

        laptop = new JCheckBox("Laptop - ₹60000");
        phone = new JCheckBox("Phone - ₹40000");
        headphones = new JCheckBox("Headphones - ₹2000");

        bill = new JButton("Generate Bill");
        result = new JLabel("");

        add(laptop); add(phone); add(headphones);
        add(bill); add(result);

        bill.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int total = 0;
        String msg = "Selected Items: ";
        if (laptop.isSelected()) { total += 60000; msg += "Laptop "; }
        if (phone.isSelected()) { total += 40000; msg += "Phone "; }
        if (headphones.isSelected()) { total += 2000; msg += "Headphones "; }

        result.setText(msg + " | Total = ₹" + total);
    }

    public static void main(String[] args) {
        new ShoppingCart();
    }
}
