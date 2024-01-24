package sites;
import personnages.Gaulois;

public class Village {
	private Gaulois chef;
	private Gaulois[] tabGaulois;
	
	
	public Village(Gaulois chef) {
		this.chef = chef;
		this.tabGaulois = new Gaulois[4];
		chef.parler("Je suis un grand guerrier et je vais créer mon village");
		
	}
	
	private Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois villageois) {
		boolean villageComplet = true;
		for (int i =0; i< tabGaulois.length; i++) {
			if (tabGaulois[i] == null) {
				tabGaulois[i] = villageois;
				villageComplet = false;
				chef.parler(" Bienvenue "+ villageois.getNom()+" !");
				break;
			}
		}
		if (villageComplet) {
			chef.parler("Désolé "+ villageois.getNom() +" mon village est déjà bien rempli .");
		}
	}
	
	
	public void afficherVillageois() {
		System.out.println("Le village de "+ chef.getNom() +" est habité par : ");
		for (int i=0; i<tabGaulois.length ; i++) {
			System.out.println("- "+tabGaulois[i].getNom());
		}
	}

}
