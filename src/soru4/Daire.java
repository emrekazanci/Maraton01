package soru4;

public class Daire {
	public String alan(double yariCap) {
		double alan = Math.PI*Math.pow(yariCap, 2);
		return "Alan: "+alan;
	}
	public String cevre(double yariCap) {
		double cevre = 2*Math.PI*yariCap;
		return "Çevre: "+cevre;
	}
}
