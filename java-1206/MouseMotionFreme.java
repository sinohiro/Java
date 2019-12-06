import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

public class MouseMotionFreme extends JFrame implements MouseMotionListener, ChangeListener{
	private MouseMotionPanel mp;// MouseMotionFreme HAS-A MyPanel の関係を構築
	private JSlider hutosas;
	private JLabel¦_hutosal;
	private int bxpoint;					//Before X Point
	private int bypoint;					//Before Y Point
	private int axpoint;					//After X Point
	private int aypoint;					//After Y Point

	public MouseMotionFreme() {
		super();
		this.mp = new MouseMotionPanel();
		this.bxpoint = 0;
		this.bypoint = 0;
		this.axpoint = 0;
		this.aypoint = 0;

		JPanel hutosa = new JPanel();
		hutosa.setLayout(new FlowLayout());
		hutosa.add(this.hutosas);
		hutosa.add(this.hutosal);

		JPanel tool = new JPanel();
		tool.setLayout(new FlowLayout());
		tool.add(this.hutosa);

		JPanel oekaki = new JPanel();
		oekaki.setLayout(new BoxLayout(meter, BoxLayout.PAGE_AXIS));
		oekaki.add(this.mp);
		oekaki.add(tool);

		getContentPane().add(this.mp);
		this.addMouseMotionListener(this);
		this.hutosas.addChangeListener(this);
	}

	public void stateChanged(ChangeEvent e) {
		if (e.getSource() == this.accels) {
			this.mp.setAccel(this.accels.getValue());
			accell.setText("accel: " + accell.getValue());
			this.mp.setTako(AtoT(this.accels.getValue()));
		}
	}

	public void mouseMoved(MouseEvent e) {
		this.bxpoint = e.getX();	// マウスカーソルのX座標と
		this.bypoint = e.getY();	// Y座標を調べ
	}
	public void mouseDragged(MouseEvent e) {
		this.axpoint = e.getX();
		this.aypoint = e.getY();
		Graphics g = this.getGraphics();	// OSからペンを借り
		g.drawLine(bxpoint, bypoint, axpoint, aypoint);
		g.dispose();
		this.bxpoint = e.getX();
		this.bypoint = e.getY();
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
