public class Balancoire extends ObjetGraphique{
	private String couleur;
	private double hauteur;
	private int nbSiege;
	
	public Balancoire(int cX, int cY, String c, double h, int nbS) {
		super(cX, cY);
		this.couleur = c;
		this.hauteur = h;
		this.nbSiege = nbS;
		
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

	public void setNbSiege(int nbSiege) {
		this.nbSiege = nbSiege;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Balancoire other = (Balancoire) obj;
		if (couleur == null) {
			if (other.couleur != null)
				return false;
		} else if (!couleur.equals(other.couleur))
			return false;
		if (Double.doubleToLongBits(hauteur) != Double.doubleToLongBits(other.hauteur))
			return false;
		if (nbSiege != other.nbSiege)
			return false;
		return true;
	}
	@Override
	public Object clone(){ 
		Balancoire bal = (Balancoire)super.clone();
		return bal;  
	   }

	@Override
	public String toString() {
		return super.toString() + "Balancoire [couleur=" + couleur + ", hauteur=" + hauteur + ", nbSiege=" + nbSiege + "]";
	}
	
}
