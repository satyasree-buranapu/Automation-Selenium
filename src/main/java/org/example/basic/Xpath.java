package org.example.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public void xpath(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://seleniumbase.io/demo_page");

        //Absolute Xpath----starts from Parent.
        WebElement a=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[1]/h1"));
        System.out.println(a.getText());
        driver.quit();

        //Relative Xpath-----starts with middle of any child.
        WebElement b=driver.findElement(By.xpath("//form/table/tbody/tr[1]/td[1]/h1"));
        System.out.println(b.getText());
        driver.quit();
    }

    public static void main(String[] args) {
        Xpath xpath=new Xpath();
        xpath.xpath();
    }
}
