package sites;
import personnages.Romain;
import personnages.Soldat;
import personnages.Gaulois;

public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingétorix = new Gaulois("Vercingétorix", 5);
		Village village1 = new Village(vercingétorix);
		Soldat minus = new Soldat("minus", 2);
		Camp camp1 = new Camp(minus);
		
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois asterix = new Gaulois("Astérix", 5);
		Gaulois obelix = new Gaulois("Obélix", 15);
		Gaulois prolix = new Gaulois("Prolix", 2);
		
		Soldat brutus = new Soldat("Brutus",5);
		Soldat milexcus = new Soldat("Milexcus",2);
		Soldat tulliusOctopus = new Soldat("TulliusOctopus",2);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus",3);
		/*
		camp1.ajouterSoldat(brutus);
		camp1.ajouterSoldat(milexcus);
		camp1.ajouterSoldat(tulliusOctopus);
		camp1.ajouterSoldat(ballondebaudrus);
		System.out.print("\n");
		camp1.afficherCamp();
		*/
		village1.ajouterVillageois(agecanonix);
		village1.ajouterVillageois(assurancetourix);
		village1.ajouterVillageois(asterix);
		village1.ajouterVillageois(obelix);
		village1.ajouterVillageois(prolix);
	}
	
}
