package personnages;

public class Gaulois {
	private String nom;
	private int force;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force; 
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getForce() {
		return force;
	}
	
	public void parler(String phrase) {
		System.out.println("Le gaulois "+ this.getNom()+" " +"<"+ "<< "+phrase+" >>");
	}
	
	public void frapper(Romain romain) {
		romain.recevoirCoup(this.force/3);
		System.out.println(this.getNom() + " envoie un grand coup dans la mâchoire de "+ romain.getNom());
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		
	}
	
	

}
