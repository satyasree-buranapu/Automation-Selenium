package org.example.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTitleCheck {
    public void titlecheck(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/?zx=1758525266281&no_sw_cr=1");
       // driver.getTitle();
        String a=driver.getTitle();
        System.out.println(a);
        //driver.findElement(By.id("APjFqb"));
        WebElement b= driver.findElement(By.id("APjFqb"));
        CharSequence charSequence=new String("Satya");
        b.sendKeys(charSequence);
        b.sendKeys(Keys.ENTER);
    }

    public static void main(String[] args) {
        BasicTitleCheck basicTitleCheck=new BasicTitleCheck();
        basicTitleCheck.titlecheck();

    }
}
