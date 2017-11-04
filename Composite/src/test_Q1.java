import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class test_Q1 {
	private Entier e;
	@BeforeEach
	void setUp() throws Exception {
		
	}
	@Test
	void test_valeur_7() {
		Entier e = new Entier(7);
		assertEquals(7, e.evaluate());
	}
	@Test
	void test_valeur_0() {
		Entier e = new Entier(0);
		assertEquals(0, e.evaluate());
	}
	@Test
	void test_valeur_moins7() {
		Entier e = new Entier(-7);
		assertEquals(-7, e.evaluate());
	}
	@Test
	void test_ExpressionPlus_3_valeurs() {
		ExpressionPlus eP = new ExpressionPlus(7,7,7);
		assertEquals(21, eP.evaluate());
	}
	@AfterEach
	void tearDown() throws Exception {
		
	}

	
}
