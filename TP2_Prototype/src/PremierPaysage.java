
public class PremierPaysage {

	public static void main(String[] args) {
		Catalogue catalogue = new Catalogue();
		ObjetGraphique[] paysage = {catalogue.getUnImmeuble(),
									catalogue.getUnArbre(),
									catalogue.getUnBanc(),
									catalogue.getUneBalancoire(),
									catalogue.getUnToboggan(),
									catalogue.getUnTourniquet()};
		for (ObjetGraphique o : paysage) {
			o.translater(Math.random() * 10, Math.random() * 10);
			System.out.println(o);
		}

	}

}
