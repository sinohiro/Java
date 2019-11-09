class Vector2DApp3{
    public static void main(String args[]){
	Vector2D3 a;
	a = new Vector2D3();

	a.x = Double.parseDouble(args[0]);
	a.y = Double.parseDouble(args[1]);
	
	a.print();

	double kadai5;
        kadai5 = a.calcNorm();
        System.out.println("ベクトルの大きさは" + kadai5);

	System.exit(0);
    }
}
