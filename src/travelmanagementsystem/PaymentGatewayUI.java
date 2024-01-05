
package travelmanagementsystem;

import javax.swing.SwingUtilities;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaymentGatewayUI extends JFrame {
    private JTextField cardNumberField;
    private JTextField expirationDateField;
    private JTextField cvvField;
    private JTextField amountField;

    public PaymentGatewayUI() {
        super("Payment Gateway");

        // Initialize components
        cardNumberField = new JTextField();
        expirationDateField = new JTextField();
        cvvField = new JTextField();
        amountField = new JTextField();
        JButton payButton = new JButton("Pay Now");

        // Set layout
        setLayout(new GridLayout(5, 2));

        // Add components to the frame
        add(new JLabel("Card Number:"));
        add(cardNumberField);

        add(new JLabel("Expiration Date:"));
        add(expirationDateField);

        add(new JLabel("CVV:"));
        add(cvvField);

        add(new JLabel("Amount:"));
        add(amountField);

        add(new JLabel()); // Empty label for spacing
        add(payButton);

        // Set action listener for the pay button
        payButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call the payment processing logic here
                processPayment();
            }
        });

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    private void processPayment() {
        // Extract user-entered data from the fields
        String cardNumber = cardNumberField.getText();
        String expirationDate = expirationDateField.getText();
        String cvv = cvvField.getText();
        String amount = amountField.getText();

        // Validate and process the payment logic here
        // This is where you would integrate with the payment gateway API

        // For demonstration purposes, print the entered information
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("CVV: " + cvv);
        System.out.println("Amount: " + amount);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PaymentGatewayUI();
            }
        });
    }
}
