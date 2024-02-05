package personnages;

public abstract class Personnage {
	protected String nom;
	protected int force;
	
	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force; 
	}
	
	
	public void parler(String text) {
		System.out.println(donnerAuteur() + this.getNom()+" " + "\" "+text+" \".") ;
	}
	
	
	protected abstract String donnerAuteur();

	
	
	
	public void frapper(Personnage adversaire) {
		int forceCoup = force/3;
		if (forceCoup == 0) {
			forceCoup =1;
		}
		System.out.println(this.getNom() + " donne un grand coup de force "+ forceCoup+ " au "+ adversaire);
		adversaire.recevoirCoup(forceCoup);
	}
	
	
	
	public void recevoirCoup(int forceCoup) {
		this.force -= forceCoup;
		if (this.force <= 0) {
			this.force = 0;
			this.parler("J'abondonne");
		} else {
			this.parler("Aïe !");	
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

