package soru3;

public class Maymun extends MemeliHayvan{
	
	public Maymun(String ad, int kilo, int uzunluk, boolean tehlikeMi) {
		super(ad, kilo, uzunluk, tehlikeMi);
		
	}

	@Override
	public void yuru() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sesCikar() {
		System.out.println(ad+" ses çıkarıyor..");			
	}

}
