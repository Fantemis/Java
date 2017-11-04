package Q2;

public class Couple {
	
	int valeurBillet;
	int nombreBilletsDelivres;
	
	public Couple(int valeurBillet, int nombreBilletsDelivres) {
		this.valeurBillet = valeurBillet;
		this.nombreBilletsDelivres = nombreBilletsDelivres;
	}

	public int getValeurBillet() {
		return valeurBillet;
	}

	public int getNombreBilletsDelivres() {
		return nombreBilletsDelivres;
	}
	
	public String toString() {
		return ("" + this.nombreBilletsDelivres + " * " + this.valeurBillet);
	}
}
