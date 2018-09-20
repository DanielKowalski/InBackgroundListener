package me.daniel.button;

import javax.swing.JButton;

public class AppButton extends JButton {
    private static final long serialVersionUID = 1L;
    
    public AppButton(String buttonText, final ClickCallback click) {
        super(buttonText);
        addActionListener(new ButtonClickListener(click));
    }
}
