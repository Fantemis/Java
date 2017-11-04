import java.awt.List;
import java.util.Collection;

public class main {

	public static void main(String[] args) {
		testenum test = new testenum(Monenum.boudin);
		int e = test.returnEnum().mdr.ordinal();
		System.out.println(e);
		Collection<String> coll = new List<String>();
		String c = "CACA";
		coll.add(c);
	}

}
