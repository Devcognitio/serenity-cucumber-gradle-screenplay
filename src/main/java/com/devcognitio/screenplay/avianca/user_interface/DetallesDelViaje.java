package com.devcognitio.screenplay.avianca.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class DetallesDelViaje {

    public static final Target OPCION_SOLO_IDA = Target.the("opción de vuelo sólo ida")
            .locatedBy("#bkRbIda");

    public static final Target ORIGEN = Target.the("el campo de origen")
            .locatedBy("#bkOrigen");

    public static final Target DESTINO = Target.the("el campo de destino")
            .locatedBy("#bkDestino");

    public static final Target OPCION_DESPLEGABLE = Target.the("la opción {0} de la lista desplegable")
            .locatedBy("//li[contains(text(), '{0}')]");

    public static final Target BOTON_CALENDARIO_SALIDA = Target.the("el botón para seleccionar la fecha de salida")
            .locatedBy("//*[@id='vuelos']/form/div[3]/div[4]/div[1]/div[1]/div/div/span/button");

    public static final Target FECHA_DE_SALIDA = Target.the("la fecha de salida")
            .locatedBy("//td[contains(@data-month, '{0}')]//a[.='{1}']");

}
