class GakuseiApp {
    public static void main(String[] args) {
	Gakusei shinoda = new Gakusei();
	Aitemu shinodaAitem = new Aitemu();
	shinoda.setgakunen(7);
	shinoda.setbunya("情報");
	shinoda.setnamae("しのだひろと");

	shinodaAitem.setaitemumei("スマホ");
	shinodaAitem.setattack(-20);
	shinoda.setaitemuc(shinodaAitem);

	shinoda.shokai(); // 通常版メソッドを呼び出す
	//shinodaAitem.Ashokai();
	//
	Gakusei joutarou = new Gakusei();
	Aitemu joutarouAitem = new Aitemu();
	joutarou.setgakunen(5);
	joutarou.setbunya("妖精");
	joutarou.setnamae("じょうたろう");

	joutarouAitem.setaitemumei("剣");
	joutarouAitem.setattack(90);
	joutarou.setaitemuc(joutarouAitem);

	joutarou.shokai(); // 通常版メソッドを呼び出す
	//joutarouAitem.Ashokai();

    }
}
