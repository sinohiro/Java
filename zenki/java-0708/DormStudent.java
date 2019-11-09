public class DormStudent extends Student {
    private DormStudent roommate;

    public DormStudent(int gakunen, String bunya, String namae) {
	super(gakunen, bunya, namae);
    }

    public DormStudent getroommate() {
	return roommate;
    }

    void setroommate(DormStudent roommate) {
	this.roommate = roommate;
	if (roommate.roommate == null) {
	    roommate.roommate = this;
	}
    }

    public void shokai() {
	System.out.print("私は「" + getgakunen() + "年" + getbunya() + "」の「" + getnamae() + "」です. 寮の同室者は「");
	if (this.roommate == null) {
	    System.out.println("なし」です.");
	} else {
	    System.out.println(this.roommate.getnamae() +"」です.");
	}
    }
}
