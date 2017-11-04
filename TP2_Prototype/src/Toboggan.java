
public class Toboggan extends ObjetGraphique{
	
	private String couleur;
	private double hauteur;
	private double largeur;
	public Toboggan(int cX, int cY, String couleur, double hauteur, double largeur) {
		super(cX, cY);
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
		Toboggan other = (Toboggan) obj;
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
		Toboggan tob = (Toboggan)super.clone();
		return tob;  
	}
	@Override
	public String toString() {
		return super.toString() + "Toboggan [couleur=" + couleur + ", hauteur=" + hauteur + ", largeur=" + largeur + "]";
	}
	
}
