package com.devcognitio.screenplay.avianca.interactions;

import com.devcognitio.screenplay.avianca.model.CiudadBuilder;
import com.devcognitio.screenplay.avianca.user_interface.DetallesDelViaje;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarCiudad implements Interaction {

    private String ciudad;
    private Target listaDondeSeUbica;

    public SeleccionarCiudad(String ciudad, Target listaDondeSeUbica) {
        this.ciudad = ciudad;
        this.listaDondeSeUbica = listaDondeSeUbica;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(ciudad).into(listaDondeSeUbica),
                WaitUntil.the(DetallesDelViaje.OPCION_DESPLEGABLE.of(ciudad), isVisible()),
                Click.on(DetallesDelViaje.OPCION_DESPLEGABLE.of(ciudad))
        );

    }

    public static CiudadBuilder deNombre(String ciudad) {
        return new CiudadBuilder().deNombre(ciudad);
    }


}
