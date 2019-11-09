class Vector2DApp2{
    public static void main(String args[]){
	Vector2D a;
	a = new Vector2D();

	double ix = Integer.parseInt(args[0]);
	double iy = Integer.parseInt(args[1]);
	a.x = ix;
	a.y = iy;

	a.print();

	Vector2D b;
	b = a;

	b.x = Double.parseDouble(args[2]);
	b.y = Double.parseDouble(args[3]);

	b.print();
	a.print();

	System.exit(0);
    }
}
