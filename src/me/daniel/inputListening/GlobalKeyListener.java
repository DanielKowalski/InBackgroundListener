package me.daniel.inputListening;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class GlobalKeyListener implements NativeKeyListener {

    private InputHandler handler;
    
    public GlobalKeyListener(InputHandler handler) {
        this.handler = handler;
    }
    
    @Override
    public void nativeKeyPressed(NativeKeyEvent evt) {
        handler.putKeyText(NativeKeyEvent.getKeyText(evt.getKeyCode()));
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent evt) { /* Unimplemented */}

    @Override
    public void nativeKeyTyped(NativeKeyEvent evt) {/* Unimplemented */}

}
