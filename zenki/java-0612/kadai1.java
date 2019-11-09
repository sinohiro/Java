class kadai1 {
    public static void main(String[] args) {
	String s = "しのだひろと";
	int i;

	for (i = 0; i < s.length() ; i++) {
	    System.out.print(s.substring(i, i + 1) + " ");
	}

	System.out.println();

	for (i = 0; i + 1 < s.length() ; i++) {
	    System.out.print(s.substring(i, i + 2) + " ");
	}
	System.out.println();
    }
}
