package com.devcognitio.screenplay.avianca.questions;

import com.devcognitio.screenplay.avianca.user_interface.ListaDeVuelos;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Consequence;

import java.util.List;
import java.util.stream.Collectors;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ClasesDeVueloDisponibles {

    public static Consequence[] verQueCadaClaseDeVueloEstaEn(List<String> clasesDeVuelo) {
        Serenity.getWebdriverManager().getCurrentDriver().switchTo().frame("FrameAmadeus");
        return clasesDeVuelo.stream().map(
                clase -> seeThat(the(ListaDeVuelos.CLASE_DE_VUELO.of(clase)), isVisible())
        ).collect(Collectors.toList()).toArray(new Consequence[]{});
    }
}
