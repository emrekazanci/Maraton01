package soru3;

public abstract class Surungen extends Hayvan {

	public Surungen(String ad, int kilo, int uzunluk, boolean tehlikeMi) {
		super(ad, kilo, uzunluk, tehlikeMi);
		// TODO Auto-generated constructor stub
	}

	public abstract void surun();

	@Override
	public String toString() {
		return "Surungen [ad=" + ad + ", kilo=" + kilo + ", uzunluk=" + uzunluk + ", tehlikeMi=" + tehlikeMi + "]";
	}
	
	
}
