import java.util.LinkedList;
import java.util.List;
public class Catalogue {
	private Balancoire uneBalancoire;
	private Banc unBanc;
	private Toboggan unToboggan;
	private Tourniquet unTourniquet;
	private Immeuble unImmeuble;
	private Arbre unArbre;
	private Cité uneCité;

	
	public Catalogue() {
		super();
		this.uneBalancoire = new Balancoire(0, 0, "Jaune", 2, 2);
		this.unBanc = new Banc(0, 0, "Vert", 1, 2);
		this.unToboggan = new Toboggan(0, 0, "Bleu", 2, 1);
		this.unTourniquet = new Tourniquet(0, 0, "Bleu", 2, 2);
		this.unImmeuble = new Immeuble(0, 0, "Noir", 42, 2);
		this.unArbre = new Arbre(0, 0, 10, "Marron", "Jaune");
		this.uneCité = new Cité("Cité des anges");
		initializeCité();
	}
	public void initializeCité() {
		List<ObjetGraphique> d = uneCité.getCite();
		d.add((ObjetGraphique) unImmeuble.clone());
		d.add((ObjetGraphique) unImmeuble.clone());
		d.add((ObjetGraphique) unBanc.clone());
		d.add((ObjetGraphique) unBanc.clone());
		d.add((ObjetGraphique) unBanc.clone());
		d.add((ObjetGraphique) uneBalancoire.clone());
		d.add((ObjetGraphique) unToboggan.clone());
		d.add((ObjetGraphique) unArbre.clone());
		d.add((ObjetGraphique) unArbre.clone());
	}
	public Cité getUneCité() {
		return this.uneCité;
	}
	public Immeuble getUnImmeuble() {
		return this.unImmeuble;
	}

	public Arbre getUnArbre() {
		return this.unArbre;
	}

	public Balancoire getUneBalancoire() {
		return this.uneBalancoire;
	}

	public Banc getUnBanc() {
		return this.unBanc;
	}

	public Toboggan getUnToboggan() {
		return this.unToboggan;
	}

	public Tourniquet getUnTourniquet() {
		return this.unTourniquet;
	}
	
}
