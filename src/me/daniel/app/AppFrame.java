package me.daniel.app;

import java.awt.EventQueue;

import javax.swing.JFrame;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

import me.daniel.inputListening.GlobalKeyListener;

public class AppFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    static final int WIDTH = 300, HEIGHT = 300;
    static final String TITLE = "In background listener";
    
    public AppFrame() {
        setSize(WIDTH, HEIGHT);
        setTitle(TITLE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        
        setContentPane(new AppPanel());
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new AppFrame();
            }
        });
        
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException e) {
            e.printStackTrace();
        }
        
        GlobalScreen.addNativeKeyListener(new GlobalKeyListener());
    }
}
