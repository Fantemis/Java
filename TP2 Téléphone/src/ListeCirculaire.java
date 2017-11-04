import java.util.ArrayList;

public class ListeCirculaire<T> {
	private ArrayList<T> liste;
	private int pos;

	public ListeCirculaire() {
		this.liste = new ArrayList<T>();
		this.pos = 1;
	}

	public void ajouterE(T e) {
		this.liste.add(e);
	}

	public T premier() throws ListeVide {
		if (this.liste.size() == 0) {
			throw new ListeVide();
		}
		return this.liste.get(0);
	}

	public T suivant() throws ListeVide {
		if (this.liste.size() == 0) {
			throw new ListeVide();
		}
		if (this.pos == this.liste.size()) {
			this.pos = 0;
		}
		return this.liste.get(pos++);

	}

	@Override
	public String toString() {
		return" "+ liste +" ";
	}
	
}
