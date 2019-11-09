public class ServerComputer extends Computer {
	private String ApacheVersion;

	public ServerComputer(String cpu, int memory, int watt, String ApacheVersion) {
		super(cpu, memory, watt);
		this.ApacheVersion = ApacheVersion;
	}

	public String getApacheVersion() {
		return ApacheVersion;
	}

	public void sanshou() {
		System.out.println("このパソコンのCPUは「" + getcpu() + "」");
		System.out.println("メモリは「" + getmemory() + "GB」");
		System.out.println("消費電力「" + getwatt() + "W」です");
		System.out.println("ApacheのVersionは「" + this.ApacheVersion + "」です");
	}

}
