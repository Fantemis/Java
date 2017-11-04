package Q4;
import java.util.List;

public class CalculatorBillet50 extends CalculatorBillet {
	public CalculatorBillet50() {
	}
	public void donnerBillet(WrapperMontant montant, List<Couple> proposition, EtatDistributeur etat) {
		
		if (montant.getMontant() > 50) {
			int nBillets50 = Math.min((int)Math.ceil(montant.getMontant()/2/50), etat.getNb50Disponible());
			montant.setMontant(montant.getMontant() - nBillets50*50);
			etat.setNb50Disponible(etat.getNb50Disponible() - nBillets50);
			if (nBillets50 > 0) {
				proposition.add(new Couple(50,nBillets50));
			}
		}
		super.donnerBillet(montant, proposition, etat);
	}
}
