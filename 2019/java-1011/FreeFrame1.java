import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class FreeFrame1 extends JFrame implements ActionListener {
	private JButton button;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JLabel	mainlabel;
	private JLabel	mainlabel2;
	private JLabel	contentslabel1;
	private JLabel	contentslabel2;
	private int		count = 1;
	private int		count2 = 1;

	public FreeFrame1() {
		super();
		this.button = new JButton("Home");
		this.button.setForeground(Color.RED);
		this.button2 = new JButton("Profile");
		this.button3 = new JButton("Task");
		this.button4 = new JButton("今日に比べて");
		this.button5 = new JButton("昨日に比べて");
		this.mainlabel = new JLabel("sinohiroのJavaJava");
		this.mainlabel.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 20));
		this.mainlabel2 = new JLabel("←のプロジェクト");
		this.contentslabel1 = new JLabel("javaでホームページっぽい?");
		this.contentslabel1.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 28));
		this.contentslabel2 = new JLabel("Javaでホームページっぽいもの作ってみた");
		this.contentslabel2.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 28));

		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.add(mainlabel);
		panel1.add(this.button);
		panel1.add(this.button2);
		panel1.add(this.button3);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.add(mainlabel2);
		panel2.add(this.button4);
		panel2.add(this.button5);

		JPanel panel3 = new JPanel();
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
		panel3.add(this.contentslabel1);
		panel3.add(this.contentslabel2);

		JPanel panel4 = new JPanel();
		panel4.setLayout(new BorderLayout());
		panel4.add(panel1, BorderLayout.NORTH);
		panel4.add(panel2, BorderLayout.EAST);
		panel4.add(panel3, BorderLayout.CENTER);

		getContentPane().add(panel4);
		this.button.addActionListener(this);
		this.button2.addActionListener(this);
		this.button3.addActionListener(this);
		this.button4.addActionListener(this);
		this.button5.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.button) {
			this.button.setForeground(Color.RED);
			this.button2.setForeground(Color.BLACK);
			this.button3.setForeground(Color.BLACK);
			this.contentslabel1.setText("Javaでホームページっぽい?");
			this.contentslabel2.setText("Javaでホームページっぽいもの作ってみた");
			System.out.println("Select_Home");
		}
		if (e.getSource() == this.button2) {
			this.button.setForeground(Color.BLACK);
			this.button2.setForeground(Color.RED);
			this.button3.setForeground(Color.BLACK);
			this.contentslabel1.setText("Name: Shinoda Hiroto");
			this.contentslabel2.setText("School: National Institute of Technology, Kushiro College");
			System.out.println("Select_Profile");
		}
		if (e.getSource() == this.button3) {
			this.button.setForeground(Color.BLACK);
			this.button2.setForeground(Color.BLACK);
			this.button3.setForeground(Color.RED);
			this.contentslabel1.setText("・高専祭のバザーの代表者、情報分野店の手伝い(ほぼ企画してる)、プロ研の代表者");
			this.contentslabel2.setText("・数学の単元テスト　きつい");
			System.out.println("Select_Task");
		}
		if (e.getSource() == this.button4) {
			count++;
			this.button4.setText("進捗どうですか? X " + count);
			System.out.println("Count = " + count);
		}
		if (e.getSource() == this.button5) {
			count2++;
			this.button5.setText("進捗どうですか? X " + count2);
			System.out.println("Count2 =" + count2);
		}
	}

	public static void main(String[] args) {
		JFrame mainFrame = new JFrame("4J_21_shinodaApp");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FreeFrame1 a = new FreeFrame1();
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
