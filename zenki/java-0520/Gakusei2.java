class Gakusei2
{
    int gakunen;   // 学年
    String bunnya; // 分野 "機械", "電気", "電子", "情報", "建築"のいずれかの文字列
    String namae;  // 名前
    String jukyo;  // 住居

    // コンストラクタ
    Gakusei2(int gakunen, String bunnya, String namae, String jukyo) {
	this.gakunen = gakunen;
	this.bunnya = bunnya;
	this.namae = namae;
	this.jukyo = jukyo;
    }

    void shokai() // 通常版
    {
	// gakunen, bunnya, namaeはthis(主役)のフィールドを使う.
	System.out.println("私は「" + this.gakunen + "年" + this.bunnya + "」の「" + this.namae + "」です. 私の住居は「" + this.jukyo + "」です.");
    }
    static void shokai(Gakusei2 a) // static版
    {
	// gakunen, bunnya, namaeは引数aのフィールドを使う.
	System.out.println("彼は「" + a.gakunen + "年" + a.bunnya + "」の「" + a.namae + "」君です. 私の住居は「" + a.jukyo + "」です.");
    }

    void yujin(Gakusei2 a) {
	System.out.println("私「" + this.namae + "」は「" + a.namae + "」君と友人です.");
    }

    static void yujin(Gakusei2 a, Gakusei2 b) {
	System.out.println("「" + a.namae + "」は「" + b.namae + "」君と友人です.");
    }	

    void combi(Gakusei2 a) {
	if (this.jukyo.equals(a.jukyo)){	    	
		System.out.println("私「" + this.namae + "」と「" + a.namae + "」君はコンビです.");
	}
	else {
		System.out.println("私「" + this.namae + "」は「" + a.namae + "」君はコンビではありません.");
	}
    }

    static void combi(Gakusei2 a, Gakusei2 b) {
	if (a.jukyo.equals(b.jukyo)){
		System.out.println("「" + a.namae + "」と「" + b.namae + "」君はコンビです.");
	}
	else {
		System.out.println("「" + a.namae + "」は「" + b.namae + "」君はコンビではない.");
	}
    }

    void shinkyu(){
	this.gakunen += 1;
	System.out.println("私は" + this.gakunen + "年に進級しました!");
    }

    static void shinkyu(Gakusei2 a){
	a.gakunen += 1;
	System.out.println("「" + a.namae + "」は" + a.gakunen + "年に進級しました!");
    }
}

