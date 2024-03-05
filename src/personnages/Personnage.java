package personnages;

public abstract class Personnage {
	protected String nom;
	protected int force;
	
	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force; 
	}
	
	
	public String parler(String text) {
		return donnerAuteur() + this.getNom()+" " + "\" "+text+" \"." ;
	}
	
	
	protected abstract String donnerAuteur();

	
	
	
	public String frapper(Personnage adversaire) {
		
		if (force == 0) {
			force =1;
		}
		adversaire.recevoirCoup(force);
		return this.getNom() + " donne un grand coup de force "+ force+ " au "+ adversaire;
		
	}
	
	
	/*
	public void recevoirCoup(int forceCoup) {
		this.force -= forceCoup;
		if (this.force <= 0) {
			this.force = 0;
			this.parler("J'abondonne");
		} else {
			this.parler("Aïe !");	
		}
	}
	*/
	
	public String recevoirCoup(int forceCoup) {
		this.force -= forceCoup;
		String message = afficherResultatCoup();
		return message;
	}
	
	public String afficherResultatCoup() {
		if (this.force <= 0) {
			this.force = 0;
			return parler("J'abondonne");
		} else {
			return parler("Aïe !");	
		}
	}
	
	public boolean estATerre() {
		return force ==0;
	}
	
	
	public String getNom() {
		return this.nom;
	}
	
	
	public int getForce() {
		return this.force;
	}
	
	public void setForce(int nouvelleForce) {
		this.force = nouvelleForce;

	}
	
	@Override
    public String toString() {
		return getClass().getSimpleName() + " " + getNom();
        
    }
	
	
}

