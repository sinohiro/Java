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
	private int BulletCount;
	private int[][] PlayerBulletxy;
	private boolean PlayerBullet;

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

	public void setBulletCount(int BulletCount){
		this.BulletCount = BulletCount;
	}

	public void setPlayerBulletxy(int[][] PlayerBulletxy) {
		this.PlayerBulletxy = PlayerBulletxy;
	}

	public void setPlayerBullet(boolean PlayerBullet) {
		this.PlayerBullet = PlayerBullet;
	}

	public MyPanel(int px, int py) {
		//super();
		this.mm = new MyModel();
		this.px = px;
		this.py = py;
		this.ex = ex;
		this.ey = ey;
		setBackground(Color.black);
		setPreferredSize(new Dimension(1280, 720));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Toolkit.getDefaultToolkit().sync();
		//player
		g.drawImage(mm.getPlayer(), this.px, this.py, this);
		if (PlayerBullet) {
			for (int i = 0 ; i <= BulletCount ; i ++){
				g.drawImage(mm.getBullet(), this.PlayerBulletxy[0][i], this.PlayerBulletxy[1][i], this);
			}
		}

		//enemy
		g.drawImage(mm.getEnemy(), this.ex, this.ey, this);

		requestFocusInWindow();
	}
}
