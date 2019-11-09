import javax.swing.*;

public class AppTest2 extends JFrame {
	private JButton button;
	public AppTest2() {
		super();
		this.button = new JButton("stop");
		getContentPane().add(this.button);
	}

	public static void main(String[] args) {
		AppTest2 a = new AppTest2();
		a.setSize(640, 480);
		a.setLocation(100, 100);
		a.setVisible(true);
	}
}
