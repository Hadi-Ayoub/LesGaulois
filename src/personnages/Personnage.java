package personnages;

public abstract class Personnage {
	private String nom;
	private int force;
	
	public Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force; 
	}
	
	
	public String getNom() {
		return this.nom;
	}
	
	public void parler(String text) {
		System.out.println(donnerAuteur() + this.getNom()+" " +"<"+ "<< "+text+" >>") ;
	}
	
	protected abstract String donnerAuteur();
	
	public void frapper(Personnage adversaire) {
		adversaire.recevoirCoup(this.force/3);
		System.out.println(this.getNom() + " envoie un grand coup dans la mâchoire de "+ adversaire.getNom());
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
	

}
