package org.formacion.factorymethod;

public abstract class Lavadora {

	protected boolean tieneTambor=false;
	protected boolean tieneMandos=false;
	protected String  tipoCarga;
	
	public void ponerTambor() {
		tieneTambor = true;
	}
	
	public void ponerMandos() {
		tieneMandos = true;
	}

}
