public class Tourniquet extends ObjetGraphique{
	private String couleur;
	private double hauteur;
	private int diametre;
	public Tourniquet(double coordX, double coordY, String couleur, double hauteur, int diametre) {
		super(coordX, coordY);
		this.couleur = couleur;
		this.hauteur = hauteur;
		this.diametre = diametre;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}
	public void setDiametre(int diametre) {
		this.diametre = diametre;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tourniquet other = (Tourniquet) obj;
		if (couleur == null) {
			if (other.couleur != null)
				return false;
		} else if (!couleur.equals(other.couleur))
			return false;
		if (diametre != other.diametre)
			return false;
		if (Double.doubleToLongBits(hauteur) != Double.doubleToLongBits(other.hauteur))
			return false;
		return true;
	}
	@Override
	public Object clone(){ 
		Tourniquet tour = (Tourniquet)super.clone();
		return tour;
	   }
	@Override
	public String toString() {
		return super.toString() + "Tourniquet [couleur=" + couleur + ", hauteur=" + hauteur + ", diametre=" + diametre + "]";
	}
	
	
}
