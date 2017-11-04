
public class Touche {

	private String n;
	private ListeCirculaire<Character> liste;
	private int posChar = 0;

	public Touche(String e) {
		this.liste = new ListeCirculaire<Character>();
		this.n = e;
		for (int i = 0; i < e.length(); i++) {
			this.liste.ajouterE(e.charAt(posChar++));
		}

	}

	public ListeCirculaire<Character> getListe() {
		return this.liste;
	}

	public Character getCaractere(int nb) {
		char c = 0;
		for (int i = 0; i < nb; i++) {
			try {
				c = this.liste.suivant();
			} catch (ListeVide e) {
				e.printStackTrace();
			}
		}
		return c;
		
	}
	
	@Override
	public String toString() {
		return "Touche " + liste + " ";
	}

}
