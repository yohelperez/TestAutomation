package co.edu.udea.certificacion.calidad.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/find_bancolombia_creditos_webpage.feature",
        glue = "co.edu.udea.certificacion.calidad.stepdefinition",
        snippets = SnippetType.CAMELCASE
)
public class FindBancolombiaPage {


}
