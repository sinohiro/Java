class UranaiApp {
    public static void main(String args[]) {
	Uranai a = new Uranai(name, nameid);
	Uranai b = new Uranai(name, nameid);

	a.print();
	a.hantei(b);
	b.print();
	b.hantei(a);
