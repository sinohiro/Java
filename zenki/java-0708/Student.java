class Student {
    private int gakunen;   // 学年
    private String bunya; // 分野 "機械", "電気", "電子", "情報", "建築"のいずれかの文字列
    private String namae;  // 名前

    // コンストラクタ
    public Student(int gakunen, String bunya, String namae) {
	this.gakunen = gakunen;
	this.bunya = bunya;
	this.namae = namae;
    }

    public int getgakunen() {
	return gakunen;
    }

    public String getbunya() {
	return bunya;
    }

    public String getnamae() {
	return namae;
    }

    public void shokai() {
	System.out.println("私は「" + this.gakunen + "年" + this.bunya + "」の「" + this.namae + "」です.");
    }
}
