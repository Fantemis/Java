package Q4;
import java.util.LinkedList;
import java.util.List;

/**
 * @author MEKKI Adel
 *
 */


public class Distributeur {
	public EtatDistributeur etat;
	public WrapperMontant Wm;
	private CalculatorBillet10 c10;
	private CalculatorBillet20 c20;
	private CalculatorBillet50 c50;
	private CalculatorBillet5 c5;
	public Distributeur(int nb50, int nb20, int nb10, int nb5) {
		this.etat = new EtatDistributeur();
		recharger(nb50, nb20, nb10, nb5);
		c10 = new CalculatorBillet10();
		c20 = new CalculatorBillet20();
		c50 = new CalculatorBillet50();

	}
	
	/**
	 * @param nb50
	 * @param nb20
	 * @param nb10
	 */
	public void recharger(int nb50, int nb20, int nb10, int nb5) {
		this.etat.setNb50Disponible(nb50);
		this.etat.setNb20Disponible(nb20);
		this.etat.setNb10Disponible(nb10);
		this.etat.setNb5Disponible(nb5);
	}
	/**
	 * @param montant
	 * @return
	 */
	
	public List<Couple> donnerBillets(int montant) {
		List<Couple> proposition = new LinkedList<Couple>();
		Wm = new WrapperMontant(montant);
		c5 = new CalculatorBillet5();
		c10 = new CalculatorBillet10();
		c20 = new CalculatorBillet20();
		c50 = new CalculatorBillet50();
		c50.donnerBillet(Wm, proposition, this.etat);
		c20.donnerBillet(Wm, proposition, this.etat);
		c10.donnerBillet(Wm, proposition, this.etat);
		c5.donnerBillet(Wm, proposition, etat);
		
		
		return proposition;
    }
	

	/**
	 * @param proposition
	 * @param montant
	 * @return
	 * 
	 */
	public String toStringProposition(List<Couple> proposition, int montant) {
		StringBuffer res = new StringBuffer();
		res.append("Montant à débiter : " + montant + "€ \n");
		for (Couple c : proposition) {
			res.append(c.toString() + '\n');
		}
		res.append("Montant restant dû : " + this.montantRestantDû(proposition, montant));
		return res.toString();
	}
	
	/**
	 * @param proposition
	 * @param montant
	 * @return 
	 * permet de calculer le montant restant dû à partir d'un montant de base et du nombre de billets délivrés
	 */
	public int montantRestantDû(List<Couple> proposition, int montant) {
		int montantRestantDû = montant;
		for (Couple c : proposition) {
			montantRestantDû -= c.getValeurBillet() * c.getNombreBilletsDélivrés();
		}
		return montantRestantDû;
	}
}
