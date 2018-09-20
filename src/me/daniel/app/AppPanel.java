package me.daniel.app;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

class AppPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    
    AppPanel() {
        setLayout(null);
        setBackground(Color.BLACK);
        
        initLabel();
    }
    
    private void initLabel() {
        addLabel("Kliknięcia myszką: ", 0);
        addLabel("Kliknięcia na minutę: ", 1);
        addLabel("Przyciśnięte klawisze: ", 2);
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
}
