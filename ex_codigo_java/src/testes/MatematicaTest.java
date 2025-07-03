package testes;

import static org.junit.Assert.*;
import junit.framework.Assert.*;
import org.junit.Before;
import org.junit.Test;

import datas_Math.Matematica;

public class MatematicaTest {
	
	Matematica m;

	@Before
	public void setUp() throws Exception {
		m = new Matematica();
	}

	@Test
	public void testSoma() {
		assertEquals(25, m.soma(10, 15));
	}

	@Test
	public void testSubtracao() {
		assertEquals(10, m.subtracao(15, 5));
	}

	@Test
	public void testMultiplicacao() {
		assertEquals(32, m.multiplicacao(8, 4));
	}

	@Test
	public void testDivisao() {
		assertEquals(5, m.divisao(25, 5));
	}

}
