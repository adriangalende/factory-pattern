package org.formacion.factorymethod;

public class LavadoraCargaFrontalFactory extends LavadoraFactory{

    @Override
    protected Lavadora crearLavadoraTipo() {
        return new LavadoraCargaFrontal();
    }
}
