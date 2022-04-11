package no.hiof.fatema.framework.PageObjects;
import no.hiof.fatema.framework.PageComponent.BestilleHytte;
import no.hiof.fatema.framework.PageComponent.BokingHotell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainObjecSerching {
    By sectionElement = By.tagName("body");
    By hotelBoockingElement = By.id("nav");

    WebDriver driver;
    public MainObjecSerching(WebDriver driver) {
        this.driver= driver;

    }
    public void goTo(){
        driver.get("https://www.tripsinsider.com/");
        WebDriver driver = new ChromeDriver();
    }
    public BokingHotell getCheakHotel(){
        return new BokingHotell(driver,hotelBoockingElement);
    }
    public BestilleHytte getBestilleHytte(){
        return new BestilleHytte(driver,sectionElement);
    }
}

