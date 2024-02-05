package test_fonctionnel;
import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		asterix.parler("Bonjour à tous ! ");
		Romain minus = new Romain("Minus", 20);
		/*
		minus.parler("blabla");
		/*
		for (int i=0; i<2 ; i++) {
			minus.recevoirCoup(3);
		}
		
		for (int i=0; i<3; i++) {
			asterix.frapper(minus);
			}
		*/
		
		Druide panoramix = new Druide("Panoramix", 5);
		panoramix.fabriquerPotionMagique(3);
		
		panoramix.booster(asterix);
		asterix.frapper(minus);
	
	}
	
}