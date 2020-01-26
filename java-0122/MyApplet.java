import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.MediaTracker;
import java.net.*;

public class MyApplet extends JApplet implements KeyListener {
	private MyPanel mp;
	private MyModel mm;
	private Image player;
	private int px, py;
	private boolean kleft;
	private boolean kright;

	public void init() {
		this.mp = new MyPanel();
		this.mm = new MyModel();
		px = 640;
		py = 600;
		kleft = kright = false;
		player = mm.getPlayer();

		addKeyListener(this);

		JPanel field = new JPanel();
		field.setLayout(new BoxLayout(field, BoxLayout.PAGE_AXIS));
		field.add(this.mp);

		getContentPane().add(field);
	}

	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
			case KeyEvent.VK_A:
				mm.setLeftmove(true);
				break;
			case KeyEvent.VK_D:
				mm.setRightmove(true);
				break;
		}
		this.mp.repaint();
	}

	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
			case KeyEvent.VK_A:
				mm.setLeftmove(false);
				break;
			case KeyEvent.VK_D:
				mm.setRightmove(false);
				break;
		}
	}

	public void keyTyped(KeyEvent e) {}
}
