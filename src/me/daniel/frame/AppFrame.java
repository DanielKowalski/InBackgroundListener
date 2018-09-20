package me.daniel.frame;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class AppFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private static final int WIDTH = 300, HEIGHT = 300;
    private static final String TITLE = "In background listener";
    
    public AppFrame() {
        setSize(WIDTH, HEIGHT);
        setTitle(TITLE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        add(new AppPanel());
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new AppFrame();
            }
        });
    }
}
