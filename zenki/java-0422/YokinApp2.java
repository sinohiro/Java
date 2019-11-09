class YokinApp2{
    public static void main(String args[]){
	Yokin myyokin;
	myyokin = new Yokin();

	int mygankin = Integer.parseInt(args[0]);
		
	//myyokin.gankin = 100000;
	myyokin.gankin = mygankin;

	double kotae;
	kotae = myyokin.risoku(3);
	System.out.println ("利息は" + kotae);

	System.exit(0);
    }
}
