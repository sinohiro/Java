class StudentApp {
    public static void main(String[] args) {
	Student shinoda = new Student(4, "情報", "しのだひろと");
	
	shinoda.shokai(); // 通常版メソッドを呼び出す
	
	Student joutarou = new Student(5, "妖精", "じょうたろう");
	
	joutarou.shokai(); // 通常版メソッドを呼び出す

    }
}
