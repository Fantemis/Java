
public class Banc extends ObjetGraphique{
	private String couleur;
	private double hauteur;
	private double largeur;
	public Banc(double coordX, double coordY, String couleur, double hauteur, double largeur) {
		super(coordX, coordY);
		this.couleur = couleur;
		this.hauteur = hauteur;
		this.largeur = largeur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banc other = (Banc) obj;
		if (couleur == null) {
			if (other.couleur != null)
				return false;
		} else if (!couleur.equals(other.couleur))
			return false;
		if (Double.doubleToLongBits(hauteur) != Double.doubleToLongBits(other.hauteur))
			return false;
		if (Double.doubleToLongBits(largeur) != Double.doubleToLongBits(other.largeur))
			return false;
		return true;
	}
	@Override
	public Object clone(){ 
		Banc b = (Banc)super.clone();	
		return b;  
	   }
	@Override
	public String toString() {
		return super.toString() + "Banc [couleur=" + couleur + ", hauteur=" + hauteur + ", largeur=" + largeur + "]";
	}
	
	
}
