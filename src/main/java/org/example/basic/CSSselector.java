package org.example.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
    public void cssselector(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://seleniumbase.io/demo_page");

        //By id
        WebElement a=driver.findElement(By.cssSelector("#myDropdown"));
        a.click();

        //By class
        WebElement b= driver.findElement(By.cssSelector(".checkBoxClassB"));
        b.click();

        //By attribute
        WebElement c= driver.findElement(By.cssSelector("[id=radioButton2]"));
        c.click();

        //By class and attribute---->css=tag.class[attribute=value]
        WebElement d= driver.findElement(By.cssSelector("input.checkBoxClassA[class=checkBoxClassA]"));
        d.click();
    }

    public static void main(String[] args) {
        CSSselector csSselector=new CSSselector();
        csSselector.cssselector();
    }
}
