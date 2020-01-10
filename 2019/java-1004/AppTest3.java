import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AppTest3 extends JFrame implements ActionListener {
	private JButton button;
	public AppTest3() {
		super();
		this.button = new JButton("stop");
		getContentPane().add(this.button);
		this.button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.button) {
			System.out.println("進捗どうですか?");
		}
	}


	public static void main(String[] args) {
		AppTest3 a = new AppTest3();
		a.setSize(640, 480);
		a.setLocation(100, 100);
		a.setVisible(true);
	}
}
