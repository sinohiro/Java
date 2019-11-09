class Vector2D3{
    double x, y;
    
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
