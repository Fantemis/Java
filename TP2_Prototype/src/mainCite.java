
public class mainCite {

	public static void main(String[] args) {
		Catalogue c = new Catalogue();
		Cit� uneCit� = c.getUneCit�();
		Immeuble test = (Immeuble) uneCit�.getCite().get(0);
		test.setCouleur("Rouge");
		test.translater(3.3, 4.4);
		System.out.println(uneCit�);
		Cit� uneAutreCit� = c.getUneCit�();
		System.out.println(uneAutreCit�);
	}

}
