class Vector2D {
    double x, y;
    Vector2D(double x, double y){
	this.x = x;
	this.y = y;
    }

    Vector2D(){
	this.x = 0;
	this.y = 0;
    }

    void add(Vector2D b){
	this.x += b.x;
	this.y += b.y;
    }

    static Vector2D add(Vector2D a, Vector2D b){
	Vector2D cc = new Vector2D();
	cc.x = a.x + b.x;
	cc.y = a.y + b.y;
	return cc;
    }
    
    double calcNorm() {
	double Norm;

	Norm = Math.sqrt(x * x + y * y);
	return Norm;
    }
    
    void subtract(Vector2D b) {
	x -= b.x;
	y -= b.y;
    }

    static Vector2D subtract(Vector2D a, Vector2D b){
	Vector2D dd = new Vector2D();
	dd.x = a.x - b.x;
	dd.y = a.y - b.y;
	return dd;
    }

    //static double calcDistance(Vector2D a, Vector2D b){
    double calcDistance(Vector2D a, Vector2D b){
	a = subtract(a, b);
	double ee = a.calcNorm();
	return ee;
    }


    void print(){
	System.out.print("x=" + x);
	System.out.println("y=" + y);
	return;
    }
}
