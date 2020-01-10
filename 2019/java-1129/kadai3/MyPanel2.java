import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

public class MyPanel2 extends JPanel {

	private int accel = 0;
	private int tako = 8;
	private int red = 255;
	private int green = 255;
	private int blue = 255;

	public void setAccel(int accel){
		this.accel = 2 * accel;
	}

	public int getAccel(){
		return this.accel;
	}

	public void setTako(int tako){
		this.tako = 4 * tako;
	}

	public int getTako(){
		return this.tako;
	}

	public void setRed(int red){
		this.red = red;
	}

	public void setGreen(int green){
		this.green = green;
	}

	public void setBlue(int blue){
		this.blue = blue;
	}

	public MyPanel2() {
		super();
		setBackground(Color.white); // 背景を白に設定
		setPreferredSize(new Dimension(640, 480)); // 大きさを640x480に設定
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // まずJPanelのデフォルトの描画処理(背景色でクリア)を行い,
		g.drawString("なんちゃってタコメータ", 100, 100);
		g.drawString("なんちゃってスピードメータ", 500, 450);

		//tacho_meter
		g.drawArc(100, 100, 500, 500, 200, -200);
		g.fillArc(100, 100, 500, 500, 200, -tako);
		g.drawString("0X1000rpm", 100, 450);
		g.drawString("1", 80, 350);
		g.drawString("2", 100, 250);
		g.drawString("3", 150, 170);
		g.drawString("4", 220, 120);
		g.drawString("5", 300, 90);
		g.drawString("6", 390, 90);
		g.drawString("7", 480, 120);
		g.drawString("8", 550, 180);
		g.drawString("9", 600, 270);
		g.drawString("10", 610, 350);
		g.setColor(Color.red);
		g.fillArc(100, 100, 500, 500, 0, 20);

		//speed_meter
		g.setColor(Color.darkGray);
		g.drawArc(700, 100, 500, 500, 200, -200);
		g.fillArc(700, 100, 500, 500, 200, -accel);
		g.drawString("0km/h", 700, 450);
		g.drawString("20", 680, 350);
		g.drawString("40", 700, 250);
		g.drawString("60", 750, 160);
		g.drawString("80", 860, 100);
		g.drawString("100", 1000, 90);
		g.drawString("120", 1120, 150);
		g.drawString("140", 1190, 260);
		g.drawString("160", 1210, 360);

		//BGColor
		setBackground(new Color(red, green, blue));
	}
}

