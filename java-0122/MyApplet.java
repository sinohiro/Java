import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.MediaTracker;
import java.net.*;

public class MyApplet extends JApplet implements KeyListener, ActionListener {

	private static final int NUM_BULLET = 50;

	private MyPanel mp;
	private MyModel mm;
	private PlayerBullet[] pb;
	private Image player;
	private Timer timer;
	private int px, py, ex, ey;
	private boolean kleft, kright;

	public void init() {
		px = 640;
		py = 600;
		ex = 20;
		ey = 20;
		this.kleft = this.kright = false;
		timer = new Timer(40, this);
		this.mm = new MyModel();
		this.mp = new MyPanel(px, py);
		this.pb = new PlayerBullet[NUM_BULLET];
		for (int i = 0 ; i < NUM_BULLET ; i++){
			pb[i] = new PlayerBullet();
		}

		mp.setNUM_BULLET(NUM_BULLET);
		mp.addKeyListener(this);

		JPanel field = new JPanel();
		field.setLayout(new BoxLayout(field, BoxLayout.PAGE_AXIS));
		field.add(this.mp);

		this.timer.start();
		getContentPane().add(field);
	}

	public void actionPerformed(ActionEvent e) {
		//enemymove
		ex = mm.getEmove(false, ex);
		mp.setEnemyx(ex);

		//playerbulletmove
		for (int i = 0; i < NUM_BULLET; i++) {
			if (pb[i].isAlive()) {
				pb[i].move();
			}
		}
		mp.setPlayerBullet(pb);

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
				for (int i = 0; i < NUM_BULLET; i++) {
					if (!pb[i].isAlive()) {
						pb[i].set(px, py);
						break;
					}
				}
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
