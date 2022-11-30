package soru4;

public class Dikdortgen {
	
	public String dikdortgenAlan(double kisaKenar,double uzunKenar) {
		double alan = kisaKenar*uzunKenar;
		return "Alanı: "+alan;
	}
	public String dikdortgenCevre(double kisaKenar,double uzunKenar) {
		double cevre = kisaKenar*2+uzunKenar*2;
		return "Çevre: "+ cevre;
	}
}
