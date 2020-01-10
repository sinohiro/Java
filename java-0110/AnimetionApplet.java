import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.MediaTracker;
import java.net.*;

public class AnimetionApplet extends JApplet implements ActionListener {
	private AnimetionPanel mp;// AnimetionApplet HAS-A MyPanel の関係を構築
	private Timer timer;
	private MediaTracker tracker;

	public void init() {
		//super();
		//Toolkit tk = Toolkit.getDefaultToolkit();
		Image[] man_array = new Image[4];
		this.mp = new AnimetionPanel(man_array);
		tracker = new MediaTracker(this);

		this.timer = new Timer(100, this);
		this.timer.start();

		for (int i = 0; i < 4; i++){
			URL url = AnimetionApplet.class.getResource("man" + i + ".png");
			man_array[i] = super.getImage(url);
			//man_array[i] = tk.getImage("man" + i + ".png");
			this.tracker.addImage(man_array[i], i);
		}

		try {
			this.tracker.waitForAll();
			System.out.println("MediaTracker_ok");
		}catch (InterruptedException e) {
		}


		JPanel image = new JPanel();
		image.setLayout(new BoxLayout(image, BoxLayout.PAGE_AXIS));
		image.add(this.mp);

		getContentPane().add(image);

	}

	public void actionPerformed(ActionEvent e) {
	    this.mp.repaint();
	}

	/*
	public static void main(String[] args){
		JFrame mainFrame = new JFrame("4J_21_shinodaApp");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AnimetionApplet a = new AnimetionApplet();
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
	*/
}
