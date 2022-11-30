package soru3;

public class Aslan extends MemeliHayvan{

	public Aslan(String ad, int kilo, int uzunluk, boolean tehlikeMi) {
		super(ad, kilo, uzunluk, tehlikeMi);
		
	}

	@Override
	public void yuru() {
		
	}

	@Override
	public void sesCikar() {
		System.out.println(ad+" kükrüyor..");		
	}


}
