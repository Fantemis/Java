package personne;

import java.util.LinkedList;
import java.util.List;

public class Memento implements Cloneable {

	private String nom;

	private List<String> pr�noms;

	public Memento(){
		this.nom = null;
		this.pr�noms = new LinkedList<String>();
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPremierPr�nom() {
		if (this.pr�noms.size() > 0)
			return this.pr�noms.get(0);
		else
			return null;
	}
	
	public String getDeuxi�mePr�nom() {
		if (this.pr�noms.size() > 1)
			return this.pr�noms.get(1);
		else
			return null;
	}
	
	public String getTroisi�mePr�nom() {
		if (this.pr�noms.size() > 2)
			return this.pr�noms.get(2);
		else
			return null;
	}
	
	public boolean ajoutPr�nom(String pr�nom) {
		if (this.pr�noms.size() < 3){
			this.pr�noms.add(pr�nom);
			return true;
		}
		return false;
	}
	
	public Memento clone() {
		Memento memento = null;
		try {
			memento = (Memento) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		memento.pr�noms = new LinkedList<String>();
		for (String s : this.pr�noms) {
			memento.pr�noms.add(s);
		}
		return memento;
	}

}
