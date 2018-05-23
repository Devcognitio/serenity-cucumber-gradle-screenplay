package com.devcognitio.screenplay.avianca.events;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;
import org.apache.tools.ant.taskdefs.WaitFor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class EnUnFrame {

    private Actor actor;

    public static EnUnFrame llamado(String nombre) {
        WebDriver driver  = Serenity.getWebdriverManager().getCurrentDriver();
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
        driver.switchTo().frame(nombre);
        return new EnUnFrame();
    }
    
    public EnUnFrame entonces(Actor actor) {
        this.actor = actor;
        return this;
    }

    public void espera(Consequence... consequences) {
        actor.should(consequences);
        Serenity.getWebdriverManager().getCurrentDriver().switchTo().defaultContent();
    }
}
