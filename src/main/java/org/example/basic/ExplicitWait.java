package org.example.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public void explicitwait() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//Sree"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//Sree")));
        driver.quit();

    }

    public static void main(String[] args) {
        ExplicitWait explicitWait=new ExplicitWait();
        explicitWait.explicitwait();
    }
}
