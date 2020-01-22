// Time-stamp: <2020-01-21 16:03:23 tenmo>
// 2019 4Jプログラミング言語IIIB アプレット・ランチャー
// 2020.01.21 クラス名AppletMenu20化, 先輩サンプル削除, テーマ20専用化

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class AppletMenu20 extends JFrame implements ActionListener
{
    private static final String rev = "2020.01.21 Rev.02";
    private static final String[] addrs = {
	"01", "相木　宏太　", "p160001", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160001/public_html/applet/20200122",
	"02", "相坂　敏希　", "p160002", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160002/public_html/applet/20200122",
	"03", "石川　悠宇　", "p160013", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160013/public_html/applet/20200122",
	"04", "石倉　直樹　", "p160014", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160014/public_html/applet/20200122",
	"05", "大能　彪駿　", "p160033", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160033/public_html/applet/20200122",
	"06", "大橋　英一郎", "p160034", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160034/public_html/applet/20200122",
	"07", "葛西　彪斗　", "p160043", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160043/public_html/applet/20200122",
	"08", "加藤　楓志　", "p160047", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160047/public_html/applet/20200122",
	"09", "加藤　龍兵　", "p160048", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160048/public_html/applet/20200122",
	"10", "金澤　和嘉　", "p160049", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160049/public_html/applet/20200122",
	"11", "菅野　匠　　", "p160055", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160055/public_html/applet/20200122",
	"12", "菊地　風汰　", "p160056", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160056/public_html/applet/20200122",
	"13", "木澤　涼花　", "p160057", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160057/public_html/applet/20200122",
	"14", "木村　経　　", "p160061", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160061/public_html/applet/20200122",
	"15", "小谷　侑太朗", "p160070", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160070/public_html/applet/20200122",
	"16", "坂上　光紀　", "p160076", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160076/public_html/applet/20200122",
	"17", "佐藤　天音　", "p150412", "http://jusco.infogr.kushiro-ct.ac.jp/home/p150412/public_html/applet/20200122",
	"18", "佐藤　侑哉　", "p160093", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160093/public_html/applet/20200122",
	"19", "淋代　晴菜　", "p160097", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160097/public_html/applet/20200122",
	"21", "篠田　裕人　", "p160101", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160101/public_html/applet/20200122",
	"22", "柴﨑　俊伸　", "p160104", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160104/public_html/applet/20200122",
	"23", "菅原　宗馬　", "p160111", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160111/public_html/applet/20200122",
	"25", "竹田　光　　", "p160126", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160126/public_html/applet/20200122",
	"29", "中島　哲　　", "p160132", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160132/public_html/applet/20200122",
	"30", "中野　琉斗　", "p160134", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160134/public_html/applet/20200122",
	"31", "沼倉　亮　　", "p160141", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160141/public_html/applet/20200122",
	"32", "平澤　慎　　", "p160149", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160149/public_html/applet/20200122",
	"33", "ジャーリー　", "p184071", "http://jusco.infogr.kushiro-ct.ac.jp/home/p184071/public_html/applet/20200122",
	"34", "堀内　琉郁　", "p160153", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160153/public_html/applet/20200122",
	"35", "本間　春輝　", "p160155", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160155/public_html/applet/20200122",
	"36", "松下　晃矢　", "p160156", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160156/public_html/applet/20200122",
	"38", "渡部　龍一　", "p160182", "http://jusco.infogr.kushiro-ct.ac.jp/home/p160182/public_html/applet/20200122",
    };
    private JButton[] buttons;
    
    public AppletMenu20()
    {
	super("4Jプログラミング言語IIIB アプレット・ランチャー テーマ20" + " " + rev);
	final int n = addrs.length / 4;
	this.buttons = new JButton[n];
	JPanel p = new JPanel();
	for (int i = 0; i < n; i++)
	{
	    String s = addrs[i * 4 + 0] + " " + addrs[i * 4 + 1];
	    this.buttons[i] = new JButton(s);
	    p.add(this.buttons[i]);
	    this.buttons[i].addActionListener(this);
	}
	super.getContentPane().add(p);
    }
    
    public void actionPerformed(ActionEvent ev)
    {
	final int n = addrs.length / 4;
	for (int i = 0; i < n; i++)
	{
	    if (ev.getSource() == this.buttons[i])
	    {
		String base = addrs[i * 4 + 3];
		String iu = base + "/" + "index.html";
		String ju = base + "/" + addrs[i * 4 + 2] + ".jar";
		String it = "/tmp" + "/" + "index.html";
		String jt = "/tmp" + "/" + addrs[i * 4 + 2] + ".jar";
		System.out.println(iu);
		System.out.println(ju);
		System.out.println(it);
		System.out.println(jt);
		Runtime runtime = Runtime.getRuntime();
		try
		{
		    String[] cmd1 = { "wget", "--no-proxy", "-O", it, iu };
		    runtime.exec(cmd1);
		    String[] cmd2 = { "wget", "--no-proxy", "-O", jt, ju };
		    runtime.exec(cmd2);
		    String[] cmd3 = { "firefox", it };
		    runtime.exec(cmd3);
		    String[] cmd4 = { "appletviewer", it };
		    runtime.exec(cmd4);
		} catch (Exception ex) {
		    ex.printStackTrace();
		}
		break;
	    }
	}
    }
    
    public static void main(String[] args)
    {
	AppletMenu20 a = new AppletMenu20();
	a.setSize(640, 300);
	a.setVisible(true);
	a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
