class AnimeApp                                                                                  
{
    public static void main(String[] args)
    {   
        Anime meido = new Anime("メイドインアビス",2017, "夏", "BS11");
        Anime ccsakura = new Anime("ccさくら_cc編", 2018, "冬", "NHK");
        Anime gotoubun = new Anime("五等分の花嫁", 2019, "冬", "TBS");
        Anime poptepi = new Anime("ポプテピピック", 2018, "冬", "AbemaTV");

	meido.shokai();
	ccsakura.shokai();
	gotoubun.shokai();
	poptepi.shokai();

	ccsakura.tuki_onazi(gotoubun);
	meido.tuki_onazi(gotoubun);

	poptepi.bansakutsukita();
	poptepi.shokai();
    }
}
