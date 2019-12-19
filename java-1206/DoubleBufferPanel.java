import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.image.*;
import java.awt.Dimension;

public class DoubleBufferPanel extends JPanel implements MouseMotionListener, MouseListener {
	private int bxpoint;					//Before X Point
	private int bypoint;					//Before Y Point
	private int axpoint;					//After X Point
	private int aypoint;					//After Y Point
	private int hutosa;
	private int red;
	private int green;
	private int blue;
	private int width;
	private int height;
	private BufferedImage bi;

	public DoubleBufferPanel() {
		super();
		this.bxpoint = 0;
		this.bypoint = 0;
		this.axpoint = 0;
		this.aypoint = 0;
		this.hutosa = 0;
		this.red = 0;
		this.green = 0;
		this.blue = 0;
		this.width = 1980;
		this.height = 1080;
		this.bi = new BufferedImage(this.width, this.height, BufferedImage.TYPE_INT_ARGB);

		setBackground(Color.white); // 背景を白に設定
		setPreferredSize(new Dimension(640, 480)); // 大きさを640x480に設定
		this.addMouseMotionListener(this);
		this.addMouseListener(this);
	}

	public void setHutosa(int hutosa){
		this.hutosa = hutosa;
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

	public void paintComponent(Graphics g) {
		super.paintComponent(g); // まずJPanelのデフォルトの描画処理(背景色でクリア)を行い,
		g.drawString("マウスでお絵描きしてね", 48, 48);
		g.drawImage(this.bi, 0, 0, this);
	}
	public void mouseMoved(MouseEvent e) {
		this.bxpoint = e.getX();	// マウスカーソルのX座標と
		this.bypoint = e.getY();	// Y座標を調べ
	}

	public void mousePressed(MouseEvent e) {
		this.bxpoint = e.getX();	// マウスカーソルのX座標と
		this.bypoint = e.getY();	// Y座標を調べ
	}  // マウスボタンが押されたとき

	public void mouseReleased(MouseEvent e) {} // マウスボタンが離されたとき
	public void mouseClicked(MouseEvent e) {}  // マウスボタンがクリックされた(押して離された)とき
	public void mouseEntered(MouseEvent e) {}  // マウスカーソルが部品内に入ったとき
	public void mouseExited(MouseEvent e) {}   // マウスカーソルが部品外に出たとき

	public void mouseDragged(MouseEvent e) {
		this.axpoint = e.getX();
		this.aypoint = e.getY();
		Graphics g = this.bi.getGraphics();// OSからペンを借り
		this.repaint();
		Graphics2D g2 = (Graphics2D)g;
		BasicStroke bs = new BasicStroke(this.hutosa);
		g2.setStroke(bs);

		Color color = new Color(this.red, this.green, this.blue);
		g.setColor(color);

		g.drawLine(bxpoint, bypoint, axpoint, aypoint);
		g.dispose();
		this.bxpoint = e.getX();
		this.bypoint = e.getY();
	}
}

