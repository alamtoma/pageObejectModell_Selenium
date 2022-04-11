package no.hiof.fatema.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
    @Test
    public void chekingaFlyBillet() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fatema Alam\\OneDrive\\Desktop\\SeleniumMappe\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://finn.no");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#frontpage-content > main > div.fp-market-grid.pb-8 > div > nav > div:nth-child(6) > a > span")).click();
        driver.findElement(By.cssSelector("#tabs--1--tab--1")).click();
        driver.findElement(By.id("origin-oneway")).sendKeys("Oslo");
        driver.findElement(By.id("destination-oneway")).sendKeys("Bergen");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/input[1]")).click();
        Thread.sleep(2000);

        String month ="March 2022";
        String day ="20";
        while(true)
        {
           String text = driver.findElement(By.id("date-picker-date")).getText();
            if(text.equals(month)){
                break;
            }
            else {
                driver.findElement
                        (By.id("date-picker-date"));

            }
        }
        driver.findElement(By.xpath("")).click();

       // driver.findElement(By.id("flightPassengersOnewayDropdownDisplayText")).sendKeys("1 voksen, Økonomi");
      //  driver.findElement(By.cssSelector("div[id='tabs--1--panel--1'] div[class='travel-grid travel-grid--flight']")).click();


    }
}