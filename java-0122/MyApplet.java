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
	private boolean kleft;
	private boolean kright;
	private MediaTracker tracker;

	public void init() {
		px = 640;
		py = 600;
		ex = 20;
		ey = 20;
		this.kleft = this.kright = false;
		timer = new Timer(60, this);
		this.mm = new MyModel();
		this.mp = new MyPanel(px, py);
		tracker = new MediaTracker();

		//mediatracker
		try {
			this.tracker.waitForAll();
			System.out.println("MediaTracker_ok");
		}catch (InterruptedException e) {
		}

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
				System.out.println("px = " + px);
				px = mm.getLeftPmove(true, px);
				mp.setPlayerx(px);
				break;
			case KeyEvent.VK_D:
				System.out.println("px = " + px);
				px = mm.getRightPmove(true, px);
				mp.setPlayerx(px);
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
