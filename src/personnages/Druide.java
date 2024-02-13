package personnages;
import java.security.SecureRandom;
import java.util.Random;


public class Druide extends Gaulois{
	
	private int puissancePotion;
	private int nbDoses;
	private Random random;

	public Druide(String nom, int force) {
		super(nom, force);
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void fabriquerPotionMagique(int nbDoses) {
		this.nbDoses = nbDoses;
		
		puissancePotion = random.nextInt(5) + 2;
	
		
		}
	
	
	public void booster(Gaulois gauloisAbooster) {
		//int p = fabriquerPotionMagique(nbDoses);
		if (this.nbDoses > 0) {
			if (gauloisAbooster.getNom() != "Obélix") {
				parler("Tiens "+gauloisAbooster.getNom()+ " un peu de potion magique");
				
				gauloisAbooster.setPuissanceBoost(puissancePotion);
				//gauloisAbooster.setBoost();
				this.nbDoses--;
				} else {
						parler("Non, Obélix Non ! ... Et tu le sais très biens !");
					}
		} else {
			parler("Désolé " + gauloisAbooster.getNom() + " il n'y a plus une seule goutte de potion.");
		}
		
	}
	
	public double getPuissancePotion() {
		return puissancePotion;
	}
	
	public int getNbDoses() {
		return nbDoses;
	}
	
	//test Druide 
	public static void main(String[] args) {
		
		Druide druide = new Druide("druide1", 3);
		Gaulois gaulois1 = new Gaulois("gaulois1", 5);
		Gaulois gaulois2 = new Gaulois("gaulois2", 5);
		Gaulois gaulois3 = new Gaulois("gaulois3", 5);
		druide.fabriquerPotionMagique(2);
		druide.booster(gaulois1);
		System.out.println(gaulois1.getPuissanceBoost());
		druide.booster(gaulois2);
		System.out.println(gaulois2.getPuissanceBoost());
		druide.booster(gaulois3);
		System.out.println(gaulois3.getPuissanceBoost());
		
		
		
		
		
		
	}
	


}
