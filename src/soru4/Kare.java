package soru4;

public class Kare {
	
	public String kareAlanHesapla(double kenar) {
		double alan = Math.pow(kenar,2);
		return "Alan: "+alan;
	}
	public String kareCevreHesaplama(double kenar) {
		double cevre = kenar*4;
		return "Çevre: "+ cevre;
	}
}
