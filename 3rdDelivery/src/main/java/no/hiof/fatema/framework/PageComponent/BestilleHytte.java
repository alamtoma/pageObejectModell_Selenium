package no.hiof.fatema.framework.PageComponent;

import no.hiof.fatema.framework.AbstractComponents.AbstractComponentFinn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BestilleHytte extends AbstractComponentFinn {
    WebDriver driver;
    By sectionElement= By.id("originInput");
    By selectHytte= By.cssSelector("#originInput");

    public BestilleHytte(WebDriver driver, By sectionElement) {
        super(driver,sectionElement);
    }
    public void getFlightAttribute(){
        System.out.println(findElement(selectHytte).getAttribute("class"));
       // driver.findElement(selectHytte).click();
    }

}
