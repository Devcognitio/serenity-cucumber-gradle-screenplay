package com.devcognitio.screenplay.avianca.model;

import com.devcognitio.screenplay.avianca.interactions.SeleccionarCiudad;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CiudadBuilder {

    private String nombre;

    public CiudadBuilder deNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Performable en(Target listaDondeSeUbica) {
        return instrumented(SeleccionarCiudad.class, nombre, listaDondeSeUbica);
    }
}
