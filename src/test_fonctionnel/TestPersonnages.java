package test_fonctionnel;

import personnages.Gaulois;

public class TestPersonnages {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.getNom());
	}

}
