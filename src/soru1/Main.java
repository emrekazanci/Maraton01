package soru1;

public class Main {
	
	static int adet = 6;
	
	public static void main(String[] args) {

		cizgi();
		
	}
	public static void cizgi() {
		
		for (int i = 0; i < 4; i++) {
			System.out.println("* * * * * * *");
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < adet; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
			adet--;
		}
		
	}
}	