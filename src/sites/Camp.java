package sites;
import personnages.Soldat;


public class Camp {
	private Soldat commandant;
	private Soldat[] tabSoldat;
	
	public Camp(Soldat commandant) {
		this.commandant = commandant;
		this.tabSoldat = new Soldat[3];
		commandant.parler("Je suis en charge de créer un nouveau camp romain.");
		
	}
	
	private Soldat getCommandant() {
		return commandant;
	}
	/*
	public void ajouterSoldat(Soldat soldat) {
		 boolean campComplet = true;

		    for (int i = 0; i < tabSoldat.length; i++) {
		        if (tabSoldat[i] == null) {
		            tabSoldat[i] = soldat;
		            campComplet = false;

		            soldat.parler("Je mets mon épée au service de Rome dans le camp dirigé par " + this.commandant.getNom());
		            break;
		        }
		    }

		    if (campComplet) {
		        System.out.println("Le romain " + soldat.getNom() + " : « Désolé, notre camp est complet ! »");
		    }
    }
	*/	
	public void ajouterSoldat(Soldat soldat) {
		boolean campComplet = true;
		for (int i =0; i< tabSoldat.length; i++) {
			if (tabSoldat[i] == null) {
				tabSoldat[i] = soldat;
				campComplet = false;
				soldat.parler("Je mets mon épée au service de Rome dans le camp dirigé par " + this.commandant.getNom());
				break;
			}
		}
		if (campComplet) {
			//System.out.println("Le romain " + soldat.getNom() + " : « Désolé "+ soldat.getNom()+ ", notre camp est complet ! »");
			commandant.parler(" Désolé "+ soldat.getNom() +" notre camp est complet !");
		}
	}
	
	public void afficherCamp() {
		System.out.println("Le camp dirigé par "+ commandant.getNom() +" contient les soldats : ");
		for (int i=0; i<tabSoldat.length ; i++) {
			System.out.println("- "+tabSoldat[i].getNom());
		}
	}
				
			
	

}