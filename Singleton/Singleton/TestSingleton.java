package Singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSingleton {
	
	
	@Test
	public void testNonVide() {
		assertTrue(Singleton.getInstance()!=null);
	}
	@Test
	public void testReturnObj() {
		assertTrue(Singleton.getInstance() instanceof Singleton);
	}
	@Test
	public void testReturnSameObj() {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		assertTrue(s1==s2);
		assertSame(s1,s2);
	}
	
}