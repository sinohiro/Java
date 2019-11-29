import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

public class MyFrame2 extends JFrame{
	private MyPanel2 mp;// MyFrame2 HAS-A MyPanel の関係を構築
	private JButton accel;
	private JSLider boosts;
	private JLabel	boostl;

	public MyFrame2() {
		super();
		this.mp = new MyPanel();
		this.accel = new JButton("Accel");
		this.boosts = new JSlider();
		this.bootsl = new JLabel();

		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.add(this.mp);
		panel1.add(this.button2);
		panel1.add(this.err);

		getContentPane().add(panel1);
		this.accel.addActionListener(this);
		this.boots.addChangeListener(this);
	}

	public static void main(String[] args){
		JFrame mainFrame = new JFrame("4J_21_shinodaApp");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyFrame2 a = new MyFrame2();
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
