package me.daniel.app;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import me.daniel.button.AppButton;
import me.daniel.button.ClickCallback;

class AppPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private JTextArea numberOfClicks, clicksPerMinute, pressedKeys;
    
    AppPanel() {
        setLayout(new GridLayout(7, 1));
        setBackground(Color.BLACK);
        
        initGuiElements();
        initButton();
        reset();
    }
    
    private void initGuiElements() {
        numberOfClicks = new JTextArea();
        clicksPerMinute = new JTextArea();
        pressedKeys = new JTextArea();
        
        addLabel("Kliknięcia myszką: ");
        initTextArea(numberOfClicks);
        addLabel("Kliknięcia na minutę: ");
        initTextArea(clicksPerMinute);
        addLabel("Przyciśnięte klawisze: ");
        initTextArea(pressedKeys);
    }

    private void initTextArea(JTextArea textArea) {
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.YELLOW);
        textArea.setEditable(false);
        
        JScrollPane scroll = new JScrollPane(textArea);
        scroll.setBorder(null);
        
        add(scroll);
    }

    private void addLabel(String text) {
        JLabel label = new JLabel(text);
        
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(Color.YELLOW);
        
        add(label);
    }
    
    private void initButton() {
        AppButton button = new AppButton("RESET", new ClickCallback() {
            
            @Override
            public void click() {
                reset();
            }
        });

        add(button);
    }
    
    private void reset() {
        numberOfClicks.setText("0");
        clicksPerMinute.setText("0");
        pressedKeys.setText("");
    }
}
