package me.daniel.inputListening;

import me.daniel.app.AppPanel;

public class InputHandler {
    private AppPanel panel;
    
    public InputHandler(AppPanel panel) {
        this.panel = panel;
    }
    
    void putKeyText(String keyText) {
        panel.putKeyTextInTextArea(keyText);
    }
    
    void countMouseClick() {
        panel.increaseNumbersOfClicks();
        panel.increaseClicksPerMinute();
    }
    
}
