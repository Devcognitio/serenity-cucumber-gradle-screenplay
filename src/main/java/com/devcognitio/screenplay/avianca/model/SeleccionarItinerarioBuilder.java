package com.devcognitio.screenplay.avianca.model;

import com.devcognitio.screenplay.avianca.tasks.SeleccionarItinerario;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarItinerarioBuilder {

    private String origen;

    public SeleccionarItinerarioBuilder de(String origen) {
        this.origen = origen;
        return this;
    }

    public Performable a(String destino) {
        return instrumented(SeleccionarItinerario.class, origen, destino);
    }

}
