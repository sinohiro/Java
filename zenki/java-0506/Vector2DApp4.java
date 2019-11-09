class Vector2DApp4{
    public static void main(String args[]){
	Vector2D4 a;
	a = new Vector2D4(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
	
	double kadai4;

	kadai4 = a.x - a.y;
	kadai4 = a.calcNorm();
	a.print();
	System.out.println("2点換の距離は" + kadai4);

	System.exit(0);
    }
}
