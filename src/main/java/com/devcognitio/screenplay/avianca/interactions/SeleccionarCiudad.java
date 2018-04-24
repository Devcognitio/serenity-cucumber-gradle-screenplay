package com.devcognitio.screenplay.avianca.interactions;

import com.devcognitio.screenplay.avianca.model.builders.CiudadBuilder;
import com.devcognitio.screenplay.avianca.user_interface.DetallesDelViaje;
import com.devcognitio.screenplay.avianca.user_interface.TipoDeCiudad;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Keys.*;
import org.openqa.selenium.support.ui.Wait;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.openqa.selenium.Keys.ARROW_DOWN;
import static org.openqa.selenium.Keys.ENTER;

public class SeleccionarCiudad implements Interaction {

    private String ciudad;
    private TipoDeCiudad tipoDeCiudad;
    private Target listaDondeSeUbica;

    public SeleccionarCiudad(String ciudad, TipoDeCiudad tipoDeCiudad, Target listaDondeSeUbica) {
        this.ciudad = ciudad;
        this.tipoDeCiudad = tipoDeCiudad;
        this.listaDondeSeUbica = listaDondeSeUbica;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(ciudad).into(listaDondeSeUbica)
        );

    }

    public static CiudadBuilder deNombre(String ciudad) {
        return new CiudadBuilder().deNombre(ciudad);
    }


}
