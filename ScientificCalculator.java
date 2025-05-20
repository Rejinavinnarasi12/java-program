import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScientificCalculator extends JFrame implements ActionListener {
    private JTextField textField;
    private double num1, num2, result;
    private String operator;

    public ScientificCalculator() {
        setTitle("Scientific Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));

        String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+", "sin", "cos", "tan", "sqrt"};
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        try {
            if (command.matches("[0-9.]")) {
                textField.setText(textField.getText() + command);
            } else if (command.equals("=")) {
                num2 = Double.parseDouble(textField.getText());
                switch (operator) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/": 
                        if (num2 != 0) result = num1 / num2;
                        else { textField.setText("Error"); return; }
                        break;
                }
                textField.setText(String.valueOf(result));
            } else if (command.equals("sin")) {
                result = Math.sin(Math.toRadians(Double.parseDouble(textField.getText())));
                textField.setText(String.valueOf(result));
            } else if (command.equals("cos")) {
                result = Math.cos(Math.toRadians(Double.parseDouble(textField.getText())));
                textField.setText(String.valueOf(result));
            } else if (command.equals("tan")) {
                result = Math.tan(Math.toRadians(Double.parseDouble(textField.getText())));
                textField.setText(String.valueOf(result));
            } else if (command.equals("sqrt")) {
                result = Math.sqrt(Double.parseDouble(textField.getText()));
                textField.setText(String.valueOf(result));
            } else {
                num1 = Double.parseDouble(textField.getText());
                operator = command;
                textField.setText("");
            }
        } catch (Exception ex) {
            textField.setText("Error");
        }
    }

    public static void main(String[] args) {
        new ScientificCalculator();
    }
}
