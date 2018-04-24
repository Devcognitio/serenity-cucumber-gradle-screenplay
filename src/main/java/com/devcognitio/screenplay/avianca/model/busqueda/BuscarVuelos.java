package com.devcognitio.screenplay.avianca.model.busqueda;

import com.devcognitio.screenplay.avianca.model.builders.busqueda.BuscarVuelosSoloIdaBuilder;

public class BuscarVuelos {

    public static BuscarVuelosSoloIdaBuilder paraViajeDeSoloIda() {
        return new BuscarVuelosSoloIdaBuilder();
    }
}
