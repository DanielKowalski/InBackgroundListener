package me.daniel.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonClickListener implements ActionListener {
    private ClickCallback click;
    
    ButtonClickListener(ClickCallback click) {
        this.click = click;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        click.click();
    }
}
