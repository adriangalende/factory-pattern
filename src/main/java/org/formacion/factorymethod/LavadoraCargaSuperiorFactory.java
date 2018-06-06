package org.formacion.factorymethod;

public class LavadoraCargaSuperiorFactory extends LavadoraFactory {
    @Override
    protected Lavadora crearLavadoraTipo() {
        return new LavadoraCargaSuperior();
    }
}
