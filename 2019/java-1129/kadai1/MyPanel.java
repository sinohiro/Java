import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

public class MyPanel extends JPanel {
	public MyPanel() {
		setBackground(Color.white); // 背景を白に設定
		setPreferredSize(new Dimension(640, 480)); // 大きさを640x480に設定
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // まずJPanelのデフォルトの描画処理(背景色でクリア)を行い,
		g.drawLine(50, 50, 100, 100); // その後, 独自の図形を描画する
		g.drawOval(32, 16, 256, 128);
		g.drawString("文字列をグラフィックスとして表示", 48, 48);
	}
}

