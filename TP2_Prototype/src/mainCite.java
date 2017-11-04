
public class mainCite {

	public static void main(String[] args) {
		Catalogue c = new Catalogue();
		Cité uneCité = c.getUneCité();
		Immeuble test = (Immeuble) uneCité.getCite().get(0);
		test.setCouleur("Rouge");
		test.translater(3.3, 4.4);
		System.out.println(uneCité);
		Cité uneAutreCité = c.getUneCité();
		System.out.println(uneAutreCité);
	}

}
