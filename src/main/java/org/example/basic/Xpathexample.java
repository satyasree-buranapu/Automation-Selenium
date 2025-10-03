package org.example.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathexample {
    public void xpathexample(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://seleniumbase.io/demo_page");

        //1.Absolute xpath eg:SeleniumBase
        WebElement a=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/h2"));
        System.out.println(a.getText());
        driver.quit();

        //Relative Xpath eg:SeleniumBase
        WebElement b= driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/h2"));
        System.out.println(b.getText());
        driver.quit();

        //2.Absolute xpath eg:Automation Practice
        WebElement c= driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[4]/h3"));
        System.out.println(c.getText());
        driver.quit();

        //Relative Xpath eg:Automation Practice
        WebElement d=driver.findElement(By.xpath("//form/table/tbody/tr[1]/td[4]/h3"));
        System.out.println(d.getText());
        driver.quit();

    }
    public static void main(String[] args) {
        Xpathexample xpathexample=new Xpathexample();
        xpathexample.xpathexample();
    }
}
