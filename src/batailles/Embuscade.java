package batailles;
import personnages.*;
import sites.*;

public class Embuscade implements IBataille {
	
	public Embuscade() {
		
	}

	@Override
	public String decrireContexte() {
		// TODO Auto-generated method stub
		return "Dans une sombre forêt dans un coin reculé de la Gaule, quatre comparses se promènent.";
	}
	

	@Override
	public String choisirCombattants() { // à compléter
		// TODO Auto-generated method stub
		return null; //"Il s'agit de "+ ;
	}
	
	
	private Gaulois[] selectionnerGaulois(Village village,String nomGaulois) {   // à compléter
		/* 
		Gaulois[] gauloisSelectionnes = new Gaulois[village.tabGaulois.length];
		 
		for (int i=0; i< village.tabGaulois.length; i++) {
			if (village.tabGaulois[i].getNom() == nomGaulois) {
				gauloisSelectionnes = new Gaulois(village.tabGaulois[i].getNom(), village.tabGaulois[i].getForce());
				}
			else {
				System.out.println("Le gaulois "+ nomGaulois + "ne fait pas partie du village !");
				return null;
				}
			}
			*/
		return null;//gauloisSelectionne;
		}
	
	
	private Romain selectionnerRomains(Camp camp, String nomRomain) {
		Romain romainSelectionne = null;
		for (int i=0; i< camp.tabSoldat.length; i++) {
			if (camp.tabSoldat[i].getNom() == nomRomain) {
				romainSelectionne = new Soldat(camp.tabSoldat[i].getNom(), camp.tabSoldat[i].getForce(), camp.tabSoldat[i].getGrade());
				}
			else {
				System.out.println("Le gaulois "+ nomRomain + "ne fait pas partie du village !");
				return null;
				}
			}
		return romainSelectionne;
	}

	@Override
	public String preparerCombat() {
		// TODO Auto-generated method stub
		return "preparerCombat";
	}

	@Override
	public String decrireCombat() {
		// TODO Auto-generated method stub
		return "decrireCombat";
	}

	@Override
	public String donnerResultat() {
		// TODO Auto-generated method stub
		return "donnerResultat";
	}

}
