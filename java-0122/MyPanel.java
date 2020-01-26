import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Dimension;

public class MyPanel extends JPanel {
	private MyModel mm = new MyModel();
	private int px = 0;
	private int py = 0;

	public void setPlayerx(int px){
		this.px = px;
	}

	public void setPlayery(int py){
		this.py = py;
	}

	public MyPanel() {
		super();
		setBackground(Color.black);
		setPreferredSize(new Dimension(1280, 720)); // 大きさを640x480に設定
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		//player
		g.drawImage(mm.getPlayer(), this.px, this.py, this);
	}
}
