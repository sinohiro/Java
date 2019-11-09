class Yokin{
    double riritsu;
    int gankin;

    Yokin(){
	riritsu = 0.002;
    }
    
    double risoku(int month){
	double kekka;
	kekka = (double)gankin * riritsu * (double)month / 12.0;
	return kekka;
    }
}
