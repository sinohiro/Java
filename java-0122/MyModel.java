import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Dimension;
import java.net.*;

public class MyModel {
	private MyPanel mp;
	private boolean kleft;
	private boolean kright;
	private Image player;

	public MyModel(){
		//URL url = MyModel.class.getResource("man0.png");
		//player = super.getImage(url);
		super();
		Toolkit tk = Toolkit.getDefaultToolkit();
		player = tk.getImage("man0.png");
	}

	public int getLeftmove(boolean kleft, int px){
		if (kleft && px > 0){
			px -= 8;
		}
		return px;
	}

	public int getRightmove(boolean kright, int px){
		if (kright && px < 1280){
			px += 8;
		}
		return px;
	}

	public Image getPlayer(){
		return this.player;
	}
}

