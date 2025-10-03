package org.example.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicTitleCheck2 {
    public void basictitle(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://automationintesting.com/selenium/testpage/");
        String a= driver.getTitle();
        System.out.println(a);

        WebElement b=driver.findElement(By.id("firstname"));
        CharSequence charSequence=new String("Satya");
        b.sendKeys(charSequence);

        WebElement c=driver.findElement(By.id("surname"));
        CharSequence charSequence1=new String("Buranapu");
        c.sendKeys(charSequence1);

        WebElement d=driver.findElement(By.id("gender"));
       d.sendKeys(Keys.ARROW_DOWN);
       d.sendKeys(Keys.ARROW_DOWN);

       WebElement e=driver.findElement(By.id("red"));
       e.click();

       WebElement f=driver.findElement(By.id("checkbox2"));
       f.click();

       WebElement g=driver.findElement(By.id("continent"));
        Select h=new Select(g);
        h.selectByValue("africa");

        WebElement i=driver.findElement(By.id("submitbutton"));
        i.click();



    }

    public static void main(String[] args) {
        BasicTitleCheck2 basicTitleCheck2=new BasicTitleCheck2();
        basicTitleCheck2.basictitle();
    }
}
