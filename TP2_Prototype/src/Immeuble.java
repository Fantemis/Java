
public class Immeuble extends ObjetGraphique implements Cloneable{
	private String couleur;
	private int nbEtages;
	private int hauteurEtage;
	
	public Immeuble(double cX, double cY, String c, int nbEtages, int hEtages) {
		super(cX, cY);
		this.couleur = c;
		this.nbEtages = nbEtages;
		this.hauteurEtage = hEtages;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public void setNbEtages(int nbEtages) {
		this.nbEtages = nbEtages;
	}

	public void setHauteurEtage(int hauteurEtage) {
		this.hauteurEtage = hauteurEtage;
	}
	@Override
	public Object clone(){ 
		Immeuble im = (Immeuble)super.clone();
		im.couleur = this.couleur;
		im.hauteurEtage = this.hauteurEtage;
		im.nbEtages = this.nbEtages;	
		return im;  
	   }


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Immeuble other = (Immeuble) obj;
		if (couleur == null) {
			if (other.couleur != null)
				return false;
		} else if (!couleur.equals(other.couleur))
			return false;
		if (hauteurEtage != other.hauteurEtage)
			return false;
		if (nbEtages != other.nbEtages)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "Immeuble [couleur=" + this.couleur + ", nbEtages=" + this.nbEtages + ", hauteurEtage=" + this.hauteurEtage + "]";
	}
	
}
