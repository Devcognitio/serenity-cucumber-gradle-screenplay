package com.devcognitio.screenplay.avianca.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class ListaDeVuelos {

    public static Target CLASE_DE_VUELO = Target.the("la clase {0}")
            .locatedBy("//li[contains(text(), '{0}')]");
}
