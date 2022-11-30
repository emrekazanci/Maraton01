package soru3;


public abstract class Hayvan extends HayvanatBahcesi{
	public String ad;
	public int kilo;
	public int uzunluk;
	boolean tehlikeMi;

	public Hayvan(String ad, int kilo, int uzunluk, boolean tehlikeMi) {
		super();
		this.ad = ad;
		this.kilo = kilo;
		this.uzunluk = uzunluk;
		this.tehlikeMi = tehlikeMi;
	}


	public abstract void sesCikar();
}
