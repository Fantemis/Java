package Q4;

import java.util.List;

public class CalculatorBillet5 extends CalculatorBillet {
	public void donnerBillet(WrapperMontant montant, List<Couple> proposition, EtatDistributeur etat) {

		if (montant.getMontant() > 5) {
			int nBillets20 = 0;
			if (montant.getMontant() % 20 == 0) {
				nBillets20 = montant.getMontant() / 20 - 1;
			} else {
				nBillets20 = montant.getMontant() / 20;
			}
			nBillets20 = Math.min(nBillets20, etat.getNb20Disponible());
			montant.setMontant(montant.getMontant() -  nBillets20 * 20);
			etat.setNb20Disponible(etat.getNb20Disponible() - nBillets20);
			proposition.add(new Couple(20, nBillets20));
		}
		super.donnerBillet(montant, proposition, etat);
	}
}
