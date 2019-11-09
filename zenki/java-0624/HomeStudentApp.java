public class HomeStudentApp {
    public static void main(String[] args) {
	Student joutarou = new Student(5, "妖精", "じょうたろう");

	HomeStudent shinoda = new HomeStudent(4, "情報", "しのだひろと", "バス");

	joutarou.shokai();
	shinoda.shokai();
    }
}
