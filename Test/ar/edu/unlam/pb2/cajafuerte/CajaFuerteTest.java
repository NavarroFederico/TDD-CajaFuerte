package ar.edu.unlam.pb2.cajafuerte;

import org.junit.Assert;
import org.junit.Test;

public class CajaFuerteTest {
//nro1
	@Test // por cada funcionalidad debo tener al menos un test
	public void alCrearUnaCajaFuerteDeberiaEstarAbierta() {
		// preparación (dado)given
		// ejecucion (cuando) when
		CajaFuerte caja = cuandoCreoUnaCajaFuerte();
		// contrastacion (entonces)then
		laCajaFuerteEstaAbierta(caja);
	}

//nro2
	@Test
	public void alCerrarDeberiaQuedarCerrada() {
		// preparacion
		CajaFuerte caja = dadoQueExisteUnaCajaFuerte();
		//
		cuandoCierroLaCajaFuerte(caja);
		//
		entoncesLaCajaFuerteEstaCerrada(caja);

	}

	// nro1
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private CajaFuerte cuandoCreoUnaCajaFuerte() {
		// TODO Auto-generated method stub
		return new CajaFuerte();
	}

	private void laCajaFuerteEstaAbierta(CajaFuerte caja) {
		// TODO Auto-generated method stub
		Assert.assertTrue(caja.estaAbierta());

	}
	// nro2
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	private CajaFuerte dadoQueExisteUnaCajaFuerte() {
		// TODO Auto-generated method stub
		return new CajaFuerte();
	}

	private void cuandoCierroLaCajaFuerte(CajaFuerte caja) {
		// TODO Auto-generated method stub
		caja.cerrar();
	}

	private void entoncesLaCajaFuerteEstaCerrada(CajaFuerte caja) {
		// TODO Auto-generated method stub
		Assert.assertEquals(false, caja.estaAbierta());
	}
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
}
