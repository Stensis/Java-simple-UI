package Projects;

import javax.swing.*;
import java.awt.event.*;

public class SimpleUI {

    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JTextField textField;
    private JLabel label;

    public SimpleUI() {
        // Create the frame and set its properties
        frame = new JFrame("Simple Greetings Java UI");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame

        // Create the panel to add components
        panel = new JPanel();
        frame.add(panel);

        placeComponents(panel);

        // Make the frame visible
        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Create and set the properties for the label
        label = new JLabel("Enter your name:");
        label.setBounds(10, 20, 150, 25);
        panel.add(label);

        // Create and set the properties for the text field
        textField = new JTextField(20);
        textField.setBounds(120, 20, 150, 25);
        panel.add(textField);

        // Create and set the properties for the button
        button = new JButton("Greet Me");
        button.setBounds(10, 80, 120, 25);
        panel.add(button);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                JOptionPane.showMessageDialog(null, "Hello 😀, " + name + "!");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SimpleUI();
            }
        });
    }
}
