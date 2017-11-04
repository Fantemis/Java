import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class testenum {
	private Monenum enuuum;
	private ArrayList l;
	private LinkedList ll;
	public testenum(Monenum e) {
		this.enuuum = e;
		l = new ArrayList();
		ll = new LinkedList();
	}
	
	public Monenum returnEnum() throws IllegalArgumentException{
		if(this.enuuum==Monenum.boudin) {
			ArrayList<String> lis = new ArrayList<String>();
			throw new IllegalArgumentException("CACA BOUDIN ALALA");
		}
		return this.enuuum;
	}
	@Override
	public String toString() {
		return "testenum [enuuum=" + this.enuuum + "]";
	}
}
