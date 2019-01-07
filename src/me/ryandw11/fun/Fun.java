package me.ryandw11.fun;

import java.util.Random;

import javax.swing.JFrame;

public class Fun {

	public static void main(String[] args) {
		String buttion1 = "a";
		String buttion2 = "s";
		if(args.length > 1) {
			if(args[0] == null) {
				buttion1 = "a";
			}
			if(args[1] == null) {
				buttion2 = "s";
			}
			if(args[0] != null && args[1] != null) {
				
			buttion1 = args[0];
			buttion2 = args[1];
			}
			
		}else {
			
		}
		Random rdm = new Random();
		
		Window w = new Window(buttion1, buttion2, rdm.nextInt(1000));
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
