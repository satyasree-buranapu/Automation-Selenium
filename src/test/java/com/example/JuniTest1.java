package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JuniTest1 {
    static WebDriver driver;

    @BeforeAll
    public static void before1(){
        driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
    }
    @Test
    public void test1(){
        WebElement firstname= driver.findElement(By.xpath("//form/div/div[1]/input[@id='first-name']"));
        firstname.sendKeys("Satya");
        Assertions.assertEquals(firstname.getAttribute("value"),"Satya");
    }
    @Test
    public void test2(){
        WebElement highschool= driver.findElement(By.xpath("//form/div/div[4]/div[2]/input[@id='radio-button-1']"));
        highschool.click();

        WebElement college= driver.findElement(By.xpath("//form/div/div[4]/div[3]/input[@id='radio-button-2']"));
        //college.click();

        WebElement gradschool= driver.findElement(By.xpath("//form/div/div[4]/div[4]/input[@id='radio-button-3']"));
        //gradschool.click();

        Assertions.assertTrue(highschool.isSelected());
        Assertions.assertFalse(college.isSelected());
        Assertions.assertFalse(gradschool.isSelected());
    }
    @Test
    public void test3(){
        WebElement male=driver.findElement(By.xpath("//form/div/div[5]/div[2]/input[@id='checkbox-1']"));
        male.click();

        WebElement female=driver.findElement(By.xpath("//form/div/div[5]/div[3]/input[@id='checkbox-2']"));
        //female.click();

        WebElement prefernottosay=driver.findElement(By.xpath("//form/div/div[5]/div[4]/input[@id='checkbox-3']"));
       // prefernottosay.click();

        Assertions.assertTrue(male.isSelected());
        Assertions.assertFalse(female.isSelected());
        Assertions.assertFalse(prefernottosay.isSelected());
    }

    @AfterAll
    public static void after1(){
        driver.quit();
    }

}
