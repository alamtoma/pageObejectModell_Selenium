package no.hiof.fatema.framework;


import no.hiof.fatema.framework.PageObjects.MainObjecSerching;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FinnTest {
    @Test
    public void testForHytteBooking(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fatema Alam\\OneDrive\\Desktop\\SeleniumMappe\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();

        MainObjecSerching mainObjecSerching = new MainObjecSerching(driver);
        mainObjecSerching.goTo();
        mainObjecSerching.getBestilleHytte().getFlightAttribute();
        mainObjecSerching.getCheakHotel().getHotelAttribute();
    }


}