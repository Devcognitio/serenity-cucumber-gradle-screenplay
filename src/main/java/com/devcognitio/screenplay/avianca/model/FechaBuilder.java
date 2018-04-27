package com.devcognitio.screenplay.avianca.model;

import com.devcognitio.screenplay.avianca.tasks.IngresarFecha;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FechaBuilder {

    private int dia;

    public FechaBuilder de(int dia) {
        this.dia = dia;
        return this;
    }

    public Performable en(Target campoDeFecha) {
        return instrumented(IngresarFecha.class, dia, campoDeFecha);
    }
}
