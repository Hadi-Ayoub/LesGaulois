package batailles;

import sites.Camp;
import sites.Village;

public interface IBataille {
	public String decrireContexte();
	public String choisirCombattants();
	public String preparerCombat();
	public String decrireCombat();
	public String donnerResultat();
	

	

}
