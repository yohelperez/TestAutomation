package co.edu.udea.certificacion.calidad.stepdefinition;


import co.edu.udea.certificacion.calidad.tasks.FindThe;
import co.edu.udea.certificacion.calidad.tasks.OpenThe;
import co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
public class FindBancolombiaPageStepDefinition {

    @Managed(driver = "chrome")
    public WebDriver driver;

    //Actor que realiza los casos del caso prueba
    private Actor usuario = Actor.named("Dominique");

    @Before(order=1)
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Before(order=2)
    public void preStage(){
        driver.manage().window().maximize();
        usuario.can(BrowseTheWeb.with(driver));
    }

    @Given("que me encuentro en la pagina principal de google")
    public void queMeEncuentroPaginaGoogle(){
        usuario.attemptsTo(OpenThe.Browser(new UsuarioPage()));
    }

    @When("escriba la palabra bancolombia creditos")
    public void escribaLaPalabraBancolombiaCreditos(){
        usuario.attemptsTo(FindThe.BancolombiaPage());
    }

    @Then("puedo ver el link de la pagina oficial de creditos de bancolombia")
    public void puedoVerElLink(){
        //todo
        //throw new PendingException();
    }
}
