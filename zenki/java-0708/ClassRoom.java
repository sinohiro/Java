class ClassRoom {
	private int maxgakusei;
	private Student[] gakusei;
	private int nowgakusei;

	public ClassRoom() {
		this.maxgakusei = 5;
		gakusei = new Student[5];
		this.nowgakusei = 0;
	}

	public void add(Student addgakusei) {
		if (nowgakusei < maxgakusei) {
			gakusei[nowgakusei] = addgakusei;
			nowgakusei ++;
		} else {
			System.out.println("Error:配列の最大要素数を越えました");
		}
	}

	public void del(int delnomber) {
		gakusei[delnomber] = null;
		for (int i = delnomber ; i < maxgakusei - 1 ; i++) {
			gakusei[i] = gakusei[i + 1];
			gakusei[i + 1] = null;
		}
		gakusei[maxgakusei - 1] = null;
		nowgakusei--;
	}

	public int getmaxgakusei() {
		return maxgakusei;
	}

	public int getnowgakusei() {
		return nowgakusei;
	}
	public Student getgakusei(int nowgakusei) {
		return gakusei[nowgakusei];
	}

	public void setmaxgakusei(int newmaxgakusei) {
		Student[] newgakusei;
		newgakusei = new Student[newmaxgakusei];
		for (int j = 0 ; j < maxgakusei ; j++) {
			newgakusei[j] = gakusei[j];
		}
		gakusei = newgakusei;
	}

	public void zenshokai() {
		int i;

		for (i = 0; i < nowgakusei; i++) {
			(getgakusei(i)).shokai();
		}
	}
}
