package soru3;

import java.util.ArrayList;

public class HayvanatBahcesi implements IBahceyeEkle{
		
	ArrayList<Hayvan> hayvanlar= new ArrayList<>();
	
	@Override
	public void bahceyeMemeliHayvanEkle(MemeliHayvan m) {
		hayvanlar.add(m);
		System.out.println(m+" memeli hayvanı listeye eklendi.");
	}
	@Override
	public void bahceyeSurungenEkle(Surungen s) {
		this.hayvanlar.add(s);
		System.out.println(s+" sürüngen hayvanı listeye eklendi.");
	}
	public void hayvanSesCikarsin(Hayvan hayvan) {
		hayvan.sesCikar();
	}
	public void  hayvaninCinsiniBul(String hayvanAdi) {
		
	}
	public void hayvaninBilgileriniYazdir(String hayvanAdi) {
		
	}
	public void hayvaniHareketEttir(Hayvan hayvan) {
		
	}
	

}
