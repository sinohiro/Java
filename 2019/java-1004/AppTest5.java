import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AppTest5 extends JFrame implements ActionListener {
	private JButton button;
	private JLabel	countlabel;
	private int			count = 0;

	public AppTest5() {
		super();
		this.button = new JButton("今日の");
		getContentPane().add(this.button);
		this.button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.button) {
			count++;
			this.button.setText("進捗どうですか? X " + count);
			System.out.println(count);
		}
	}


	public static void main(String[] args) {
		JFrame mainFrame = new JFrame("4J_21_shinodaApp");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AppTest5 a = new AppTest5();
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
