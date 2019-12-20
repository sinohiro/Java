import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.image.*;
import java.awt.Dimension;

public class ImagePanel extends JPanel {
	private Image man;

	public ImagePanel(Image man) {
		super();
		this.man = man;

		setBackground(Color.white); // 背景を白に設定
		setPreferredSize(new Dimension(640, 480)); // 大きさを640x480に設定
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g); // まずJPanelのデフォルトの描画処理(背景色でクリア)を行い,
		g.drawImage(this.man, 100, 100, this);
	}
}

