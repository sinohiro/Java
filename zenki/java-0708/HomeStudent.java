public class HomeStudent extends Student {
    private String tuugaku;

    public HomeStudent(int gakunen, String bunya, String namae, String tuugaku) {
	super(gakunen, bunya, namae);
	this.tuugaku = tuugaku;
    }

    public String gettuugaku() {
	return tuugaku;
    }

    public void shokai() {
	System.out.println("私は「" + getgakunen() + "年" + getbunya() + "」の「" + getnamae() + "」です. 登校手段は「" + this.tuugaku + "」です.");
    }
}
