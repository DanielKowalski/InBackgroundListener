package me.daniel.inputListening;

import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseListener;

public class GlobalMouseListener implements NativeMouseListener {
    private InputHandler handler;
    
    public GlobalMouseListener(InputHandler handler) {
        this.handler = handler;
    }
    
    @Override
    public void nativeMouseClicked(NativeMouseEvent evt) { /* Unimplemented */}

    @Override
    public void nativeMousePressed(NativeMouseEvent evt) { /* Unimplemented */}

    @Override
    public void nativeMouseReleased(NativeMouseEvent evt) { 
        handler.countMouseClick();
    }
}
