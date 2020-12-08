package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab9
{
    private static JTextField dividendInput;
    private static JLabel dividendLabel;
    private static JTextField divisorInput;
    private static JLabel divisorLabel;
    private static JLabel resultLabel;
    private static JLabel errorLabel;
    private static JButton calculateButton;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("OOP Lab 9 - Piotr Shishkov | FAF-193");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 225);
        frame.setResizable(false);
        Container content = frame.getContentPane();

        dividendInput = new JTextField();
        dividendInput.setSize(100, 20);
        dividendInput.setLocation(155, 30);
        content.add(dividendInput);

        dividendLabel = new JLabel("Dividend:");
        dividendLabel.setSize(70, 20);
        dividendLabel.setLocation(30, 30);
        content.add(dividendLabel);

        divisorInput = new JTextField();
        divisorInput.setSize(100, 20);
        divisorInput.setLocation(155, 60);
        content.add(divisorInput);

        divisorLabel = new JLabel("Divisor:");
        divisorLabel.setSize(70, 20);
        divisorLabel.setLocation(30, 60);
        content.add(divisorLabel);

        resultLabel = new JLabel("Result:");
        resultLabel.setSize(100, 20);
        resultLabel.setLocation(30, 90);
        content.add(resultLabel);

        errorLabel = new JLabel();
        errorLabel.setForeground(Color.red);
        errorLabel.setSize(400, 20);
        errorLabel.setLocation(30, 150);
        content.add(errorLabel);

        calculateButton = new JButton("Calculate Result");
        calculateButton.setSize(225, 25);
        calculateButton.setLocation(30, 120);
        calculateButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    resultLabel.setText("Result:");
                    errorLabel.setText("");

                    float inputDividend =  Float.parseFloat(dividendInput.getText());
                    float inputDivisor = Float.parseFloat(divisorInput.getText());

                    if (inputDivisor == 13)
                        throw new UnluckyException();

                    float res = inputDividend / inputDivisor;
                    resultLabel.setText("Result: " + res);
                }
                catch(NullPointerException e1)
                {
                    errorLabel.setText("ERR: One of the fields is empty");
                }
                catch (NumberFormatException e2)
                {
                    errorLabel.setText("ERR: Only numbers allowed!");
                }
                //ArithmeticException only will throw when dividing integer on zero, but float will return Infinity
                catch (ArithmeticException e3)
                {
                    errorLabel.setText("ERR: Can't evaluate expression!");
                }
                catch (UnluckyException e4)
                {
                    errorLabel.setText("ERR: Unlucky Exception #13");
                }
            }
        });
        content.add(calculateButton);
        frame.setVisible(true);
    }
}


