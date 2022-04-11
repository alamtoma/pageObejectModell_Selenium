package no.hiof.fatema.framework.PageComponent;

import no.hiof.fatema.framework.AbstractComponents.AbstractComponentFinn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BokingHotell extends AbstractComponentFinn {
    WebDriver driver;
    By sectionElementHotel = By.id("nav");
    By selectHytte = By.cssSelector(".active");

    public BokingHotell(WebDriver driver, By sectionElementHotel) {
        super(driver, sectionElementHotel);
    }

    public void getHotelAttribute() {
        System.out.println(findElement(selectHytte).getAttribute("class"));
    }
}