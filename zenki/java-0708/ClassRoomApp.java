class ClassRoomApp {
	public static void main(String[] args) {
		HomeStudent joutarou = new HomeStudent(4, "妖精", "じょうたろう", "ホバー");
		HomeStudent shinoda = new HomeStudent(4, "情報", "しのだひろと", "バス");
		HomeStudent huuka = new HomeStudent(4, "情報", "かとうふうか", "瞬間移動");
		DormStudent a = new DormStudent(4, "情報", "アルファ");
		DormStudent	b = new DormStudent(4, "情報", "ベータ");
		DormStudent c = new DormStudent(4, "情報", "チャーリー");

		a.setroommate(b);

		ClassRoom j4 = new ClassRoom();
		j4.add(joutarou);
		j4.add(shinoda);
		j4.add(huuka);
		j4.add(a);
		j4.add(b);
		j4.add(c);

		j4.del(2);
		j4.zenshokai();

		j4.setmaxgakusei(6);
		j4.add(c);;

		j4.zenshokai();
	}
}
