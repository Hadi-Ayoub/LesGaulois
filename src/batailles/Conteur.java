package batailles;

public class Conteur {
	String nom;
	
	public Conteur(String nom) {
		this.nom=nom;
	}
	
	public String conterHistoire(IBataille bataille) {
		return "Je suis "+nom+ ". Je vais vous conter une histoire qui se déroule en 50 avant Jésus-Christ,"
				+ " du temps où la Gaule est occupée par les Romains" + "\n" +bataille.decrireContexte() +"\n" + bataille.choisirCombattants() + "\n"
				+bataille.preparerCombat()+ "\n" + bataille.decrireCombat() +"\n" + bataille.donnerResultat();
	}

}
