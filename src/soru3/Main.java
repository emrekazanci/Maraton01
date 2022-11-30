package soru3;

public class Main {

	public static void main(String[] args) {

		HayvanatBahcesi hayvanatBahcesi = new HayvanatBahcesi();
		Aslan aslan = new Aslan("Tiger", 150, 230, true);
		Yilan yilan = new Yilan("Terminatör", 40, 500, true);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(aslan);
		hayvanatBahcesi.bahceyeSurungenEkle(yilan);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Aslan("Leo", 110, 200, true));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("Çiko", 60, 110, false));
		hayvanatBahcesi.bahceyeSurungenEkle(new Kertenkele("Kermit", 30, 80, false));
		System.out.println("\n");
		hayvanatBahcesi.hayvanSesCikarsin(aslan);
		hayvanatBahcesi.hayvanSesCikarsin(yilan);
		System.out.println("--------");
		hayvanatBahcesi.hayvaninCinsiniBul("Leo");
	}
}