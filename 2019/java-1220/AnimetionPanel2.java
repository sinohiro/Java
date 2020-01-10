import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Dimension;

public class AnimetionPanel2 extends JPanel {
	private Image[] man_array;
	private int i = 0;
	private int j = 0;
	private int k = 0;

	public AnimetionPanel2(Image[] man_array) {
		super();
		this.man_array = man_array;

		setBackground(Color.white); // 背景を白に設定
		setPreferredSize(new Dimension(640, 480)); // 大きさを640x480に設定
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g); // まずJPanelのデフォルトの描画処理(背景色でクリア)を行い,
		g.drawImage(this.man_array[i], j, k, this);
		if (i > 2) {
			i = 0;
		}else {
			i++;
		}
		if (j > 1280) {
			j = 0;
			k += 100;
		}else{
			j += 20;
		}
		if (k > 620) {
			k = 0;
		}
	}
}

