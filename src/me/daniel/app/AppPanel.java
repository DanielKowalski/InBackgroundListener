package me.daniel.app;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class AppPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private JTextField numberOfClicks, clicksPerMinute, pressedKeys;
    
    AppPanel() {
        setLayout(null);
        setBackground(Color.BLACK);
        
        initLabels();
        initTextFields();
        reset();
    }
    
    private void initTextFields() {
        numberOfClicks = new JTextField();
        clicksPerMinute = new JTextField();
        pressedKeys = new JTextField();
        
        addTextField(numberOfClicks, 0);
        addTextField(clicksPerMinute, 1);
        addTextField(pressedKeys, 2);
    }

    private void initLabels() {
        addLabel("Kliknięcia myszką: ", 0);
        addLabel("Kliknięcia na minutę: ", 1);
        addLabel("Przyciśnięte klawisze: ", 2);
    }

    private void addTextField(JTextField textField, int order) {
        Color backgroundColor = Color.BLACK;
        Color textColor = Color.YELLOW;
        int width = AppFrame.WIDTH - (int)(AppFrame.WIDTH / 50);
        int height = (int)(AppFrame.HEIGHT / 10);
        int x = (int)(AppFrame.WIDTH / 100);
        int startY = (int)(AppFrame.HEIGHT / 100) + height;
        
        textField.setBounds(x, startY + height * 2 * order, width, height);
        textField.setBackground(backgroundColor);
        textField.setForeground(textColor);
        
        add(textField);
    }
    
    private void addLabel(String text, int order) {
        Color textColor = Color.YELLOW;
        int x = (int)(AppFrame.WIDTH / 100);
        int startY = (int)(AppFrame.HEIGHT / 100);
        int width = (int)(AppFrame.WIDTH / 2);
        int height = (int)(AppFrame.HEIGHT / 10);
        
        JLabel label = new JLabel(text);
        
        label.setBounds(x, startY + order * 2 * height, width, height);
        label.setForeground(textColor);
        
        add(label);
    }
    
    private void reset() {
        numberOfClicks.setText("0");
        clicksPerMinute.setText("0");
        pressedKeys.setText("");
    }
}
