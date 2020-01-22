import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Dimension;

public class MyPanel extends JPanel {
	private MyModel mm;
	private Image man;
	private int i = 0;
	private int j = 0;
	private int k = 0;

	public MyPanel(man) {
		super();
		this.man = man;

		setBackground(Color.Black); // 背景を白に設定
		setPreferredSize(new Dimension(1280, 720)); // 大きさを640x480に設定
	}
}

