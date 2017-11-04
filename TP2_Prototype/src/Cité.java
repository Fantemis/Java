import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class Cité implements Cloneable{
	
	private String nom;
	private LinkedList<ObjetGraphique> cit ;
	
	public Cité( String nom) {
		this.nom = nom;
		this.cit = new LinkedList<ObjetGraphique>();
	}
	@Override
	public Cité clone(){ 
		LinkedList<ObjetGraphique> c = new LinkedList<ObjetGraphique>();
		Cité citéTmp = null;
		try {
			citéTmp = (Cité) super.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		for(ObjetGraphique o : citéTmp.cit) {
			citéTmp.cit.add(o);
		}
		return citéTmp;
	   }
	public LinkedList<ObjetGraphique> getCite() {
		return this.clone().cit;
	}
	@Override
	public String toString() {
		return "Cité [nom=" + nom + ", cit=" + cit + "]";
	}
	
	
}
