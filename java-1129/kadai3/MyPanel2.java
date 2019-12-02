import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

public class MyPanel2 extends JPanel {

	private int accel = 0;
	private int tako = 10;

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

	public MyPanel2() {
		super();
		setBackground(Color.white); // 背景を白に設定
		setPreferredSize(new Dimension(640, 480)); // 大きさを640x480に設定
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // まずJPanelのデフォルトの描画処理(背景色でクリア)を行い,
		g.fillArc(650, 100, 500, 500, 200, -accel);
		g.fillArc(100, 100, 500, 500, 200, -tako);
		g.drawString("0km/h", 600, 450);
	}
}

