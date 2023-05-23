package co.edu.udea.certificacion.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UsuarioPage extends PageObject {
     public static final Target INPUT_TEXT = Target.the("INPUT TEXT").located(By.name("q"));
     public static final Target INPUT_TEXT1 = Target.the("INPUT TEXT").locatedBy("//*[@name='q']");
     public static final Target LINK_BANCOLOMBIA_PAGE = Target.the("LINK BANCOLOMBIA PAGE").locatedBy("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/a/h3");
     public static final Target TEXT_BANCOLOMBIA_PAGE = Target.the("Texto de Bancolombia").locatedBy("//*[@id=\"footer\"]/div[2]/div/div/div/p");

}
