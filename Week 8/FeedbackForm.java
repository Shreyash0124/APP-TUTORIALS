import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FeedbackForm extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3, r4, r5;
    ButtonGroup ratingGroup;
    JTextArea comment;
    JButton submit;
    JLabel msg;

    public FeedbackForm() {
        setTitle("Feedback Form");
        setSize(400, 350);
        setLayout(new FlowLayout());

        // Rating section
        add(new JLabel("Rate our service (1–5 stars):"));
        ratingGroup = new ButtonGroup();
        r1 = new JRadioButton("1");
        r2 = new JRadioButton("2");
        r3 = new JRadioButton("3");
        r4 = new JRadioButton("4");
        r5 = new JRadioButton("5");
        ratingGroup.add(r1);
        ratingGroup.add(r2);
        ratingGroup.add(r3);
        ratingGroup.add(r4);
        ratingGroup.add(r5);
        add(r1);
        add(r2);
        add(r3);
        add(r4);
        add(r5);

        // Comments section
        add(new JLabel("Comments:"));
        comment = new JTextArea(5, 25);
        comment.setLineWrap(true);
        comment.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(comment);
        add(scroll);

        // Submit button and message label
        submit = new JButton("Submit");
        msg = new JLabel("");
        add(submit);
        add(msg);

        submit.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Determine which rating is selected
        String rating = "";
        if (r1.isSelected()) rating = "1";
        else if (r2.isSelected()) rating = "2";
        else if (r3.isSelected()) rating = "3";
        else if (r4.isSelected()) rating = "4";
        else if (r5.isSelected()) rating = "5";
        else rating = "No rating selected";

        // Get comment text
        String commentText = comment.getText().trim();
        if (commentText.isEmpty()) {
            commentText = "No comment";
        }

        // Show a thank you message (could also show in a popup)
        msg.setText("Thank you! Rating: " + rating + ". Comment: " + commentText);

        // Optionally, disable fields after submission
        r1.setEnabled(false);
        r2.setEnabled(false);
        r3.setEnabled(false);
        r4.setEnabled(false);
        r5.setEnabled(false);
        comment.setEditable(false);
        submit.setEnabled(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FeedbackForm());
    }
}
