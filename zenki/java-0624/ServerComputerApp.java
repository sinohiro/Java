public class ServerComputerApp {
	public static void main(String[] args) {
		Computer shinodaPC = new Computer("Intel_i5_8400", 16, 700);
		ServerComputer serverPC = new ServerComputer("AMD_PhenomⅡ_X6_1075T", 16, 650, "2.4.29");

		shinodaPC.sanshou();
		serverPC.sanshou();
	}
}
