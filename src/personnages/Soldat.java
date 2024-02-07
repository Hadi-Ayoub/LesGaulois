package personnages;

public class Soldat extends Romain{
	private Grade grade;
	private Equipement[] equipements;


	public Soldat(String nom, int force, Grade grade) {
		super(nom, force);
		this.grade = grade;
		this.equipements = new Equipement[3];
	}
	
	
	public enum Grade{
		SOLDAT("Soldat"), TESSERARIUS("Tessarius"), OPTIO("Optio"), CENTURION("Centurion");
		private String chaine;
		private Grade(String chaine) {
			this.chaine = chaine;
		}
		
		@Override
		public String toString() {
			return chaine;
		}
	}
	
	
	public enum Equipement{
		CASQUE("Casque", 2), PLASTRON("Plastron", 3), BOUCLIER("Bouclier", 3);

        private String nom;
        private int protection;

        private Equipement(String nom, int protection) {
            this.nom = nom;
            this.protection = protection ;
        }
        public int getProtection() {
            return protection;
        }

        @Override
        public String toString() {
            return nom;
        }
	}
	
	
	public void equiper(Equipement equipement) {
		if (equipement == null) {
            System.out.println("Impossible d'équiper un équipement null.");
            return;
        }
		
		if (contientEquipement(equipement)) {
			System.out.println("Le soldat " + getNom() +" est déjà équipé avec un "+ equipement);
			} else {
				for (int i=0; i<equipements.length; i++) {
					if (equipements[i] == null) {
						equipements[i] = equipement;
						System.out.println("Le soldat "+ getNom() + " s'équipe avec un "+ equipement);
						break;
					}
				}
			}
	}
	
	public void retirerEquipement(Equipement equipement) {
		for (int i=0; i<equipements.length; i++ ) {
			if (equipements[i].equals(equipement)) {
				equipements[i] = null;
				break;
			}
		}
	}
	
	
	
	public boolean contientEquipement(Equipement equipement) {
		for (Equipement e: equipements) {
			if (e != null && e.equals(equipement)) {
				return true;
			}
		}
		return false;
	}
	
	@Override 
	public void recevoirCoup(int forceCoup) {
		int sommeProtection =0;
		
		for (Equipement e: equipements) {
			if (e != null) {
				sommeProtection += e.getProtection();
				System.out.println("le "+ e+ " absorbe " +e.getProtection()+" du coup .");
			} else {
				sommeProtection += 0;
			}
		}
			
			if (sommeProtection > forceCoup) {
				forceCoup =0;   // l'attaque n'engendre pas de dégâts, on évite l'ajout du reste dans la force du sodat 
				
			} else {
				forceCoup -= sommeProtection;
			}
		
		
        super.recevoirCoup(forceCoup);
	}
	

	
	public Grade getGrade() {
		return grade;
	}
	
	@Override
	public void parler(String text) {
		System.out.println(donnerAuteur() + this.getNom()+" de grade "+ getGrade() + " :  \" " +text+" \".") ;
	}
	
	
	public static void main(String[] args) {
		// test unitaire mise en place des protections 
		Gaulois asterix = new Gaulois("Astérix", 6);
		Soldat minus = new Soldat("Minus", 10, Grade.SOLDAT);
		minus.equiper(Equipement.BOUCLIER);
		//minus.equiper(Equipement.PLASTRON);
		//minus.equiper(Equipement.CASQUE);
		asterix.frapper(minus);
		System.out.println(minus.getForce());
		
	
	
		
		
		
	}

}
