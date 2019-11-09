class VarIntArray {
  private int maxyouso;
  private int[] hairetu;
	private int nowyouso;

  public VarIntArray() {
		this.maxyouso = 5;
		hairetu = new int[5];
		this.nowyouso = 0;
  }

  public void add(int youso) {
		if (nowyouso < maxyouso) {
			hairetu[nowyouso] = youso;
			nowyouso ++;
		} else {
				System.out.println("Error:配列の最大要素数を越えました");
			}
  }

	public int getnowyouso() {
		return nowyouso;
  }

  public int gethairetu(int yousoNo) {
		return hairetu[yousoNo];
  }

  public void print() {
		int i;
		for (i = 0; nowyouso > i ; i ++) {
			System.out.print(i + ";");
			System.out.println(gethairetu(i));
		}
  }
}
