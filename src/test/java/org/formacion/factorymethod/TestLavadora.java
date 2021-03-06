package org.formacion.factorymethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLavadora {

	@Test
	public void test_carga_frontal() {
		
//		Lavadora lavadora = new LavadoraCargaFrontal();
//		lavadora.ponerMandos();
//		lavadora.ponerTambor();
//
//		assertEquals("frontal", lavadora.tipoCarga);
//		assertTrue(lavadora.tieneMandos);
//		assertTrue(lavadora.tieneTambor);

		LavadoraFactory lavadoraFactory = new LavadoraCargaFrontalFactory();
		assertNotNull(lavadoraFactory);

		Lavadora lavadora = lavadoraFactory.crearLavadora();
		assertNotNull(lavadora);

		assertEquals("frontal", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);

	}

	@Test
	public void test_carga_superior() {
//
//		Lavadora lavadora = new LavadoraCargaSuperior();
//		lavadora.ponerMandos();
//		lavadora.ponerTambor();
//
//		assertEquals("superior", lavadora.tipoCarga);
//		assertTrue(lavadora.tieneMandos);
//		assertTrue(lavadora.tieneTambor);
		LavadoraFactory lavadoraFactory = new LavadoraCargaSuperiorFactory();
		assertNotNull(lavadoraFactory);

		Lavadora lavadora = lavadoraFactory.crearLavadora();
		assertEquals("superior",lavadora.tipoCarga);
		assertTrue(lavadora.tieneTambor);
		assertTrue(lavadora.tieneMandos);

	}

}
