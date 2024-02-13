package personnages;

public class Gaulois extends Personnage {
	//private boolean boosted = false;
	private int puissanceBoost;

	public Gaulois(String nom, int force) {
		super(nom, force);
		puissanceBoost = 1;
	}
	
	
	@Override
    protected String donnerAuteur() {
        return "Le Gaulois ";
    }
	/*
	
	public boolean isBoosted() {
		return boosted;
		
	}
	
	public void setBoost() {
		if (!boosted) {
			boosted = true;
		}
	}
	*/
	
	public int getPuissanceBoost(){
		return puissanceBoost;
	}
	
	public void setPuissanceBoost(int p) {
		puissanceBoost = p;
	}

	
	@Override
	public void frapper(Personnage adversaire) {
		int forceCoup = force;
		
	
		System.out.println("Le gaulois "+ this.getNom() + " donne un grand coup de force "+  forceCoup* puissanceBoost+" au "+ adversaire);
		adversaire.recevoirCoup(forceCoup * puissanceBoost);
		if (puissanceBoost >1) {
			puissanceBoost -= 0.5;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
	}
	
	
	

}
