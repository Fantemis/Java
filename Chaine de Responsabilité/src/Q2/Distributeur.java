package Q2;

import java.util.LinkedList;
import java.util.List;

public class Distributeur {
	private EtatDistributeur etat;

	public Distributeur(int nb50, int nb20, int nb10) {
		this.etat = new EtatDistributeur();
		recharger(nb50, nb20, nb10);
	}

	public void recharger(int nb50, int nb20, int nb10) {
		this.etat.setNb50Disponible(nb50);
		this.etat.setNb20Disponible(nb20);
		this.etat.setNb10Disponible(nb10);
	}

	public List<Couple> donnerBillets(int montant) {
		CalculatorBillet10 c10 = new CalculatorBillet10();
		CalculatorBillet20 c20 = new CalculatorBillet20();
		CalculatorBillet50 c50 = new CalculatorBillet50();
		List<Couple> proposition = new LinkedList<Couple>();
		WrapperMontant Wmontant = new WrapperMontant(montant);
		c50.donnerBillets(Wmontant, proposition, this.etat);
		c20.donnerBillets(Wmontant, proposition, this.etat);
		c10.donnerBillets(Wmontant, proposition, this.etat);
		
		
		return proposition;
	}

	public String toStringProposition(List<Couple> proposition, int montant) {
		StringBuffer res = new StringBuffer();
		res.append("Montant a  debiter : " + montant + "â‚¬ \n");
		for (Couple c : proposition) {
			res.append(c.toString() + '\n');
		}
		res.append("Montant restant du : " + this.montantRestantDu(proposition, montant));
		return res.toString();
	}

	public int montantRestantDu(List<Couple> proposition, int montant) {
		int montantRestantDu = montant;
		for (Couple c : proposition) {
			montantRestantDu -= c.getValeurBillet() * c.getNombreBilletsDelivres();
		}
		return montantRestantDu;
	}
}
