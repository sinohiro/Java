import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

public class MouseFrame extends JFrame {
	private MousePanel mp;// MouseFrame HAS-A MyPanel の関係を構築

	public MouseFrame() {
		this.mp = new MousePanel();
		getContentPane().add(this.mp);
	}

	public static void main(String[] args){
		JFrame mainFrame = new JFrame("4J_21_shinodaApp");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MouseFrame a = new MouseFrame();
		a.setTitle("4J_21_shinodaApp_MyTextEditer_Progrram");
		a.setSize(1280, 720);
		a.setLocation(100, 100);
		a.setVisible(true);
		a.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		a.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
			}
		});
	}
}
