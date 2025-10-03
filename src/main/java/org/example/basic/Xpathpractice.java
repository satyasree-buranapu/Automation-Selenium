package org.example.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpractice {
    public void xpathpractice(){
        //Practice form-1
        WebDriver driver=new ChromeDriver();
//        driver.get("https://seleniumbase.io/demo_page");

//        //parent
//        WebElement webElement= driver.findElement(By.xpath("//input[@id='checkBox1']/parent::td"));
//        webElement.getText();
//        String a=webElement.getText();
//        System.out.println(a);
//
//        //child
//        WebElement webElement1= driver.findElement(By.xpath("//tbody/tr[9]/td[2]/child::input"));
//        webElement1.click();
//
//        //Ancestor
//        WebElement webElement2= driver.findElement(By.xpath("//input[@id='[checkBox2']/ancestor::tbody"));
//        webElement2.getText();
//        String b=webElement2.getText();
//        System.out.println(b);
//
//        //descendant
//        WebElement webElement3= driver.findElement(By.xpath("//form[@id='myTable']/descendant::tbody"));
//        webElement3.getText();
//        String c=webElement3.getText();
//        System.out.println(c);
//
//        //following-sibling
//        WebElement webElement4= driver.findElement(By.xpath("//input[@id='checkBox3']/following-sibling::input"));
//        webElement4.click();
//
//        //preceding
//        WebElement webElement5= driver.findElement(By.xpath("//input[@id='checkBox2']/preceding-sibling::input"));
//        webElement5.click();


        //Practice form-2

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement firstname= driver.findElement(By.xpath("//form/div/div[1]/input[@id='first-name']"));
        firstname.sendKeys("Satya");

        WebElement lastname= driver.findElement(By.xpath("//form/div/div[2]/input[@id='last-name']"));
        lastname.sendKeys("Sree");

        WebElement jobtitle= driver.findElement(By.xpath("//form/div/div[3]/input[@id='job-title']"));
        jobtitle.sendKeys("Software Engineer");

        WebElement highschool= driver.findElement(By.xpath("//form/div/div[4]/div[2]/input[@id='radio-button-1']"));
        highschool.click();

        WebElement college= driver.findElement(By.xpath("//form/div/div[4]/div[3]/input[@id='radio-button-2']"));
        college.click();

        WebElement gradschool= driver.findElement(By.xpath("//form/div/div[4]/div[4]/input[@id='radio-button-3']"));
        gradschool.click();

        WebElement male=driver.findElement(By.xpath("//form/div/div[5]/div[2]/input[@id='checkbox-1']"));
        male.click();

        WebElement female=driver.findElement(By.xpath("//form/div/div[5]/div[3]/input[@id='checkbox-2']"));
        female.click();

        WebElement prefernottosay=driver.findElement(By.xpath("//form/div/div[5]/div[4]/input[@id='checkbox-3']"));
        prefernottosay.click();

        WebElement yearofexperience=driver.findElement(By.xpath("//form/div/div[6]/select[@id='select-menu']"));
        yearofexperience.sendKeys(Keys.ARROW_DOWN);
        yearofexperience.sendKeys(Keys.ARROW_DOWN);
        yearofexperience.sendKeys(Keys.ARROW_DOWN);

        WebElement submit=driver.findElement(By.xpath("//form/div/div[8]/a[@role='button']"));
        submit.click();

    }

    public static void main(String[] args) {
        Xpathpractice xpathpractice=new Xpathpractice();
        xpathpractice.xpathpractice();
    }
}
