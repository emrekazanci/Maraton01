package soru3;

public abstract class MemeliHayvan extends Hayvan{
	
	public MemeliHayvan(String ad, int kilo, int uzunluk, boolean tehlikeMi) {
		super(ad, kilo, uzunluk, tehlikeMi);
		
	}

	public abstract void yuru();

	@Override
	public String toString() {
		return "MemeliHayvan [ad=" + ad + ", kilo=" + kilo + ", uzunluk=" + uzunluk + ", tehlikeMi=" + tehlikeMi + "]";
	}

	
}
