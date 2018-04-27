package com.devcognitio.screenplay.avianca.tasks.busqueda;

import com.devcognitio.screenplay.avianca.model.busqueda.FechaDeSalida;
import com.devcognitio.screenplay.avianca.tasks.IngresarFecha;
import com.devcognitio.screenplay.avianca.tasks.SeleccionarItinerario;
import com.devcognitio.screenplay.avianca.user_interface.DetallesDelViaje;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class BuscarVuelosSoloIda implements Task {

    private final String origen;
    private final String destino;
    private final FechaDeSalida fechaDeSalida;

    public BuscarVuelosSoloIda(String origen, String destino, FechaDeSalida fechaDeSalida) {
        this.origen = origen;
        this.destino = destino;
        this.fechaDeSalida = fechaDeSalida;
    }

    @Override
    @Step("{0} busca vuelos partiendo desde #origen hasta #destino a partir del dia de #fechaDeSalida")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DetallesDelViaje.OPCION_SOLO_IDA),
                SeleccionarItinerario.de(origen).a(destino),
                IngresarFecha.de(fechaDeSalida).en(DetallesDelViaje.BOTON_CALENDARIO_SALIDA),
                Click.on(DetallesDelViaje.BOTON_CONSULTA)
        );

    }
}
