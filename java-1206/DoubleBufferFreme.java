import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

public class DoubleBufferFreme extends JFrame implements ChangeListener ActionListener{
	private DoubleBufferPanel mp;// DoubleBufferFreme HAS-A MyPanel の関係を構築
	private JSlider hutosas;
	private JLabel	hutosal;
	private JSlider	reds;
	private JLabel	redl;
	private JSlider	greens;
	private JLabel	greenl;
	private JSlider	blues;
	private JLabel	bluel;
	private JLabel	RGBlabel;
	private int hutosa;

	public DoubleBufferFreme() {
		super();
		this.mp = new DoubleBufferPanel();
		this.hutosas = new JSlider(0, 76, 0);
		this.hutosal = new JLabel("hutosa: " + hutosas.getValue());
		this.reds = new JSlider(0, 255, 0);
		this.redl = new JLabel("red: " + reds.getValue());
		this.greens = new JSlider(0, 255, 0);
		this.greenl = new JLabel("green: " + greens.getValue());
		this.blues = new JSlider(0, 255, 0);
		this.bluel = new JLabel("blue: " + blues.getValue());
		this.hutosa = 0;
		this.RGBlabel = new JLabel("Pen Color");

		JPanel hutosa = new JPanel();
		hutosa.setLayout(new FlowLayout());
		hutosa.add(this.hutosas);
		hutosa.add(this.hutosal);

		JPanel red = new JPanel();
		red.setLayout(new FlowLayout());
		red.add(this.reds);
		red.add(this.redl);

		JPanel green = new JPanel();
		green.setLayout(new FlowLayout());
		green.add(this.greens);
		green.add(this.greenl);

		JPanel blue = new JPanel();
		blue.setLayout(new FlowLayout());
		blue.add(this.blues);
		blue.add(this.bluel);

		JPanel RGB = new JPanel();
		RGB.setLayout(new BoxLayout(RGB, BoxLayout.PAGE_AXIS));
	  RGB.add(this.RGBlabel);
		RGB.add(red);
		RGB.add(green);
		RGB.add(blue);

		JPanel tool = new JPanel();
		tool.setLayout(new FlowLayout());
		tool.add(hutosa);
		tool.add(RGB);

		JPanel oekaki = new JPanel();
		oekaki.setLayout(new BoxLayout(oekaki, BoxLayout.PAGE_AXIS));
		oekaki.add(this.mp);
		oekaki.add(tool);

		getContentPane().add(oekaki);
		this.hutosas.addChangeListener(this);
		this.reds.addChangeListener(this);
		this.greens.addChangeListener(this);
		this.blues.addChangeListener(this);
	}

	/*public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == this.button1) {
*/

	public void stateChanged(ChangeEvent e) {
		if (e.getSource() == this.hutosas) {
			this.mp.setHutosa(this.hutosas.getValue());
			hutosal.setText("hutosa: " +this. hutosas.getValue());
		}

		if (e.getSource() == this.reds) {
			this.mp.setRed(this.reds.getValue());
			redl.setText("Red: " + reds.getValue());
		}

		if (e.getSource() == this.greens) {
			this.mp.setGreen(this.greens.getValue());
			greenl.setText("Green: " + greens.getValue());
		}
		if (e.getSource() == this.blues) {
			this.mp.setBlue(this.blues.getValue());
			bluel.setText("Blue: " + blues.getValue());
		}
	}

	public static void main(String[] args){
		JFrame mainFrame = new JFrame("4J_21_shinodaApp");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DoubleBufferFreme a = new DoubleBufferFreme();
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
