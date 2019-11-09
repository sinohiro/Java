import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AppTest4 extends JFrame implements ActionListener {
	private JButton button;
	public AppTest4() {
		super();
		this.button = new JButton("今日の");
		getContentPane().add(this.button);
		this.button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.button) {
			this.button.setText("進捗どうですか?");
			//System.out.println("進捗どうですか?");
		}
	}


	public static void main(String[] args) {
		AppTest4 a = new AppTest4();
		a.setSize(640, 480);
		a.setLocation(100, 100);
		a.setVisible(true);
	}
}
