class Vector2DApp{
    public static void main(String args[]){
	Vector2D a;
	a = new Vector2D();

	double ix = Integer.parseInt(args[0]);
	double iy = Integer.parseInt(args[1]);
	a.x = ix;
	a.y = iy;

	a.print();

	System.exit(0);
    }
}
