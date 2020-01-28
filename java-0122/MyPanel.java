import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Dimension;

public class MyPanel extends JPanel {
	private MyModel mm;
	private int px;
	private int py;
	private int ex;
	private int ey;

	public void setPlayerx(int px){
		this.px = px;
	}

	public void setPlayery(int py){
		this.py = py;
	}

	public void setEnemyx(int ex){
		this.ex = ex;
	}

	public void setEnemyy(int ey){
		this.ey = ey;
	}

	public MyPanel(int px, int py) {
		//super();
		this.mm = new MyModel();
		this.px = px;
		this.py = py;
		this.ex = ex;
		this.ey = ey;
		setBackground(Color.black);
		setPreferredSize(new Dimension(1280, 720)); // 大きさを640x480に設定
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		//player
		g.drawImage(mm.getPlayer(), this.px, this.py, this);
		g.drawImage(mm.getEnemy(), this.ex, this.ey, this);

		requestFocusInWindow();
	}
}
