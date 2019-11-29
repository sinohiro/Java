import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderTest extends JFrame implements ChangeListener {
	private JSlider slider;
	private JLabel sp;

	public SliderTest() {
		super();
		this.slider = new JSlider();
		this.sp = new JLabel();
		sp.setText("SliderPoint: " + slider.getValue());

		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.add(this.slider);
		panel1.add(this.sp);

		getContentPane().add(panel1);
		this.slider.addChangeListener(this);
	}

	public void stateChanged(ChangeEvent e) {
		sp.setText("SliderPoint: " + slider.getValue());
	}

public static void main(String[] args) {
		JFrame mainFrame = new JFrame("4J_21_shinodaApp");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SliderTest a = new SliderTest();
		a.setTitle("4J_21_shinodaApp");
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
