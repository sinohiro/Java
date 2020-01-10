import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

public class MousePanel extends JPanel implements MouseListener{
	public MousePanel() {
		setBackground(Color.white); // 背景を白に設定
		setPreferredSize(new Dimension(640, 480)); // 大きさを640x480に設定
		this.addMouseListener(this);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // まずJPanelのデフォルトの描画処理(背景色でクリア)を行い,
		g.drawString("マウスでお絵描きしてね", 48, 48);
	}
	public void mousePressed(MouseEvent e) { // マウスボタンが押されたとき
		System.out.println("Mouse_Pressed");
		int x = e.getX();	// マウスカーソルのX座標と
		int y = e.getY();	// Y座標を調べ
		Graphics g = this.getGraphics();	// OSからペンを借り
		g.drawArc(x - 25, y - 25, 50, 50, 0, 360); // マウスカーソルの位置に図形を描画する
		g.dispose();
	}
	public void mouseReleased(MouseEvent e) {} // マウスボタンが離されたとき
	public void mouseClicked(MouseEvent e) {}  // マウスボタンがクリックされた(押して離された)とき
	public void mouseEntered(MouseEvent e) {}  // マウスカーソルが部品内に入ったとき
	public void mouseExited(MouseEvent e) {}   // マウスカーソルが部品外に出たとき
}