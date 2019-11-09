class Vector2D3{
    double x, y;
    Vector2D3(double cx, double cy){
	x = cx;
	y = cy;
    }

    double calcNorm() {
	double Norm;

	Norm = Math.sqrt(x * x + y * y);
	return Norm;
    }
    
    void subtract(Vector2D3 b) {
	x -= b.x;
	y -= b.y;
    }

    void print(){
	System.out.print("x=" + x);
	System.out.println("y=" + y);
	return;
    }
}
