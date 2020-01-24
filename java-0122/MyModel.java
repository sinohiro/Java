import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Dimension;
import java.net.*;

public class MyModel extends JApplet {
	private MyPanel mp;
	private boolean kleft;
	private boolean kright;
	private int px = 0;
	private int py = 0;

	URL url = MyModel.class.getResource("man0.png");
	Image player = super.getImage(url);

	public void setLeftmove(boolean kleft){
		if (kleft && px > 0){
			px -= 8;
			mp.setPlayerx(px);
		}
	}

	public void setRightmove(boolean kleft){
		if (kright && px < 1280){
			px += 8;
			mp.setPlayery(py);
		}
	}

	public Image getPlayer(){
		return this.player;
	}

	public MyModel(){
	super();
	}
}

