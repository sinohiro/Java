import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JRadiotest extends JFrame implements ActionListener {
	private JRadioButton rb1, rb2, rb3;
	private JButton kettei;
	private JLabel	contentslabel1;

	public JRadiotest() {
		super();
		this.rb1 = new JRadioButton("大学編入学");
		this.rb2 = new JRadioButton("専攻科進学", true);
		this.rb3 = new JRadioButton("就職");
		this.kettei = new JButton("決定");
		this.contentslabel1 = new JLabel("");
		this.contentslabel1.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 28));

		ButtonGroup group = new ButtonGroup();
		group.add(this.rb1);
		group.add(this.rb2);
		group.add(this.rb3);

		this.kettei = new JButton("進路決定");

		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.add(this.rb1);
		panel1.add(this.rb2);
		panel1.add(this.rb3);
		panel1.add(this.kettei);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		panel2.add(this.contentslabel1);

		JPanel panel3 = new JPanel();
		panel3.setLayout(new BorderLayout());
		panel3.add(panel1, BorderLayout.NORTH);
		panel3.add(panel2, BorderLayout.CENTER);

		getContentPane().add(panel3);
		this.kettei.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.kettei) {
			if (this.rb3.isSelected()) {
				this.contentslabel1.setText("習系科目の成績が特に重要です. プロ言100点を目指して頑張りましょう!");
				System.out.println("習系科目の成績が特に重要です. プロ言100点を目指して頑張りましょう!");
			}
		}
	}

	public static void main(String[] args) {
		JFrame mainFrame = new JFrame("4J_21_shinodaApp");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JRadiotest a = new JRadiotest();
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
