package org.example.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesMethods {
    public void xpathaxcesmethods(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://seleniumbase.io/demo_page");

        //parent
        WebElement webElements = driver.findElement(By.xpath("//input[@id='checkBox2']/parent::td"));
        webElements.getText();
        String a=webElements.getText();
        System.out.println(a);

        //following-sibling
        WebElement webElements1= driver.findElement(By.xpath("//input[@id='checkBox3']/following-sibling::input"));
        webElements1.click();

        //child
        WebElement webElements2= driver.findElement(By.xpath("//tr[8]/td[4]/child::input"));
        webElements2.click();

        //Ancestor
        WebElement webElement3= driver.findElement(By.xpath("//tbody/tr[8]/td[3]/input[@id='radioButton1']/ancestor::tr"));
        webElement3.click();

        //Descendant
        WebElement webElement4= driver.findElement(By.xpath("//form/descendant::tbody"));
        webElement4.getText();
        String b=webElement4.getText();
        System.out.println(b);

        //preceeding
        WebElement webElement5= driver.findElement(By.xpath("//input[@id='checkBox3']/preceding-sibling::input"));
        webElement5.click();
    }

    public static void main(String[] args) {
        XpathAxesMethods xpathAxesMethods=new XpathAxesMethods();
        xpathAxesMethods.xpathaxcesmethods();
    }
}
