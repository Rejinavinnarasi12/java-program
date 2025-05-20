import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DecimalCalculator extends JFrame implements ActionListener {
    private JTextField textField;
    private double num1, num2, result;
    private char operator;

    public DecimalCalculator() {
        setTitle("Decimal Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

   
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
            textField.setText(textField.getText() + command);
        } else if (command.equals("=") && !textField.getText().isEmpty()) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': 
                    if (num2 != 0) result = num1 / num2;
                    else { textField.setText("Error"); return; }
                    break;
            }
            textField.setText(String.valueOf(result));
        } else {
            if (!textField.getText().isEmpty()) {
                num1 = Double.parseDouble(textField.getText());
                operator = command.charAt(0);
                textField.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new DecimalCalculator();
    }
}
