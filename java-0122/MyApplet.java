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
		kleft = kright = false;
		this.mm = new MyModel();
		this.mp = new MyPanel(px, py);

		mp.addKeyListener(this);

		JPanel field = new JPanel();
		field.setLayout(new BoxLayout(field, BoxLayout.PAGE_AXIS));
		field.add(this.mp);

		getContentPane().add(field);
	}

	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
			case KeyEvent.VK_A:
				System.out.println("px = " + px);
				px = mm.getLeftmove(true, px);
				mp.setPlayerx(px);
				break;
			case KeyEvent.VK_D:
				System.out.println("px = " + px);
				px = mm.getRightmove(true, px);
				mp.setPlayerx(px);
				break;
		}
		this.mp.repaint();
	}

	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
			case KeyEvent.VK_A:
				px = mm.getLeftmove(false, px);
				mp.setPlayerx(px);
				break;
			case KeyEvent.VK_D:
				px = mm.getRightmove(false, px);
				mp.setPlayerx(px);
				break;
		}
	}

	public void keyTyped(KeyEvent e) {}
}
