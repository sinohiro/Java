import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.image.*;
import java.awt.Dimension;

public class AnimetionPanel2 extends JPanel {
	private Image[] man_array;
	private int i = 0;
	private int j = 0;

	public AnimetionPanel2(Image[] man_array) {
		super();
		this.man_array = man_array;

		setBackground(Color.white); // 背景を白に設定
		setPreferredSize(new Dimension(640, 480)); // 大きさを640x480に設定
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g); // まずJPanelのデフォルトの描画処理(背景色でクリア)を行い,
		g.drawImage(this.man_array[i], j, 100, this);
		j += 10;
		if (i > 2) {
			i = 0;
		}else {
			i++;
		}
	}
}

