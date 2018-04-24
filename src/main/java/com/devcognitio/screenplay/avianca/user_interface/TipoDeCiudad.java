package com.devcognitio.screenplay.avianca.user_interface;

public enum TipoDeCiudad {

    Origen("8"),
    Destino("9");

    private String opcionLista;

    TipoDeCiudad(String opcion) {
        this.opcionLista = opcion;
    }

    public String opcionLista() {
        return opcionLista;
    }
}
