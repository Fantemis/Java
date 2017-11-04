import java.util.List;


public class CalculatorBillet10 extends CalculatorBillet{

	public void donnerBillet(WrapperMontant montant, List<Couple> proposition, EtatDistributeur etat) {
		int mont = montant.getMontant();
		
		if (mont > 0) 
		{
			int nBillets10 = Math.min(mont/10, etat.getNb10Disponible());
			mont -= nBillets10*10;
			etat.setNb10Disponible(etat.getNb10Disponible() - nBillets10);
			proposition.add(new Couple(10, nBillets10));
		}
		montant.setMontant(mont);
		super.donnerBillet(montant, proposition, etat);
	}


}