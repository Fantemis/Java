import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArbreTest {
	private Arbre ar1;

	@Before
	public void setUp() throws Exception {	
		ar1 = new Arbre(1, 2, 3, "Jaune", "Chene");
	}

	

	@Test
	public void OidDifférentsARBRE(){
		Arbre ar2 = (Arbre) ar1.clone();
		assertNotSame(ar2,ar1);
	}
	@Test
	public void ObjetsDiffsEgauxARBRE(){
		Arbre ar2 = (Arbre) ar1.clone();
		assertNotSame(ar2,ar1);
	}
	@After
	public void tearDown() throws Exception {
		ar1 = null;
	}

}
