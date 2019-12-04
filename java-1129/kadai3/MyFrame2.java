import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

public class MyFrame2 extends JFrame implements ChangeListener {
	private MyPanel2 mp;// MyFrame2 HAS-A MyPanel の関係を構築
	private JLabel	label;
	private JSlider accels;
	private JLabel	accell;
	private JSlider brakes;
	private JLabel	brakel;
	private JSlider	reds;
	private JLabel	redl;
	private JSlider	greens;
	private JLabel	greenl;
	private JSlider	blues;
	private JLabel	bluel;

	public MyFrame2() {
		super();
		this.mp = new MyPanel2();
		this.label = new JLabel();
		this.accels = new JSlider(0, 100, 0);
		this.accell = new JLabel();
		this.reds = new JSlider(0, 255, 255);
		this.redl = new JLabel();
		this.greens = new JSlider(0, 255, 255);
		this.greenl = new JLabel();
		this.blues = new JSlider(0, 255, 255);
		this.bluel = new JLabel();
		label.setText("Background Color ");
		accell.setText("accel: " + accels.getValue());
		redl.setText("red: " + reds.getValue());
		greenl.setText("green" + greens.getValue());
		bluel.setText("blue" + blues.getValue());

		JPanel accel = new JPanel();
		accel.add(this.accels);
		accel.add(this.accell);

		JPanel red = new JPanel();
		red.add(this.reds);
		red.add(this.redl);

		JPanel green = new JPanel();
		green.add(this.greens);
		green.add(this.greenl);

		JPanel blue = new JPanel();
		blue.add(this.blues);
		blue.add(this.bluel);

		JPanel pedal = new JPanel();
		pedal.setLayout(new BoxLayout(pedal, BoxLayout.PAGE_AXIS));
		pedal.add(accel);

		JPanel BGColor = new JPanel();
		BGColor.setLayout(new BoxLayout(BGColor, BoxLayout.PAGE_AXIS));
	  BGColor.add(this.label);
		BGColor.add(red);
		BGColor.add(green);
		BGColor.add(blue);

		JPanel input = new JPanel();
		input.setLayout(new FlowLayout());
		input.add(pedal);
		input.add(BGColor);

		JPanel meter = new JPanel();
		meter.setLayout(new BoxLayout(meter, BoxLayout.PAGE_AXIS));
		meter.add(this.mp);
		meter.add(input);

		getContentPane().add(meter);
		this.accels.addChangeListener(this);
		this.reds.addChangeListener(this);
		this.greens.addChangeListener(this);
		this.blues.addChangeListener(this);
	}

	public int AtoT(int n) {
		int ans = n;
		if (n >= 45){
			ans = n -20;
			ans = AtoT(ans);
		}
		return(ans);
	}

	public void stateChanged(ChangeEvent e) {
		if (e.getSource() == this.accels) {
			this.mp.setAccel(this.accels.getValue());
			accell.setText("accel: " + accell.getValue());
			this.mp.setTako(AtoT(this.accels.getValue()));

			if (this.mp.getTako() >= 180) {
				this.mp.setTako(this.accels.getValue() - 20);
			}
		}

		if (this.mp.getTako() <= 10) {
			this.mp.setTako(this.accels.getValue() + 2);
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
	this.mp.repaint();
	}

	public static void main(String[] args){
		JFrame mainFrame = new JFrame("4J_21_shinodaApp");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyFrame2 a = new MyFrame2();
		a.setTitle("4J_21_shinodaApp");
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
