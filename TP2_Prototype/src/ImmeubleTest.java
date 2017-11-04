import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ImmeubleTest {
	private Immeuble im1;

	@Before
	public void setUp() throws Exception {
		im1 = new Immeuble(1,2,"Jaune",1,2);
	}
	@Test
	public void OidDifférentsIMMEUBLE(){
		Immeuble im2 = (Immeuble) im1.clone();
		assertNotSame(im2,im1);
	}
	@Test
	public void ObjetsDiffsEgauxIMMEUBLE(){
		Immeuble im3 = (Immeuble) im1.clone();
		assertEquals(im3,im1);
	}
	@After
	public void tearDown() throws Exception {
		im1 = null;
	}

}
