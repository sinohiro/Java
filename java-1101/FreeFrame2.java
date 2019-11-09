import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class FreeFrame2 extends JFrame implements ActionListener {
	private JRadioButton rb1, rb2, rb3;
	private JCheckBox cb1, cb2, cb3;
	private JButton kettei;
	private JLabel	mainlabel1, yearlabel, animelabel1, animelabel2, animelabel3;
	private String year, label1, label2, label3;
	private String anime1, anime2, anime3, anime4, anime5, anime6, anime7, anime8, anime9;

	public FreeFrame2() {
		super();
		this.cb1 = new JCheckBox("魔法系");
		this.cb2 = new JCheckBox("戦場系");
		this.cb3 = new JCheckBox("近未来系");

		this.rb1 = new JRadioButton("2017", true);
		this.rb2 = new JRadioButton("2018");
		this.rb3 = new JRadioButton("2019");

		this.kettei = new JButton("検索開始!!");
		this.mainlabel1 = new JLabel("アニメ検索あぷりけーしょん!!");
		this.mainlabel1.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 28));
		this.yearlabel = new JLabel("");
		this.yearlabel.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 28));
		this.animelabel1 = new JLabel("");
		this.animelabel1.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 28));
		this.animelabel2 = new JLabel("");
		this.animelabel2.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 28));
		this.animelabel3 = new JLabel("");
		this.animelabel3.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 28));
		this.label1 = "";
		this.label2 = "";
		this.label3 = "";
		this.anime1 = "";
		this.anime2 = "";
		this.anime3 = "";
		this.anime4 = "";
		this.anime5 = "";
		this.anime6 = "";
		this.anime7 = "";
		this.anime8 = "";
		this.anime9 = "";

		ButtonGroup group = new ButtonGroup();
		group.add(this.rb1);
		group.add(this.rb2);
		group.add(this.rb3);

		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.add(this.mainlabel1);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(2, 3));
		panel2.add(this.rb1);
		panel2.add(this.rb2);
		panel2.add(this.rb3);
		panel2.add(this.cb1);
		panel2.add(this.cb2);
		panel2.add(this.cb3);

		JPanel panel3 = new JPanel();
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
		panel3.add(this.kettei);
		panel3.add(this.yearlabel);
		panel3.add(this.animelabel1);
		panel3.add(this.animelabel2);
		panel3.add(this.animelabel3);

		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(3, 1));
		panel4.add(panel1);
		panel4.add(panel2);
		panel4.add(panel3);

		getContentPane().add(panel4);
		this.kettei.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.kettei) {
			//初期化
			this.label1 = "";
			this.label2 = "";
			this.label3 = "";
			this.anime1 = "";
			this.anime2 = "";
			this.anime3 = "";
			this.anime4 = "";
			this.anime5 = "";
			this.anime6 = "";
			this.anime7 = "";
			this.anime8 = "";
			this.anime9 = "";
			System.out.println("shokika");
			//2017
			if (this.rb1.isSelected()) {
				System.out.println("2017");
				year = "2017";
				if (this.cb1.isSelected()){
					System.out.println("Mahou");
					this.label1 = "魔法系";
					this.anime1 = "魔法陣グルグル MAGICAL CIRCLE";
					this.anime2 = "魔法少女育成計画";
					this.anime3 = "魔法使いの嫁";
				}
				if (this.cb2.isSelected()){
					System.out.println("senjou");
					this.label2 = "戦場系";
					this.anime4 = "幼女戦記";
					this.anime5 = "ゲートSeason2 自衛隊 彼の海にて、斯く戦えり";
					this.anime6 = "OVA ハイスクール・フリート";
				}
				if (this.cb3.isSelected()){
					System.out.println("kinmirai");
					this.label3 = "近未来系";
					this.anime7 = "アトム ザ・ビギニング";
					this.anime8 = "クロックワーク・プラネット";
					this.anime9 = "ナイツ＆マジック";
				}
			}
			//2018
			if (this.rb2.isSelected()) {
				System.out.println("2018");
				year = "2018";
				if (this.cb1.isSelected()){
					System.out.println("Mahou");
					this.label1 = "魔法系";
					this.anime1 = "異世界魔王と召喚少女の奴隷魔術";
					this.anime2 = "転生したらスライムだった件";
					this.anime3 = "RELEASE THE SPYCE";
				}
				if (this.cb2.isSelected()){
					System.out.println("senjou");
					this.label2 = "戦場系";
					this.anime4 = "LOST SONG";
					this.anime5 = "ヴァイオレット・エヴァーガーデン";
					this.anime6 = "刀使ノ巫女";
				}
				if (this.cb3.isSelected()){
					System.out.println("kinmirai");
					this.label3 = "近未来系";
					this.anime7 = "INGRESS THE ANIMATION";
					this.anime8 = "ソードアート・オンライン アリシゼーション";
					this.anime9 = "ダーリン・イン・ザ・フランキス";
				}
			}
			//2019
			if (this.rb3.isSelected()) {
				System.out.println("2019");
				year = "2019";
				if (this.cb1.isSelected()){
					System.out.println("Mahou");
					this.label1 = "魔法系";
					this.anime1 = "ありふれた職業で世界最強";
					this.anime2 = "魔法少女特殊戦あすか";
					this.anime3 = "賢者の孫";
				}
				if (this.cb2.isSelected()){
					System.out.println("senjou");
					this.label2 = "戦場系";
					this.anime4 = "アズールレーン";
					this.anime5 = "鬼滅の刃";
					this.anime6 = "荒野のコトブキ飛行隊";
				}
				if (this.cb3.isSelected()){
					System.out.println("kinmirai");
					this.label3 = "近未来系";
					this.anime7 = "ガーリー・エアフォース";
					this.anime8 = "サークレット・プリンセス";
					this.anime9 = "エガオノダイカ";
				}
			}
			//出力
			if ((this.cb1.isSelected()) || (this.cb2.isSelected()) || (this.cb3.isSelected())){
			this.yearlabel.setText(year + "Anime" + label1 + "  " + label2 + "  " + label3);
			this.animelabel1.setText(anime1 + "  " + anime2 + "  " + anime3);
			this.animelabel2.setText(anime4 + "  " + anime5 + "  " + anime6);
			this.animelabel3.setText(anime7 + "  " + anime8 + "  " + anime9);
			}
			else {
				this.yearlabel.setText("アニメジャンルを選択してください");
				this.animelabel1.setText(anime1 + "  " + anime2 + "  " + anime3);
				this.animelabel2.setText(anime4 + "  " + anime5 + "  " + anime6);
				this.animelabel3.setText(anime7 + "  " + anime8 + "  " + anime9);
			}
		}
	}

	public static void main(String[] args) {
		JFrame mainFrame = new JFrame("4J_21_shinodaApp");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FreeFrame2 a = new FreeFrame2();
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
