package personnages;
import java.util.Random;

public class Druide extends Gaulois{

	public Druide(String nom, int force) {
		super(nom, force);
		// TODO Auto-generated constructor stub
	}
	
	
	public void fabriquerPotionMagique(int nbDoses) {
		Random rand = new Random();
		int puissance = rand.nextInt(4) + 2 ;
		System.out.println(this.donnerAuteur()+" "+ this.getNom() + " : \" J'ai concocté "+nbDoses 
				+ " doses de potion magique. Elle a une force de : "+ puissance + " \". " );
		
	}
	


}
