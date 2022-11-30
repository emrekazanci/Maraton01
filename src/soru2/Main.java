package soru2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int[] sayiDizisi = {2,4,3,5,7,2,6,7,8,9,9,3,-2};
		tekrarSayi(sayiDizisi);
	}
	public static String tekrarSayi(int[] sayiDizisi) {
		int tekrar=0;
		
		ArrayList<Integer> tekrarSayilari = new ArrayList<>();
		
		for (int i = 0; i < sayiDizisi.length; i++) {
			for (int j = i+1; j < sayiDizisi.length; j++) {
				if (sayiDizisi[i]==sayiDizisi[j]) {
					tekrarSayilari.add(sayiDizisi[j]);
					tekrar++;
				}
			}
		}
		if (tekrar !=0) {
			return  tekrar+"kez tekrarlandı.";
		}
		return null ;
		
	}
}