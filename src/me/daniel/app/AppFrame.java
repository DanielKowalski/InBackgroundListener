package me.daniel.app;

import java.awt.EventQueue;

import javax.swing.JFrame;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

import me.daniel.inputListening.GlobalKeyListener;

public class AppFrame extends JFrame {
    static final int WIDTH = 300, HEIGHT = 300;
    static final String TITLE = "In background listener";
    private static final long serialVersionUID = 1L;
    private AppPanel panel;
    
    public AppFrame() {
        setSize(WIDTH, HEIGHT);
        setTitle(TITLE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        
        panel = new AppPanel();
        setContentPane(panel);
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
        
        GlobalScreen.addNativeKeyListener(new GlobalKeyListener(panel));
    }
}
