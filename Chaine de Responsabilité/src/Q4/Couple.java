package Q4;
public class Couple {
	
	int valeurBillet;
	int nombreBilletsDélivrés;
	
	public Couple(int valeurBillet, int nombreBilletsDélivrés) {
		this.valeurBillet = valeurBillet;
		this.nombreBilletsDélivrés = nombreBilletsDélivrés;
	}

	public int getValeurBillet() {
		return this.valeurBillet;
	}

	public int getNombreBilletsDélivrés() {
		return this.nombreBilletsDélivrés;
	}
	
	public String toString() {
		return ("" + this.nombreBilletsDélivrés + " * " + this.valeurBillet);
	}
}
