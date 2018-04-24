package com.devcognitio.screenplay.avianca.tasks;

import com.devcognitio.screenplay.avianca.interactions.SeleccionarCiudad;
import com.devcognitio.screenplay.avianca.model.builders.SeleccionarItinerarioBuilder;
import com.devcognitio.screenplay.avianca.user_interface.DetallesDelViaje;
import com.devcognitio.screenplay.avianca.user_interface.TipoDeCiudad;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

public class SeleccionarItinerario implements Task {

    private String origen;
    private String destino;

    public SeleccionarItinerario(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
    }

    @Override
    @Step("{0} selecciona itinerario de #origen a #destino")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarCiudad.deNombre(origen).deTipo(TipoDeCiudad.Origen).en(DetallesDelViaje.ORIGEN),
                SeleccionarCiudad.deNombre(destino).deTipo(TipoDeCiudad.Destino).en(DetallesDelViaje.DESTINO)
        );
    }

    public static SeleccionarItinerarioBuilder de(String origen) {
        return new SeleccionarItinerarioBuilder().de(origen);
    }
}