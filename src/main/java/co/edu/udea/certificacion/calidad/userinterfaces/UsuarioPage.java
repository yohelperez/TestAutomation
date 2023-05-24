package co.edu.udea.certificacion.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UsuarioPage extends PageObject {
     public static final Target INPUT_TEXT = Target.the("INPUT TEXT").located(By.name("q"));
     public static final Target INPUT_TEXT1 = Target.the("INPUT TEXT").locatedBy("//*[@name='q']");
     public static final Target LINK_BANCOLOMBIA_PAGE = Target.the("LINK BANCOLOMBIA PAGE").locatedBy("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/a/h3");


     //buttons to click in bancolombia website
     public static  final Target BUTTON_CONTINUAR = Target.the("Boton continuar").locatedBy("//*[@id=\"boton-seleccion-tarjeta\"]");

     public static final Target CHECK_SI = Target.the("Check si").locatedBy("//*[@id='opcion-si']");


     //public static final Target TEXT_BANCOLOMBIA_PAGE = Target.the("Texto de Simulador Credito Bancolombia").locatedBy("//*[@id=\"layoutContainers\"]/div/div[2]/div/div[2]/section/div[3]/div[2]/app-root/div/app-solicitud-informacion/section/div[1]/h1");
     public static final Target TEXT_BANCOLOMBIA_PAGE = Target.the("Texto de Simulador Credito Bancolombia").locatedBy("//*[@id=\"mat-hint-2\"]");

}
