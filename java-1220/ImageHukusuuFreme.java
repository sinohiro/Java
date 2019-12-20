import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.awt.image.*;

public class ImageHukusuuFreme extends JFrame {
	private ImagePanel mp;// ImageHukusuuFreme HAS-A MyPanel の関係を構築

	public ImageHukusuuFreme() {
		super();
		Toolkit tk = Toolkit.getDefaultToolkit();

		Image[] man_array = new Image[4];
		for (int i = 0; i < 4; i++){
			man_array[i] = tk.getImage("man" + i + ".png");
		}
		this.mp = new ImagePanel(man_array);

		JPanel image = new JPanel();
		image.setLayout(new BoxLayout(image, BoxLayout.PAGE_AXIS));
		image.add(this.mp);

		getContentPane().add(image);
	}

	public static void main(String[] args){
		JFrame mainFrame = new JFrame("4J_21_shinodaApp");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageHukusuuFreme a = new ImageHukusuuFreme();
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
