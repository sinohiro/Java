import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.MediaTracker;
import java.net.*;

public class MyApplet extends JApplet implements Runnable, KeyListener {
	private MyPanel mp;
	private MyModel mm;
	private Image player;
	private int px, py;
	private boolean kleft;
	private boolean kright;

	public void init() {
		px = 640;
		py = 600;
		player = getImage(getCodeBase(), "man0.png");
		kleft = kright = false;
		this.mp = new MyPanel;
		this.mm = new MyModel

		addKeyListener(this);
	}

	public void run() {
		while (1) {
			Thread.sleep(20);
			if (kleft) jx -= 8;
			if (kright) jy += 8;
			repaint();
		}
	}
	public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
					case KeyEvent.VK_LEFT: keyLeft = false; break;
					case KeyEvent.VK_RIGHT: keyRight = false; break;

	public void keyTyped(KeyEvent e) {}
}
