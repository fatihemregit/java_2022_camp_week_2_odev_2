package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };

		int aranacak = 6;

		boolean state = false;

		for (int sayi : sayilar) {
			if (aranacak == sayi) {
				state = true;
				break;
			}
		}
		if (state) {
			mesajVer(aranacak + " Sayısı dizide var");
		} else {
			mesajVer(aranacak + " Sayısı dizide yok");
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
