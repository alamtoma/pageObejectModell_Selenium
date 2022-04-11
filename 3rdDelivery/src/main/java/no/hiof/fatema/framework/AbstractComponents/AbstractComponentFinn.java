package no.hiof.fatema.framework.AbstractComponents;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractComponentFinn {
    WebElement sectionElement;

    public AbstractComponentFinn(WebDriver driver, By sectionElement) {
        this.sectionElement =driver.findElement( sectionElement);
    }

    public WebElement findElement(By findElement){
        return sectionElement.findElement(findElement);
    }


}
