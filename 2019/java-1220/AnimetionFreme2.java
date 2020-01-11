import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.MediaTracker;

public class AnimetionFreme2 extends JFrame implements ActionListener {
	private AnimetionPanel2 mp;// AnimetionFreme2 HAS-A MyPanel の関係を構築
	private Timer timer;
	private MediaTracker tracker;

	public AnimetionFreme2() {
		super();
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image[] man_array = new Image[4];
		this.mp = new AnimetionPanel2(man_array);
		this.timer = new Timer(100, this);
		this.timer.start();
		tracker = new MediaTracker(this);
		for (int i = 0; i < 4; i++){
			man_array[i] = tk.getImage("man" + i + ".png");
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

	public static void main(String[] args){
		JFrame mainFrame = new JFrame("4J_21_shinodaApp");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AnimetionFreme2 a = new AnimetionFreme2();
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
