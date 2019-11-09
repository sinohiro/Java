class UranaiApp {
    public static void main(String args[]) {
	Uranai shinoda = new Uranai(args[0], args[1]);
	Uranai joutarou = new Uranai(args[2], args[3]);

	shinoda.print();
	shinoda.hantei(joutarou);
	joutarou.print();
	joutarou.hantei(shinoda);
	System.out.println("static_hantei");
	Uranai.hantei(shinoda, joutarou);
	Uranai.hantei(joutarou, shinoda);
    }
}
