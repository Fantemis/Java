import java.util.List;

public abstract class CalculatorBillet {
	
	private CalculatorBillet suivant;	
	/**
	 * @param montant
	 * @param proposition
	 * @param etat
	 */
	public void donnerBillet(WrapperMontant montant, List<Couple> proposition, EtatDistributeur etat) {
		if (this.suivant != null) {
			this.suivant.donnerBillet(montant, proposition, etat);
		}
	}
	/**
	 * @param suivant
	 * 
	 */
	public void setSuivant(CalculatorBillet suivant) {
		this.suivant = suivant;
	}
}
