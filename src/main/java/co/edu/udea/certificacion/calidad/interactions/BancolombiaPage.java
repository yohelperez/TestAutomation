package co.edu.udea.certificacion.calidad.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import org.openqa.selenium.Keys;


import java.util.Random;

import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.*;

public class BancolombiaPage implements Interaction {
    Random random = new Random();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("bancolombia simulador credito de libre inversion").into(INPUT_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Click.on(LINK_BANCOLOMBIA_PAGE));
        actor.attemptsTo(Click.on(BUTTON_CONTINUAR));
        actor.attemptsTo(Click.on(CHECK_SI));

        //Inicio llenado de datos del form

        int randomAmount = random.nextInt(500000000) + 1000000;
        actor.attemptsTo(Enter.theValue(Integer.toString(randomAmount)).into(AMOUNT_INPUT).thenHit(Keys.RETURN));

        int randomMonths = random.nextInt(37) + 48;
        actor.attemptsTo(Enter.theValue(Integer.toString(randomMonths)).into(MONTHS_INPUT).thenHit(Keys.RETURN));

        //Ingreso de datos de nacimiento
        actor.attemptsTo(Click.on(BIRTHDATE_INPUT));
        actor.attemptsTo(Click.on(YEAR_BUTTON));
        actor.attemptsTo(Click.on(MONTH_BUTTON));
        actor.attemptsTo(Click.on(DAY_BUTTON));
        actor.attemptsTo(Click.on(SIMULATE_BUTTON));

    }

    public static BancolombiaPage findItAndGo(){
        return Tasks.instrumented(BancolombiaPage.class);
    }
}
