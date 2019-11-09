class Vector2DApp{
    public static void main(String args[]){
	Vector2D a = new Vector2D(3.14, 2.17);
	Vector2D b = new Vector2D(1.14, 5.14);
	Vector2D c = Vector2D.add(a, b);
	Vector2D d = Vector2D.subtract(a, b);
	double e = a.calcDistance(a, b);

	System.out.println("aベクトルは");
	a.print();
	System.out.println("bベクトルは");
	b.print();
	System.out.println("2つのベクトルの和は");
	c.print();
	System.out.println("2つのベクトルの差は");
	d.print();
	System.out.println("2つのベクトルの距離は");
	System.out.println(e);
	

	System.exit(0);
    }
}
