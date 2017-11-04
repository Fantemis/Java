import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class Cit� implements Cloneable{
	
	private String nom;
	private LinkedList<ObjetGraphique> cit ;
	
	public Cit�( String nom) {
		this.nom = nom;
		this.cit = new LinkedList<ObjetGraphique>();
	}
	@Override
	public Cit� clone(){ 
		LinkedList<ObjetGraphique> c = new LinkedList<ObjetGraphique>();
		Cit� cit�Tmp = null;
		try {
			cit�Tmp = (Cit�) super.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		for(ObjetGraphique o : cit�Tmp.cit) {
			cit�Tmp.cit.add(o);
		}
		return cit�Tmp;
	   }
	public LinkedList<ObjetGraphique> getCite() {
		return this.clone().cit;
	}
	@Override
	public String toString() {
		return "Cit� [nom=" + nom + ", cit=" + cit + "]";
	}
	
	
}
