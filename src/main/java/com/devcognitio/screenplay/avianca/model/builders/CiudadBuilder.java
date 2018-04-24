package com.devcognitio.screenplay.avianca.model.builders;

import com.devcognitio.screenplay.avianca.interactions.SeleccionarCiudad;
import com.devcognitio.screenplay.avianca.user_interface.TipoDeCiudad;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CiudadBuilder {

    private String nombre;
    private TipoDeCiudad tipo;

    public CiudadBuilder deNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public CiudadBuilder deTipo(TipoDeCiudad tipo) {
        this.tipo = tipo;
        return this;
    }

    public Performable en(Target listaDondeSeUbica) {
        return instrumented(SeleccionarCiudad.class, nombre, tipo, listaDondeSeUbica);
    }
}
