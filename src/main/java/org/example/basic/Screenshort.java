package org.example.basic;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshort {
    public void screenshort() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");

        ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File Utilfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Utilfile, new File("screenshot.png"));
        driver.quit();

    }
    public static void main(String[] args) throws IOException {
        Screenshort screenshort=new Screenshort();
        screenshort.screenshort();
    }
}
