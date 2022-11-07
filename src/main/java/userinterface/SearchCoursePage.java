package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_CYC = Target.the("Selecciona la opcion Cursos y Certificaciones")
            .located(By.xpath("//div[@id='certificaciones']//strong"));

    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso")
            .located(By.xpath("//button[@class='btn btn-secondary']"));

    public static final Target SELECT_COURSE = Target.the("Da click para acceder a la seccion del curso")
            .located(By.xpath("//h4//a[contains(text(), 'Metodología Bancolombia')]"));

    public static final Target NAME_COURSE = Target.the("extrae el nombre del curso")
            .located(By.xpath("//h1[contains(text(),'Metodología Bancolombia')]"));

}