class Vector2DApp{
    public static void main(String args[]){
	Vector2D a;
	a = new Vector2D(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
	a.print();
	System.exit(0);
    }
}
