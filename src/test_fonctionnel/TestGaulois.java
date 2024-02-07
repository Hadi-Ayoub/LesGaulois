package test_fonctionnel;
import personnages.Gaulois;
import personnages.Romain;
import personnages.Soldat;
import personnages.Soldat.Equipement;
import personnages.Soldat.Grade;
import personnages.Druide;

public class TestGaulois {
	public static void main(String[] args) {
		
		
		
		//Les gaulois
		Gaulois vercingétorix = new Gaulois("Vercingétorix", 5);
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois asterix = new Gaulois("Astérix", 5);
		Gaulois obelix = new Gaulois("Obélix", 15);
		Gaulois prolix = new Gaulois("Prolix", 2);
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
		
		//Les romains
		Soldat brutus = new Soldat("Brutus",5, Grade.SOLDAT);
		Soldat milexcus = new Soldat("Milexcus",2, Grade.SOLDAT);
		Soldat tulliusOctopus = new Soldat("TulliusOctopus",2, Grade.SOLDAT);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus",3, Grade.SOLDAT);
		Soldat minus = new Soldat("minus", 6, Grade.CENTURION);
		
		//les druides
		Druide panoramix = new Druide("Panoramix", 2);
		
		panoramix.fabriquerPotionMagique(3);
		
		panoramix.booster(asterix);
		panoramix.booster(obelix);
		panoramix.booster(assurancetourix);
		panoramix.booster(abraracourcix);
		panoramix.booster(agecanonix);
		
		minus.equiper(Equipement.BOUCLIER);
		minus.equiper(Equipement.CASQUE);
		minus.equiper(Equipement.PLASTRON);
		
		while ( !minus.estATerre() && !asterix.estATerre() ) {
			asterix.frapper(minus);
			if (minus.estATerre()) {
                break;
			}
                
			minus.frapper(asterix);
			if (asterix.estATerre()) {
                break;
		}
			}
		
	
	}
	
	
}