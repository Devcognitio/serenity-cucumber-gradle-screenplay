package com.devcognitio.screenplay.avianca.features;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/consulta_de_tiquetes/consulta_de_tiquetes_solo_ida.feature")
public class ConsultaDeTiquetesSoloIda { }
