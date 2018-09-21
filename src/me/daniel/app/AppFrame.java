package me.daniel.app;

import java.awt.EventQueue;

import javax.swing.JFrame;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

import me.daniel.inputListening.GlobalKeyListener;
import me.daniel.inputListening.GlobalMouseListener;
import me.daniel.inputListening.InputHandler;

public class AppFrame extends JFrame {
    static final int WIDTH = 300, HEIGHT = 300;
    static final String TITLE = "In background listener";
    private static final long serialVersionUID = 1L;
    
    public AppFrame(AppPanel panel) {
        setSize(WIDTH, HEIGHT);
        setTitle(TITLE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        
        setContentPane(panel);
    }
    
    public static void main(String[] args) {
        AppPanel panel = new AppPanel();
        InputHandler handler = new InputHandler(panel);
        
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new AppFrame(panel);
            }
        });
        
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException e) {
            e.printStackTrace();
        }
        
        GlobalScreen.addNativeKeyListener(new GlobalKeyListener(handler));
        GlobalScreen.addNativeMouseListener(new GlobalMouseListener(handler));
    }
}
