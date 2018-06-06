package org.formacion.factorymethod;

public abstract class LavadoraFactory{
    public Lavadora crearLavadora(){
        Lavadora lavadora = crearLavadora();
        lavadora.ponerMandos();
        lavadora.ponerTambor();
        return lavadora;
    }

    protected  abstract Lavadora crearLavadoraTipo();
}
