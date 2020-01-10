import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JChecktest extends JFrame implements ActionListener {
	private JCheckBox cb1, cb2;
	private JButton judge;
	private JLabel	contentslabel1;

	public JChecktest() {
		super();
		this.cb1 = new JCheckBox("数学が得意");
		this.cb2 = new JCheckBox("英語が得意", true);
		this.judge = new JButton("判定");
		this.contentslabel1 = new JLabel("");
		this.contentslabel1.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 28));
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.add(this.cb1);
		panel1.add(this.cb2);
		panel1.add(this.judge);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		panel2.add(this.contentslabel1);

		JPanel panel3 = new JPanel();
		panel3.setLayout(new BorderLayout());
		panel3.add(panel1, BorderLayout.NORTH);
		panel3.add(panel2, BorderLayout.CENTER);


		getContentPane().add(panel3);
		this.judge.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.judge) {
			if (this.cb1.isSelected()) {
				this.contentslabel1.setText("Pass, but English is also important.");
				System.out.println("Pass, but English is also important.");
			}
		}
	}

	public static void main(String[] args) {
		JFrame mainFrame = new JFrame("4J_21_shinodaApp");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JChecktest a = new JChecktest();
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
