package Q2;

import java.util.List;

public class CalculatorBillet10 extends CalculatorBillet{

	public void donnerBillets(WrapperMontant montant, List<Couple> proposition, EtatDistributeur etat) {
		
		if (montant.getMontant() > 0) {
			int nBillets10 = Math.min(montant.getMontant() / 10, etat.getNb10Disponible());
			montant.setMontant(montant.getMontant() - nBillets10 * 10);
			etat.setNb10Disponible(etat.getNb10Disponible() - nBillets10);
			proposition.add(new Couple(10, nBillets10));
		}
	}
	
}
