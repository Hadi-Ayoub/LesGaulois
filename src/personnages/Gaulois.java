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
	
	public void parler(String phrase) {
		System.out.println("Le gaulois "+ this.getNom()+" " +"<"+ phrase+">");
	}
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		
	}
	
	

}
