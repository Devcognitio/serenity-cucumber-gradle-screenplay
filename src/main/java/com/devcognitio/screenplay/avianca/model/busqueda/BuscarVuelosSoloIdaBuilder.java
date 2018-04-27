package com.devcognitio.screenplay.avianca.model.busqueda;

import com.devcognitio.screenplay.avianca.tasks.busqueda.BuscarVuelosSoloIda;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarVuelosSoloIdaBuilder {

    private String origen;
    private String destino;

    public BuscarVuelosSoloIdaBuilder de(String origen) {
        this.origen = origen;
        return this;
    }

    public BuscarVuelosSoloIdaBuilder a(String destino) {
        this.destino = destino;
        return this;
    }

    public Performable patiendoDesde(FechaDeSalida fechaDeSalida) {
        return instrumented(BuscarVuelosSoloIda.class, origen, destino, fechaDeSalida);
    }
}
