
public class ObjetGraphique implements Cloneable{
	private double coordX;
	private double coordY;
	
	public ObjetGraphique(double coordX, double coordY) {
		this.coordX=coordX;
		this.coordY=coordY;
	}
	public void translater(double cX, double cY) {
		this.coordX += cX;
		this.coordY += cY;
	}
	@Override
	public Object clone(){  
		ObjetGraphique o = null;
		try {
			o = (ObjetGraphique)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}  
		return o;  
	   }
	@Override
	public String toString() {
		return "ObjetGraphique [coordX=" + this.coordX + ", coordY=" + this.coordY + "] ";
	}
	
}
