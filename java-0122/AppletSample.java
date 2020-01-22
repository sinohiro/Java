// Time-stamp: <2020-01-21 17:41:08 tenmo>
// 2019 4Jプログラミング言語IIIB アプレット・ランチャー
// 2020.01.21 クラス名AppletSample化, 先輩サンプル専用化

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class AppletSample extends JFrame implements ActionListener
{
    private static final String rev = "2020.01.21 Rev.02";
    private static final String[] addrs = {
	"2016-01", "先輩", "p130407", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2016/20/p130407/public_html/applet/20170112",
	"2016-02", "先輩", "p130415", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2016/20/p130415/public_html/applet/20170112",
	"2016-03", "先輩", "p130418", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2016/20/p130418/public_html/applet/20170112",
	"2016-04", "先輩", "p130426", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2016/20/p130426/public_html/applet/20170112",
	"2016-05", "先輩(音注意)", "p130429", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2016/20/p130429/public_html/applet/20170112",
	"2016-06", "先輩", "p130430", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2016/20/p130430/public_html/applet/20170112",
	"2016-07", "先輩", "p130433", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2016/20/p130433/public_html/applet/20170112",
	"2016-08", "先輩", "p130435", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2016/20/p130435/public_html/applet/20170112",
	"2016-09", "先輩", "p130404", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2016/20/p130404/public_html/applet/20170112",
	"2016-10", "先輩", "p130412", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2016/20/p130412/public_html/applet/20170112",
	"2016-11", "先輩", "p130319", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2016/20/p130319/public_html/applet/20170112",
	"2016-12", "先輩", "p130417", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2016/20/p130417/public_html/applet/20170112",
	"2016-13", "先輩", "p130420", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2016/20/p130420/public_html/applet/20170112",
	"2016-14", "先輩", "p130437", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2016/20/p130437/public_html/applet/20170112",
	"2016-15", "先輩", "p130440", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2016/20/p130440/public_html/applet/20170112",
	// ------------------------------------------------------------------------
	"2015-01", "先輩", "p120401", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2015/20/p120401/applet/20160115",
	"2015-02", "先輩", "p120402", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2015/20/p120402/applet/20160115",
	"2015-03", "先輩", "CrossSimulator", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2015/20/p120408/applet/20160115",
	"2015-04", "先輩", "p120329", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2015/20/p120329/applet/20160115",
	"2015-05", "先輩", "p120405", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2015/20/p120405/applet/20160115",
	"2015-06", "先輩", "p120406", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2015/20/p120406/applet/20160115",
	"2015-07", "先輩", "p120207", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2015/20/p120207/applet/20160115",
	"2015-08", "先輩", "p120410", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2015/20/p120410/applet/20160115",
	"2015-09", "先輩", "0204", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2015/20/p120227/applet/20160115",
	"2015-10", "先輩", "p120425", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2015/20/p120425/applet/20160115",
	"2015-11", "先輩", "p120428", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2015/20/p120428/applet/20160115",
	"2015-12", "先輩", "p120432", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2015/20/p120432/applet/20160115",
	"2015-13", "先輩", "p120531", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2015/20/p120531/applet/20160115",
	"2015-14", "先輩", "kazaguruma", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2015/20/p120440/applet/20160115",
	// ------------------------------------------------------------------------
	"2014-01", "先輩", "p110215", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2014/20/p110215/applet/20150114",
	"2014-02", "先輩", "p110233", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2014/20/p110233/applet/20150114",
	"2014-03", "先輩", "p110419", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2014/20/p110419/applet/20150114",
	"2014-04", "先輩", "p130471", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2014/20/p130471/applet/20150114",
	"2014-05", "先輩", "p110426", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2014/19/p110426/applet/20150107",
	"2014-06", "先輩", "p130471", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2014/19/p130471/applet/20150107",
	"2014-07", "先輩", "p110226", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2014/20/p110226/applet/20150114",
	"2014-08", "先輩", "p110322", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2014/20/p110322/applet/20150114",
	"2014-09", "先輩", "p110406", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2014/20/p110406/applet/20150114",
	"2014-10", "先輩", "p110418", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2014/20/p110418/applet/20150114",
	"2014-11", "先輩", "p110431", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2014/20/p110431/applet/20150114",
	// ------------------------------------------------------------------------
	"2013-01", "先輩", "p100402", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2013/20/p100402/applet/20140116",
	"2013-02", "先輩", "p100419", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2013/20/p100419/applet/20140116",
	"2013-03", "先輩", "p100420", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2013/20/p100420/applet/20140116",
	"2013-04", "先輩", "p100402", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2013/19/p100402/applet/20140109",
	"2013-05", "先輩", "p100420", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2013/19/p100420/applet/20140109",
	"2013-06", "先輩", "p100401", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2013/20/p100401/applet/20140116",
	"2013-07", "先輩", "p100422", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2013/20/p100422/applet/20140116",
	// ------------------------------------------------------------------------
	"2012-01", "先輩", "p090138", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2012/20/p090138/applet/20130116/",
	"2012-02", "先輩", "p090401", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2012/20/p090401/applet/20130116/",
	"2012-03", "先輩", "p090429", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2012/20/p090429/applet/20130116/",
	// ------------------------------------------------------------------------
	"2008-01", "レジェンド", "j1701", "http://jsuri1.info.kushiro-ct.ac.jp/~tenmo/oc2019/applet/2008/20/j1701",
    };
    private JButton[] buttons;
    
    public AppletSample()
    {
	super("4Jプログラミング言語IIIB アプレット・ランチャー 先輩サンプル" + " " + rev);
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
		Process p;
		try
		{
		    String[] cmd1 = { "wget", "--quiet", "--no-proxy", "-O", it, iu };
		    p = runtime.exec(cmd1); p.waitFor();
		    String[] cmd2 = { "wget", "--quiet", "--no-proxy", "-O", jt, ju };
		    p = runtime.exec(cmd2); p.waitFor();
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
	AppletSample a = new AppletSample();
	a.setSize(640, 480);
	a.setVisible(true);
	a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
