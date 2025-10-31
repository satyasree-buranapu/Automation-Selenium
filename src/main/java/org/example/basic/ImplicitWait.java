package org.example.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public void implicitwait(){

        WebDriver driver=new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//satya"));
        driver.quit();

    }

    public static void main(String[] args) {
        ImplicitWait implicitWait=new ImplicitWait();
        implicitWait.implicitwait();
    }
}
