package com.devcognitio.screenplay.avianca.user_interface;

public enum Opcion {

    SeleccionaTuViaje("https://www.avianca.com/co/es/");

    private final String url;

    Opcion(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
