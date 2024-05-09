package ui;
import javax.swing.JFrame;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

public class MainWindow extends JFrame{
	
	public static void main(String[] args){
		
		MainWindow myWindow = new MainWindow();
		myWindow.setVisible(true);
	}
	
	public MainWindow() {
		this.setSize(800, 600);
		this.setTitle("My first JFrame window!");
	}
	
}
