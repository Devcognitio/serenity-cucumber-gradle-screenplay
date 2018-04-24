package com.devcognitio.screenplay.avianca.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class DetallesDelViaje {

    public static final Target TIPO_DE_VUELO = Target.the("opcion de vuelo {0}")
            .locatedBy("#radio_{0}");

    public static final Target ORIGEN = Target.the("el campo de origen")
            .locatedBy("#bkOrigen");

    public static final Target DESTINO = Target.the("el campo de destino")
            .locatedBy("#bkDestino");

}
