class Anime
{
    String name;   // アニメ名
    int toshi  ; // 放送年
    String tuki;  // 放送月
    String channel;  // 放送局

    // コンストラクタ
    Anime(String name, int toshi, String tuki, String channel) {
	this.name = name;
	this.toshi = toshi;
	this.tuki = tuki;
	this.channel = channel;
    }

    void shokai() {
	System.out.println("アニメ名[" + this.name + "] 年[" + this.toshi + "] 季節[" + this.tuki + "] 放送局[" + this.channel + "]");
    }

    void tuki_onazi(Anime a) {
	if (this.tuki.equals(a.tuki)){
	    System.out.println("「" + this.name + "」と「" + a.name + "」は同じ季節の放送です.");
	}
	else {
	    System.out.println("「" + this.name + "」と「" + a.name + "」は違う季節の放送です.");
	}
    }

    void bansakutsukita() {
	this.toshi += 1;
	System.out.println("アニメ名[" + this.name + "]は万策尽きて放送が" + this.toshi +"年に遅れました.残念...");
    }
}
