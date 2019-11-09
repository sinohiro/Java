class Gakusei
{
    int gakunen;   // 学年
    String bunnya; // 分野 "機械", "電気", "電子", "情報", "建築"のいずれかの文字列
    String namae;  // 名前

    // コンストラクタ
    Gakusei(int gakunen, String bunnya, String namae) {
	this.gakunen = gakunen;
	this.bunnya = bunnya;
	this.namae = namae;
    }

    void shokai() // 通常版
    {
	// gakunen, bunnya, namaeはthis(主役)のフィールドを使う.
	System.out.println("私は「" + this.gakunen + "年" + this.bunnya + "」の「" + this.namae + "」です. ");
    }
    static void shokai(Gakusei a) // static版
    {
	// gakunen, bunnya, namaeは引数aのフィールドを使う.
	System.out.println("彼は「" + a.gakunen + "年" + a.bunnya + "」の「" + a.namae + "」君です. ");
    }
}

