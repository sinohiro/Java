import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;

public class TextEditor extends JFrame implements ActionListener {
	private JButton button1;
	private JButton button2;
	private JLabel	mainlabel;
	private JLabel	mainlabel2;
	private JTextField tf1;
	private JTextArea ta1;

	public TextEditor() {
		super();
		this.button1 = new JButton("file_Open");
		this.button2 = new JButton("file_Save");
		this.mainlabel = new JLabel("FileReader_Test_Progrram");
		this.mainlabel.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 20));
		this.mainlabel2 = new JLabel("Pleese_input_FileName -> ");
		this.tf1 = new JTextField(10);
		this.ta1 = new JTextArea(10, 20);

		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.add(this.mainlabel);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.add(this.mainlabel2);
		panel2.add(this.tf1);
		panel2.add(this.button1);

		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
		panel3.add(this.ta1);
		panel3.add(this.button2);

		JPanel panel4 = new JPanel();
		panel4.setLayout(new BoxLayout(panel4, BoxLayout.PAGE_AXIS));
		panel4.add(panel1);
		panel4.add(panel2);
		panel4.add(panel3);

		getContentPane().add(panel4);
		this.button1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == this.button1) {
			String gettext1 = this.tf1.getText();
			try {
				FileReader fr = new FileReader(gettext1); // ファイルを開く.
				BufferedReader br = new BufferedReader(fr);
				String buf;
				while ((buf = br.readLine()) != null) // 1行読み込み, それがnullでなければ,
					{
						this.ta1.setText(buf);
						System.out.println("File_Output -> \n" + buf); // bufを処理する(この例では表示するだけ).
				}
				br.close();
				fr.close(); // ファイルを閉じる.
			}
			catch (IOException e) {
							System.out.println("ファイル読み込みエラー");
							this.ta1.setText("Error: ファイルが見つかりません!!");
							//System.exit(1); // 実行終了
			}
		}
	}

	public static void main(String[] args) {
		JFrame mainFrame = new JFrame("4J_21_shinodaApp");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TextEditor a = new TextEditor();
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
