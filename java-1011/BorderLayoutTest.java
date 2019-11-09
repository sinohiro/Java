import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class BorderLayoutTest extends JFrame implements ActionListener {
	private JButton button;
	private JButton button2;
	private JLabel	countlabel;
	private int			count = 1;
	private int			count2 = 1;

	public BorderLayoutTest() {
		super();
		this.button = new JButton("今日に比べて");
		this.button2 = new JButton("昨日に比べて");
		JLabel label1 = new JLabel("今回のプロジェクト");

		JPanel panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());

		panel1.add(label1, BorderLayout.NORTH);
		panel1.add(this.button, BorderLayout.WEST);
		panel1.add(this.button2, BorderLayout.EAST);
		getContentPane().add(panel1);
		this.button.addActionListener(this);
		this.button2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.button) {
			count++;
			this.button.setText("進捗どうですか? X " + count);
			System.out.println(count);
		}
		if (e.getSource() == this.button2) {
			count2++;
			this.button2.setText("進捗どうですか? X " + count2);
			System.out.println(count2);
		}

	}


	public static void main(String[] args) {
		JFrame mainFrame = new JFrame("4J_21_shinodaApp");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayoutTest a = new BorderLayoutTest();
		a.setSize(640, 480);
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
