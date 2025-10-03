package org.example.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDynamic {
    public void dynamicxpath(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://seleniumbase.io/demo_page");

        //Using AND
        WebElement element= driver.findElement(By.xpath("//table/tbody/tr[9]/td[2]/input[@type='checkbox' and @id='checkBox3']"));
        element.click();

        //Using OR
        WebElement element1= driver.findElement(By.xpath("//table/tbody/tr[8]/td[4]/input[@type='radio' or @id='radioButton2']"));
        element1.click();

        //Using Contains
        WebElement element2= driver.findElement(By.xpath("//button[contains(@id,'myButton')]"));
        element2.click();

        WebElement element3= driver.findElement(By.xpath("//button[contains(text(),'Click Me (Purple)')]"));
        element3.click();

        //Using starts-with
        WebElement element4= driver.findElement(By.xpath("//textarea[starts-with(@id,'myTextarea')]"));
        element4.sendKeys("Satya");

        //Using text()---->Result in Console
        WebElement element5= driver.findElement(By.xpath("//td[text()='Textarea:']"));
        element5.getText();
        String a=element5.getText();
        System.out.println(a);

    }

    public static void main(String[] args) {
        XpathDynamic dynamicXpath=new XpathDynamic();
        dynamicXpath.dynamicxpath();
    }
}
