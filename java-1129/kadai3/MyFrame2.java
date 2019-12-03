import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

public class MyFrame2 extends JFrame implements ChangeListener {
	private MyPanel2 mp;// MyFrame2 HAS-A MyPanel の関係を構築
	private JSlider accels;
	private JLabel	accell;
	private JSlider brakes;
	private JLabel	brakel;

	public MyFrame2() {
		super();
		this.mp = new MyPanel2();
		this.accels = new JSlider(0, 100, 0);
		this.accell = new JLabel();
		this.brakes = new JSlider();
		this.brakel = new JLabel();
		accell.setText("accel: " + accels.getValue());
		brakel.setText("Tako: " + this.mp.getTako());

		JPanel accel = new JPanel();
		accel.add(this.accels);
		accel.add(this.accell);

		JPanel brake = new JPanel();
		brake.add(this.brakes);
		brake.add(this.brakel);

		JPanel pedal = new JPanel();
		pedal.setLayout(new BoxLayout(pedal, BoxLayout.PAGE_AXIS));
		pedal.add(accel);
		pedal.add(brake);

		JPanel meter = new JPanel();
		meter.setLayout(new BoxLayout(meter, BoxLayout.PAGE_AXIS));
		meter.add(this.mp);
		meter.add(pedal);

		getContentPane().add(meter);
		this.accels.addChangeListener(this);
		//this.boots.addChangeListener(this);
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
			accell.setText("accel: " + accels.getValue());
			this.mp.setTako(AtoT(this.accels.getValue()));
			brakel.setText("Tako: " + this.mp.getTako());

			if (this.mp.getTako() >= 180) {
				this.mp.setTako(this.accels.getValue() - 20);
				brakel.setText("Tako: " + this.mp.getTako());
			}

			if (this.mp.getTako() <= 10) {
				this.mp.setTako(this.accels.getValue() + 2);
				brakel.setText("Tako: " + this.mp.getTako());
			}
		}

		if (e.getSource() == this.brakes) {
			brakel.setText("brake: " + brakes.getValue());
		}
	this.mp.repaint();
	}

//	public void actionPerformed(ActionEvent ae) {
//		if (ae.getSource() == this.up) {

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
