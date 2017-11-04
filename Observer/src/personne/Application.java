package personne;

public class Application {

	public static void main(String[] args) {
		Personne[] listePersonnes = { new Personne("Sédes", "Florence"),
									  new Personne("Viallet", "Fabienne"),
									  new Personne("Julien", "Christine"),
									  new Personne("Percebois", "Christian"),
									  new Personne("Leblanc", "Hervé"),	
									  new Personne("Jean", "Charles")};
		
		Observer etatCivilToulouse = new ObserverEtatCivil();
		Observer hauteGaronnePTT = new ObserverPTT();
		
		for (Personne p : listePersonnes) {
			p.attach(etatCivilToulouse);
			p.attach(hauteGaronnePTT);
		}
			
		listePersonnes[3].ajoutPrénom("Augustin");
		listePersonnes[4].ajoutPrénom("Just");
		listePersonnes[4].setNom("Lerouge");
		listePersonnes[5].setNom("BIEBER");
		listePersonnes[5].ajoutPrénom("Justin");
	}

}
