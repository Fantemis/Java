package Journalisation;

public class CompteBancaire {
	private int numero;
	private double solde;

	public CompteBancaire(int numero) {
		this.numero = numero;
		this.solde = 0.0;
	}

	public void déposer(double montant) {
		if (montant > 0.0) {
			solde += montant;
			Journal.getJournal().ajouterLog("Dépôt de " + montant + "€ sur le compte " + numero + ".");
		} else {
			Journal.getErreur().ajouterLog("/!\\ Dépôt d'une valeur négative impossible (" + numero+ ").");
		}
	}
	
	public void retirer(double montant) {
		if (montant > 0.0) {
			if (solde >= montant) {
				solde -= montant;
				Journal.getJournal().ajouterLog("Retrait de " + montant + "€ sur le compte " + numero+ ".");
			} else {
				Journal.getErreur().ajouterLog("/!\\ La banque n'autorise pas de découvert (" + numero+ ").");
			}
		} else {
			Journal.getErreur().ajouterLog("/!\\ Retrait d'une valeur négative impossible (" + numero+ ").");
		}
	}
	
	public Journal getJournal() {
		return Journal.getJournal();
	}
}
