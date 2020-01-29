import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.MediaTracker;
import java.net.*;

public class MyApplet extends JApplet implements KeyListener, ActionListener {
	private MyPanel mp;
	private MyModel mm;
	private Image player;
	private Timer timer;
	private int px, py, ex, ey;
	private int pBulletx[], pBullety[];
	private int BulletCount;
	private boolean kleft, kright;
	private boolean PlayerBullet;
	private int[][] PlayerBulletxy;

	public void init() {
		px = 640;
		py = 600;
		ex = 20;
		ey = 20;
		BulletCount = 0;
		this.kleft = this.kright = false;
		this.PlayerBullet = false;
		this.PlayerBulletxy = new int[2][10];
		timer = new Timer(40, this);
		this.mm = new MyModel();
		this.mp = new MyPanel(px, py);

		mp.addKeyListener(this);

		JPanel field = new JPanel();
		field.setLayout(new BoxLayout(field, BoxLayout.PAGE_AXIS));
		field.add(this.mp);

		this.timer.start();
		getContentPane().add(field);
	}

	public void actionPerformed(ActionEvent e) {
		ex = mm.getEmove(false, ex);
		mp.setEnemyx(ex);
		this.mp.repaint();
	}

	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
			case KeyEvent.VK_A:
				px = mm.getLeftPmove(true, px);
				mp.setPlayerx(px);
				break;
			case KeyEvent.VK_D:
				px = mm.getRightPmove(true, px);
				mp.setPlayerx(px);
				break;
			case KeyEvent.VK_SPACE:
				PlayerBulletxy = mm.getPlayerBulletmove(px, py, BulletCount);
				mp.setPlayerBulletxy(PlayerBulletxy);
				mp.setBulletCount(BulletCount);
				mp.setPlayerBullet(true);
				BulletCount += 1;
				break;
		}
		this.mp.repaint();
	}

	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
			case KeyEvent.VK_A:
				px = mm.getLeftPmove(false, px);
				mp.setPlayerx(px);
				break;
			case KeyEvent.VK_D:
				px = mm.getRightPmove(false, px);
				mp.setPlayerx(px);
				break;
		}
	}

	public void keyTyped(KeyEvent e) {}
}
