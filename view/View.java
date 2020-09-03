package view;

import controller.Controller;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JPanel mainPanel;
    private JTextField initialVelocityTextField;
    private JTextField accelerationTextField;
    private JTextField timeTextField;
    private JButton calculateButton;
    private JTextField finalVelocityField;
    private JLabel messageLabel;

    public View() {
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

    public void addController(Controller controller) {
        calculateButton.addActionListener(controller);
    }

    public String getInitialVelocity() {
        return initialVelocityTextField.getText();
    }

    public String getAcceleration() {
        return accelerationTextField.getText();
    }

    public String getTime() {
        return timeTextField.getText();
    }


    public void setResult(double d) {
        messageLabel.setText("");
        finalVelocityField.setText(Double.valueOf(d).toString());
        finalVelocityField.setBackground(Color.decode("#00FFC3"));
    }

    public void setError(String message) {
        messageLabel.setText(message);
        finalVelocityField.setText("");
        finalVelocityField.setBackground(Color.decode("#FFC5C7"));
    }

    {

        $$$setupUI$$$();
    }

    
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        final JLabel label1 = new JLabel();
        label1.setText("Initial velocity");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        mainPanel.add(label1, gbc);
        initialVelocityTextField = new JTextField();
        initialVelocityTextField.setHorizontalAlignment(4);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(initialVelocityTextField, gbc);
        final JLabel label2 = new JLabel();
        label2.setText("Acceleration");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        mainPanel.add(label2, gbc);
        accelerationTextField = new JTextField();
        accelerationTextField.setHorizontalAlignment(4);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(accelerationTextField, gbc);
        timeTextField = new JTextField();
        timeTextField.setHorizontalAlignment(4);
        timeTextField.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(timeTextField, gbc);
        final JLabel label3 = new JLabel();
        label3.setText("Time");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        mainPanel.add(label3, gbc);
        final JLabel label4 = new JLabel();
        label4.setText("Final velocity");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        mainPanel.add(label4, gbc);
        finalVelocityField = new JTextField();
        finalVelocityField.setEditable(false);
        finalVelocityField.setHorizontalAlignment(4);
        finalVelocityField.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(finalVelocityField, gbc);
        calculateButton = new JButton();
        calculateButton.setText("Calculate");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(calculateButton, gbc);
        messageLabel = new JLabel();
        Font messageLabelFont = this.$$$getFont$$$(null, Font.BOLD, -1, messageLabel.getFont());
        if (messageLabelFont != null) messageLabel.setFont(messageLabelFont);
        messageLabel.setForeground(new Color(-65536));
        messageLabel.setHorizontalAlignment(0);
        messageLabel.setHorizontalTextPosition(0);
        messageLabel.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(messageLabel, gbc);
    }

   
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }

}
