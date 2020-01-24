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
		px = 640;
		py = 600;
		player = getImage(getCodeBase(), "man0.png");
		kleft = kright = false;
		this.mp = new MyPanel();
		this.mm = new MyModel();

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
			case KeyEvent.VK_A: kleft = false; break;
			case KeyEvent.VK_D: kright = false; break;
		}
	}

	public void keyTyped(KeyEvent e) {}
}
