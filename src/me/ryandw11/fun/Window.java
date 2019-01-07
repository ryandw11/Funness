package me.ryandw11.fun;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame {
	
	public int counter = 0;
	JLabel label;
	
	public Window(String buttion1, String buttion2, int i) {
		super("Counter " + i);
		
		
		this.setSize(100, 100);
		
		this.guiConstructor();
		
		this.setVisible(true);
		this.setLocation(700, 200);
		this.getContentPane().setBackground(Color.green);
		
		this.addKeyListener(new KeyListener() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	        }

	        @Override
	        public void keyPressed(KeyEvent e) {
	            System.out.println("Key pressed code=" + e.getKeyCode() + ", char=" + e.getKeyChar());
	            if(e.getKeyChar() == buttion1.charAt(0)) {
	            	counter += 1;
	            	label.setText(counter + "");
	            }
	            if(e.getKeyChar() == buttion2.charAt(0)) {
	            	counter -= 1;
	            	label.setText(counter + "");
	            }
	        }

	        @Override
	        public void keyReleased(KeyEvent e) {
	        }
	    });	
	}
	
	public void guiConstructor(){
		label = new JLabel("0");
		label.setFont(new Font("Arial", Font.PLAIN, 80));
		label.setForeground(Color.white);
		this.add(label);
	}
}
