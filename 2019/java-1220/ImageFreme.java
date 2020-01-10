import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.awt.image.*;

public class ImageFreme extends JFrame {
	private ImagePanel mp;// ImageFreme HAS-A MyPanel の関係を構築

	public ImageFreme() {
		super();
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image man = tk.getImage("man0.png");
		this.mp = new ImagePanel(man);

		JPanel image = new JPanel();
		image.setLayout(new BoxLayout(image, BoxLayout.PAGE_AXIS));
		image.add(this.mp);

		getContentPane().add(image);
	}

	public static void main(String[] args){
		JFrame mainFrame = new JFrame("4J_21_shinodaApp");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageFreme a = new ImageFreme();
		a.setTitle("4J_21_shinodaApp_Progrram");
		a.setSize(1280, 720);
		a.setLocation(100, 100);
		a.setVisible(true);
		a.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		a.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
			}
		});
	}
}
