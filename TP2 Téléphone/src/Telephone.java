import java.util.Arrays;
import java.util.Scanner;

public class Telephone {
	private String[] caracteres = { "0 ", "1", "2abc", "3def", "4ghi", "5jkl", "6mno", "7pqrs", "8tuv", "9wxyz" };
	private static final int NB_MAX = 10;
	private Touche[] tabTouche;

	public Telephone() {
		this.tabTouche = new Touche[NB_MAX];
		for (int i = 0; i < NB_MAX; i++) {
			this.tabTouche[i] = new Touche(this.caracteres[i]);
		}
	}
	public String saisie(String v) {
		int repete = 0;
		String message = "";
		for (int i = 1; i < v.length(); i++) {

			if (v.charAt(i-1) != '.') {

				int j = Integer.parseInt("" + v.charAt(i - 1));

				if (v.charAt(i - 1) == v.charAt(i)) {
					repete += 1;
				} else {
					message += this.tabTouche[j].getCaractere(repete);
					repete = 0;
				}		
				if (i+1 == v.length()) {
					message += this.tabTouche[j].getCaractere(repete);

				}
			}
			
		}
		

		return message;
	}
	@Override
	public String toString() {
		return " " + Arrays.toString(tabTouche) + " ";
	}

}
