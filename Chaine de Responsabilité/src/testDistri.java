import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testDistri {
	Distributeur d;
	@Before
	public void setUp() throws Exception {
		d = new Distributeur(10,10,10);
	}

	@After
	public void tearDown() throws Exception {
		d = null;
	}

	@Test
	public void test10() {
		List<Couple> proposition = d.donnerBillets(10);
		assertEquals(0,d.montantRestantDû(proposition, 10));
		assertEquals(10,proposition.get(0).getValeurBillet());
		assertEquals(1,proposition.get(0).getNombreBilletsDélivrés());
	}
	@Test
	public void test20() {
		List<Couple> proposition = d.donnerBillets(20);
		assertEquals(0,d.montantRestantDû(proposition, 20));
		assertEquals(10,proposition.get(0).getValeurBillet());
		assertEquals(2,proposition.get(0).getNombreBilletsDélivrés());
	}
	@Test
	public void test30() {
		List<Couple> proposition = d.donnerBillets(30);
		assertEquals(0,d.montantRestantDû(proposition, 30));
		assertEquals(20,proposition.get(0).getValeurBillet());
		assertEquals(1,proposition.get(0).getNombreBilletsDélivrés());
		assertEquals(10,proposition.get(1).getValeurBillet());
		assertEquals(1,proposition.get(1).getNombreBilletsDélivrés());
	}
	@Test
	public void test40() {
		List<Couple> proposition = d.donnerBillets(40);
		assertEquals(0,d.montantRestantDû(proposition, 40));
		assertEquals(20,proposition.get(0).getValeurBillet());
		assertEquals(1,proposition.get(0).getNombreBilletsDélivrés());
		assertEquals(10,proposition.get(1).getValeurBillet());
		assertEquals(2,proposition.get(1).getNombreBilletsDélivrés());

	}
	@Test
	public void test50() {
		List<Couple> proposition = d.donnerBillets(50);
		assertEquals(0,d.montantRestantDû(proposition, 50));
		assertEquals(20,proposition.get(0).getValeurBillet());
		assertEquals(2,proposition.get(0).getNombreBilletsDélivrés());
		assertEquals(10,proposition.get(1).getValeurBillet());
		assertEquals(1,proposition.get(1).getNombreBilletsDélivrés());
	}
	@Test
	public void test60() {
		List<Couple> proposition = d.donnerBillets(60);
		assertEquals(0,d.montantRestantDû(proposition, 60));
		assertEquals(20,proposition.get(0).getValeurBillet());
		assertEquals(2,proposition.get(0).getNombreBilletsDélivrés());
		assertEquals(10,proposition.get(1).getValeurBillet());
		assertEquals(2,proposition.get(1).getNombreBilletsDélivrés());
	}
	@Test
	public void test70() {
		List<Couple> proposition = d.donnerBillets(70);
		assertEquals(0,d.montantRestantDû(proposition, 70));
		assertEquals(20,proposition.get(0).getValeurBillet());
		assertEquals(3,proposition.get(0).getNombreBilletsDélivrés());
		assertEquals(10,proposition.get(1).getValeurBillet());
		assertEquals(1,proposition.get(1).getNombreBilletsDélivrés());
	
	}
	@Test
	public void test100() {
		List<Couple> proposition = d.donnerBillets(100);
		assertEquals(0,d.montantRestantDû(proposition, 100));
		assertEquals(50,proposition.get(0).getValeurBillet());
		assertEquals(1,proposition.get(0).getNombreBilletsDélivrés());
		assertEquals(20,proposition.get(1).getValeurBillet());
		assertEquals(2,proposition.get(1).getNombreBilletsDélivrés());
		assertEquals(10,proposition.get(2).getValeurBillet());
		assertEquals(1,proposition.get(2).getNombreBilletsDélivrés());

	}
	@Test
	public void test110() {
		List<Couple> proposition = d.donnerBillets(110);
		assertEquals(0,d.montantRestantDû(proposition, 110));
		assertEquals(50,proposition.get(0).getValeurBillet());
		assertEquals(1,proposition.get(0).getNombreBilletsDélivrés());
		assertEquals(20,proposition.get(1).getValeurBillet());
		assertEquals(2,proposition.get(1).getNombreBilletsDélivrés());
		assertEquals(10,proposition.get(2).getValeurBillet());
		assertEquals(2,proposition.get(2).getNombreBilletsDélivrés());

	}
	@Test
	public void test210() {
		List<Couple> proposition = d.donnerBillets(210);
		assertEquals(0,d.montantRestantDû(proposition, 210));
		assertEquals(50,proposition.get(0).getValeurBillet());
		assertEquals(2,proposition.get(0).getNombreBilletsDélivrés());
		assertEquals(20,proposition.get(1).getValeurBillet());
		assertEquals(5,proposition.get(1).getNombreBilletsDélivrés());
		assertEquals(10,proposition.get(2).getValeurBillet());
		assertEquals(1,proposition.get(2).getNombreBilletsDélivrés());

	}
	@Test
	public void test310() {
		List<Couple> proposition = d.donnerBillets(310);
		assertEquals(0,d.montantRestantDû(proposition, 310));
		assertEquals(50,proposition.get(0).getValeurBillet());
		assertEquals(3,proposition.get(0).getNombreBilletsDélivrés());
		assertEquals(20,proposition.get(1).getValeurBillet());
		assertEquals(7,proposition.get(1).getNombreBilletsDélivrés());
		assertEquals(10,proposition.get(2).getValeurBillet());
		assertEquals(2,proposition.get(2).getNombreBilletsDélivrés());

	}
	@Test
	public void test3000() {
		List<Couple> proposition = d.donnerBillets(3000);
		assertEquals(2200,d.montantRestantDû(proposition, 3000));
		assertEquals(50,proposition.get(0).getValeurBillet());
		assertEquals(10,proposition.get(0).getNombreBilletsDélivrés());
		assertEquals(20,proposition.get(1).getValeurBillet());
		assertEquals(10,proposition.get(1).getNombreBilletsDélivrés());
		assertEquals(10,proposition.get(2).getValeurBillet());
		assertEquals(10,proposition.get(2).getNombreBilletsDélivrés());

	}
	
}
