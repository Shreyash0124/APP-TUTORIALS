import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class EmployeeForm extends JFrame implements ActionListener {
    JTextField name, dept, salary;
    JButton add;
    JTable table;
    DefaultTableModel model;

    EmployeeForm() {
        setTitle("Employee Management");
        setSize(500, 400);
        setLayout(new FlowLayout());

        name = new JTextField(10);
        dept = new JTextField(10);
        salary = new JTextField(10);
        add = new JButton("Add Employee");

        model = new DefaultTableModel(new String[]{"Name", "Department", "Salary"}, 0);
        table = new JTable(model);

        add(new JLabel("Name:")); add(name);
        add(new JLabel("Department:")); add(dept);
        add(new JLabel("Salary:")); add(salary);
        add(add);
        add(new JScrollPane(table));

        add.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        model.addRow(new Object[]{name.getText(), dept.getText(), salary.getText()});
        name.setText(""); dept.setText(""); salary.setText("");
    }

    public static void main(String[] args) {
        new EmployeeForm();
    }
}
