package batailles;
import personnages.*;
import sites.*;

public class Embuscade implements IBataille {
	
	private Gaulois[] gauloisSelectionnes;
    private Romain[] romainsSelectionnes;
    private Village village;
    private Camp camp;

    public Embuscade(Village village, Camp camp) {
    	this.village = new Village(village.getChef()); // Copie du chef du village

        // Copie des villageois du village passé en paramètre
        for (int i = 0; i < village.tabGaulois.length; i++) {
            Gaulois villageois = village.tabGaulois[i];
            if (villageois != null) {
                this.village.ajouterVillageois(new Gaulois(villageois.getNom(), villageois.getForce()));
            }
        }
        
        this.camp = new Camp(camp.getCommandant()); // Copie du commandant du camp

        // Copie des soldats du camp passé en paramètre
        for (int i = 0; i < camp.tabSoldat.length; i++) {
            Soldat soldat = camp.tabSoldat[i];
            if (soldat != null) {
                this.camp.ajouterSoldat(new Soldat(soldat.getNom(), soldat.getForce(), soldat.getGrade()));
            }
        }
        gauloisSelectionnes = new Gaulois[4];
        romainsSelectionnes = new Romain[2];
    }

	@Override
	public String decrireContexte() {
		// TODO Auto-generated method stub
		return "Dans une sombre forêt dans un coin reculé de la Gaule, quatre comparses se promènent.";
	}
	

	@Override
	public String choisirCombattants() {
	        selectionnerGaulois("Ordralfabétix");
	        selectionnerGaulois("Cétautomatix");
	        selectionnerGaulois("Obelix");
	        selectionnerGaulois("Astérix");

	        selectionnerRomains( "Quintilius");
	        selectionnerRomains("Minus");

	        return "Il s'agit de " + afficherGaulois() + ". Mais cachés derrière des bosquets se cachent " + afficherRomains() + ".";
	    }

	    private String afficherGaulois() {
	        StringBuilder result = new StringBuilder();
	        for (Gaulois gaulois : gauloisSelectionnes) {
	            if (gaulois != null) {
	                if (result.length() > 0) {
	                    result.append(", ");
	                }
	                result.append(gaulois.getNom());
	            }
	        }
	        return result.toString();
	    }

	    private String afficherRomains() {
	        StringBuilder result = new StringBuilder();
	        for (Romain romain : romainsSelectionnes) {
	            if (romain != null) {
	                if (result.length() > 0) {
	                    result.append(" et ");
	                }
	                result.append(romain.getNom());
	            }
	        }
	        return result.toString();
	    }

	    private void selectionnerGaulois(String nomGaulois) {
	        for (Gaulois gaulois : this.village.tabGaulois) {
	            if (gaulois != null && gaulois.getNom() != null && gaulois.getNom().equals(nomGaulois)) {
	                ajouterGaulois(gaulois);
	            }
	        }
	    }
	    
	    
	    private void selectionnerRomains(String nomRomain) {
	        for (Soldat soldat : this.camp.tabSoldat) {
	            if (soldat != null && soldat.getNom() != null && soldat.getNom().equals(nomRomain)) {
	                ajouterRomain((Romain) soldat);
	            }
	        }
	    }

	    private void ajouterGaulois(Gaulois gaulois) {
	        for (int i = 0; i < this.gauloisSelectionnes.length; i++) {
	            if (this.gauloisSelectionnes[i] == null) {
	                this.gauloisSelectionnes[i] = gaulois;
	                break;
	            }
	        }
	    }

	    private void ajouterRomain(Romain romain) {
	        for (int i = 0; i < this.romainsSelectionnes.length; i++) {
	            if (this.romainsSelectionnes[i] == null) {
	                this.romainsSelectionnes[i] = romain;
	                break;
	            }
	        }
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
