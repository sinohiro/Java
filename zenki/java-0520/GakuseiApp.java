class GakuseiApp
{
    public static void main(String[] args)
    {
	Gakusei shinoda = new Gakusei(4, "情報", "しのだひろと");
	Gakusei joutarou   = new Gakusei(5, "情報", "じょうほうたろう");
	shinoda.shokai(); // 通常版メソッドを呼び出す
	joutarou.shokai();   // 通常版メソッドを呼び出す
	Gakusei.shokai(shinoda); // static版メソッドを呼び出す
	Gakusei.shokai(joutarou);   // static版メソッドを呼び出す
    }
}
