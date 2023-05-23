package co.edu.udea.certificacion.calidad.interactions;


import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.INPUT_TEXT;
import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.LINK_BANCOLOMBIA_PAGE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class BancolombiaPage implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("bancolombia creditos personas").into(INPUT_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Click.on(LINK_BANCOLOMBIA_PAGE));
    }

    public static BancolombiaPage findItAndGo(){
        return Tasks.instrumented(BancolombiaPage.class);
    }
}
