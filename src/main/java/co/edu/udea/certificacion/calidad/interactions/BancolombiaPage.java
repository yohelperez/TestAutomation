package co.edu.udea.certificacion.calidad.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import org.openqa.selenium.Keys;

import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.*;

public class BancolombiaPage implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("bancolombia simular credito de libre inversion").into(INPUT_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Click.on(LINK_BANCOLOMBIA_PAGE));
        actor.attemptsTo(Click.on(BUTTON_CONTINUAR));
        actor.attemptsTo(Enter.keyValues(Keys.ENTER).into(CHECK_SI));
        actor.attemptsTo();
    }

    public static BancolombiaPage findItAndGo(){
        return Tasks.instrumented(BancolombiaPage.class);
    }
}
