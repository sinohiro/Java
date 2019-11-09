cass Vector2DApp2{
    public static void main(String args[]){
	Vector2D2 a;
	a = new Vector2D2(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
	a.print();

	double kadai2;
	kadai2 = a.calcNorm();
	System.out.println("ベクトルの大きさは" + kadai2);

	System.exit(0);
    }
}
