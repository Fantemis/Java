package Q4;
public class Couple {
	
	int valeurBillet;
	int nombreBilletsD�livr�s;
	
	public Couple(int valeurBillet, int nombreBilletsD�livr�s) {
		this.valeurBillet = valeurBillet;
		this.nombreBilletsD�livr�s = nombreBilletsD�livr�s;
	}

	public int getValeurBillet() {
		return this.valeurBillet;
	}

	public int getNombreBilletsD�livr�s() {
		return this.nombreBilletsD�livr�s;
	}
	
	public String toString() {
		return ("" + this.nombreBilletsD�livr�s + " * " + this.valeurBillet);
	}
}
