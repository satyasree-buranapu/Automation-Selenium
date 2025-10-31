package org.example.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Fluentwait {
    public void fluentWait() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");

        Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//Satya")));
        driver.quit();

    }

    public static void main(String[] args) {
        Fluentwait fluentWait=new Fluentwait();
        fluentWait.fluentWait();
    }
}
