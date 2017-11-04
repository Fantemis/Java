package Journalisation;

public class CompteBancaireJournalMultiton {
	private int numero;
	private double solde;

	public CompteBancaireJournalMultiton(int numero) {
		this.numero = numero;
		this.solde = 0.0;
	}

	public void déposer(double montant) {
		if (montant > 0.0) {
			solde += montant;
			JournalMultiton.getInstance("journal").ajouterLog("Dépôt de " + montant + "€ sur le compte " + numero + ".");
		} else {
			JournalMultiton.getInstance("journalerreur").ajouterLog("/!\\ Dépôt d'une valeur négative impossible (" + numero+ ").");
		}
	}
	
	public void retirer(double montant) {
		if (montant > 0.0) {
			if (solde >= montant) {
				solde -= montant;
				JournalMultiton.getInstance("journal").ajouterLog("Retrait de " + montant + "€ sur le compte " + numero+ ".");
			} else {
				JournalMultiton.getInstance("journalerreur").ajouterLog("/!\\ La banque n'autorise pas de découvert (" + numero+ ").");
			}
		} else {
			JournalMultiton.getInstance("journalerreur").ajouterLog("/!\\ Retrait d'une valeur négative impossible (" + numero+ ").");
		}
	}
	
	public Journal getJournal() {
		return Journal.getJournal();
	}
}
