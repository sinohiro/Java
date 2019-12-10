import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

public class MouseMotionFreme extends JFrame implements ChangeListener{
	private MouseMotionPanel mp;// MouseMotionFreme HAS-A MyPanel の関係を構築
	private JSlider hutosas;
	private JLabel	hutosal;
	private int hutosa;

	public MouseMotionFreme() {
		super();
		this.mp = new MouseMotionPanel();
		this.hutosas = new JSlider(0, 16, 0);
		this.hutosal = new JLabel("hutosa: " + hutosas.getValue());
		this.hutosa = 0;

		JPanel hutosa = new JPanel();
		hutosa.setLayout(new FlowLayout());
		hutosa.add(this.hutosas);
		hutosa.add(this.hutosal);

		JPanel tool = new JPanel();
		tool.setLayout(new FlowLayout());
		tool.add(hutosa);

		JPanel oekaki = new JPanel();
		oekaki.setLayout(new BoxLayout(oekaki, BoxLayout.PAGE_AXIS));
		oekaki.add(this.mp);
		oekaki.add(tool);

		getContentPane().add(oekaki);
		this.hutosas.addChangeListener(this);
	}

	public void stateChanged(ChangeEvent e) {
		if (e.getSource() == this.hutosas) {
			this.hutosa = this.hutosas.getValue();
			hutosal.setText("hutosa: " + hutosas.getValue());
		}
	}

	public static void main(String[] args){
		JFrame mainFrame = new JFrame("4J_21_shinodaApp");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MouseMotionFreme a = new MouseMotionFreme();
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
