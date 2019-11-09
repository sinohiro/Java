class Vector2D2{
    double x, y;
    Vector2D2(double cx, double cy){
	x = cx;
	y = cy;
    }

    double calcNorm() {
	double Norm;

	Norm = Math.sqrt(x * x + y * y);
	return Norm;
    }

    void print(){
	System.out.print("x=" + x);
	System.out.println("y=" + y);
	return;
    }
}
