
public class Arbre extends ObjetGraphique implements Cloneable{
	private int hauteur;
	private String couleurTronc;
	private String couleurFeuilles;
	
	public Arbre(double cX, double cY, int h, String cTronc, String cFeuilles) {
		super(cX, cY);
		this.hauteur = h;
		this.couleurTronc = cTronc;
		this.couleurFeuilles = cFeuilles;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	
	public void setCouleurTronc(String couleurTronc) {
		this.couleurTronc = couleurTronc;
	}

	public void setCouleurFeuilles(String couleurFeuilles) {
		this.couleurFeuilles = couleurFeuilles;
	}
	@Override
	public Object clone(){  
		Arbre a = (Arbre)super.clone();
		a.couleurFeuilles = this.couleurFeuilles;
		a.couleurTronc = this.couleurTronc;
		a.hauteur = this.hauteur;
		return a;
	   }
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arbre other = (Arbre) obj;
		if (couleurFeuilles == null) {
			if (other.couleurFeuilles != null)
				return false;
		} else if (!couleurFeuilles.equals(other.couleurFeuilles))
			return false;
		if (couleurTronc == null) {
			if (other.couleurTronc != null)
				return false;
		} else if (!couleurTronc.equals(other.couleurTronc))
			return false;
		if (hauteur != other.hauteur)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return super.toString() + "Arbre [hauteur=" + this.hauteur + ", couleurTronc=" + this.couleurTronc + ", couleurFeuilles=" + this.couleurFeuilles
				+ " ] ";
	}
	
}
