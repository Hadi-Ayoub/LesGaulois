package personnages;

public class Romain {
	String nom;
	int force;
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force; 
	}
	
	public void parler(String phrase) {
		System.out.println("Le romain "+ this.getNom()+" " +"<< "+ phrase+" >>");
	}
	
	public void recevoirCoup(int forceCoup) {
		this.force -= forceCoup;
		if (this.force <= 0 ) {
			this.force = 0;
			this.parler("J'abondonne");
		} else {
			this.parler("Aïe !");	
		}
	}
	
	public String getNom() {
		return this.nom;
	}

}
