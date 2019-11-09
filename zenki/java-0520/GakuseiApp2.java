class GakuseiApp2
{
    public static void main(String[] args)
    {
	Gakusei2 shinoda = new Gakusei2(4, "情報", "しのだひろと", "自宅");
	Gakusei2 joutarou = new Gakusei2(3, "情報", "じょうほうたろう", "学寮");
	Gakusei2 katochan = new Gakusei2(4, "情報", "かとうふうか", "学寮");
	shinoda.shokai(); // 通常版メソッドを呼び出す
	joutarou.shokai();   // 通常版メソッドを呼び出す
	Gakusei2.shokai(shinoda); // static版メソッドを呼び出す
	Gakusei2.shokai(joutarou);   // static版メソッドを呼び出す
	
	shinoda.yujin(joutarou);
	joutarou.yujin(shinoda);
	Gakusei2.yujin(shinoda, joutarou);

	shinoda.combi(joutarou);
	Gakusei2.combi(shinoda, joutarou);
	katochan.shokai();
	katochan.combi(joutarou);
	Gakusei2.combi(katochan, joutarou);

	joutarou.shinkyu();
	Gakusei2.shinkyu(katochan);
	joutarou.shokai();
	katochan.shokai();
    }
}
