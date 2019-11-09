class Gakusei {
    private int gakunen;   // 学年
    private String bunya; // 分野 "機械", "電気", "電子", "情報", "建築"のいずれかの文字列
    private String namae;  // 名前
    private Aitemu aitemuc;

    // コンストラクタ
    Gakusei() {
	this.gakunen = 0;
	this.bunya = "未定";
	this.namae = "未定";
    }

    int getgakunen() {
	return gakunen;
    }

    String getbunya() {
	return bunya;
    }

    String getnamae() {
	return namae;
    }

    Aitemu getaitemuc() {
	return aitemuc;
    }

    void setgakunen(int gakunen) {
	if (gakunen >= 1 && gakunen <= 5) {
	    this.gakunen = gakunen;
	}
    }

    void setbunya(String bunya) {
	if (bunya.equals("情報") || bunya.equals("機械") || bunya.equals("電子") || bunya.equals("電気") || bunya.equals("建築")) {
	    this.bunya = bunya;
	}
    }

    void setnamae(String namae) {
	this.namae = namae;
    }

    void setaitemuc(Aitemu aitemuc) {
	this.aitemuc = aitemuc;
    }

    void shokai() {
	System.out.println("私は「" + this.gakunen + "年" + this.bunya + "」の「" + this.namae + "」です.");
	
	if (aitemuc != null){
	System.out.println("私は" + aitemuc.getaitemumei() + "を持っています");
	System.out.println("詳細は");
	aitemuc.Ashokai();
	}
    }
}

class Aitemu {
    private String aitemumei = null;
    private int attack = 0;

    String getaitemumei() {
	return aitemumei;
    }

    int gettimeido() {
	return attack;
    }

    void setaitemumei(String aitemumei) {
	if (aitemumei.equals("剣")) {
	    this.aitemumei = aitemumei;
	}
    }

    void setattack(int attack) {
	if (attack >= 0 && attack <= 100) {
	    this.attack = attack;
	}
    }

    void Ashokai() {
	System.out.println("あなたの攻撃力は" + this.attack + "です");
    }
}
