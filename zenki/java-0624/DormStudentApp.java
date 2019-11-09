public class DormStudentApp {
    public static void main(String[] args) {
	DormStudent joutarou = new DormStudent(5, "妖精", "じょうたろう");
	DormStudent shinoda = new DormStudent(4, "情報", "しのだひろと");
	
	joutarou.setroommate(shinoda);

	joutarou.shokai();
	shinoda.shokai();
    }
}
