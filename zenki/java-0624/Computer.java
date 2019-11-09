class Computer {
	private String cpu;
	private int memory; //単位はGBとする
	private int watt;

	//コンストラクタ
	public Computer(String cpu, int memory, int watt) {
		this.cpu = cpu;
		this.memory = memory;
		this.watt = watt;
	}

	public String getcpu() {
		return cpu;
	}

	public int getmemory() {
		return memory;
	}

	public int getwatt() {
		return watt;
	}

	public void sanshou() {
		System.out.println("このパソコンのCPUは「" + this.cpu + "」");
		System.out.println("メモリ数は「" + this.memory + "Gb」");
		System.out.println("消費電力「" + this.watt + "W」です");
	}
}


