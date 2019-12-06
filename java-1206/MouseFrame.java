import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

public class MouseTestFrame extends JFrame implements MouseListener{
	private MouseTestPanel mp;// MouseTestFrame HAS-A MyPanel の関係を構築

	public MouseTestFrame() {
		this.mp = new MouseTestPanel();
		getContentPane().add(this.mp);
		this.addMouseListener(this);
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

	public static void main(String[] args){
		JFrame mainFrame = new JFrame("4J_21_shinodaApp");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MouseTestFrame a = new MouseTestFrame();
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
