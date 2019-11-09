class Vector2DApp3{
    public static void main(String args[]){
	Vector2D3 a;
	a = new Vector2D3(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
	a.print();

	double kadai2;
	kadai2 = a.calcNorm();
	System.out.println("ベクトルの大きさは" + kadai2);

	Vector2D3 b;
	
	b = new Vector2D3(Double.parseDouble(args[2]), Double.parseDouble(args[3]));

	a.subtract(b);

	a.print();

	

	System.exit(0);
    }
}
