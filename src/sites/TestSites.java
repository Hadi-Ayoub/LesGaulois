package sites;
import personnages.Romain;
import personnages.Soldat;
import personnages.Soldat.Grade;
import personnages.Gaulois;
import personnages.Druide;

public class TestSites {
	public static void main(String[] args) {
		
		Gaulois vercingétorix = new Gaulois("Vercingétorix", 5);
		//Village village1 = new Village(vercingétorix);
		Soldat minus = new Soldat("minus", 6, Grade.CENTURION);
		//Camp camp1 = new Camp(minus);
		
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois asterix = new Gaulois("Astérix", 5);
		Gaulois obelix = new Gaulois("Obélix", 15);
		Gaulois prolix = new Gaulois("Prolix", 2);
		
		Soldat brutus = new Soldat("Brutus",5, Grade.SOLDAT);
		Soldat milexcus = new Soldat("Milexcus",2, Grade.SOLDAT);
		Soldat tulliusOctopus = new Soldat("TulliusOctopus",2, Grade.SOLDAT);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus",3, Grade.SOLDAT);
		/*
		camp1.ajouterSoldat(brutus);
		camp1.ajouterSoldat(milexcus);
		camp1.ajouterSoldat(tulliusOctopus);
		camp1.ajouterSoldat(ballondebaudrus);
		System.out.print("\n");
		camp1.afficherCamp();
		
		
		
		village1.ajouterVillageois(agecanonix);
		village1.ajouterVillageois(assurancetourix);
		village1.ajouterVillageois(asterix);
		village1.ajouterVillageois(obelix);
		village1.ajouterVillageois(prolix);
		
		
		//test méthodes changerChef et changerCommandant
		System.out.println();
		*/
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
		/*
		Soldat briseradius = new Soldat("Briseradius", 4, Grade.SOLDAT);
		Soldat chorus = new Soldat("Chorus", 4, Grade.CENTURION);
		
		village1.changerChef(abraracourcix);
		System.out.println();
		camp1.changerCommandant(briseradius);
		camp1.changerCommandant(chorus);
		
		
		// test de la classe Druide : 
		
		Druide panoramix = new Druide("Panoramix", 4);
		panoramix.fabriquerPotionMagique(3);
		*/
		Druide panoramix = new Druide("Panoramix", 2);
		//Druide druidex = new Druide("druidex", 5);
		panoramix.fabriquerPotionMagique(3);
		//panoramix.booster(druidex);
		
		panoramix.booster(asterix);
		panoramix.booster(obelix);
		panoramix.booster(assurancetourix);
		panoramix.booster(abraracourcix);
		panoramix.booster(agecanonix);
		
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");
		
		
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
/*
		minus.frapper(asterix);
		
		asterix.frapper(minus);
		asterix.frapper(minus);
	
		*/
	}
}

