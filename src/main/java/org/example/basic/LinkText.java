package org.example.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LinkText {
    public void linktext(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://seleniumbase.io/demo_page");

//        WebElement a=driver.findElement(By.linkText("seleniumbase.com"));
//        a.click();

       List<WebElement> b=driver.findElements(By.partialLinkText("seleniumbase"));
        b.forEach(webElement -> {
            webElement.getText();
            String c=webElement.getText();
            c.contains("io");
            boolean d=c.contains("io");
            if(d){
                webElement.click();
            }

        });

    }

    public static void main(String[] args) {
        LinkText linkText=new LinkText();
        linkText.linktext();
    }
}
