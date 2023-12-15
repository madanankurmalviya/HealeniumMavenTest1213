package com.epam.healenium.tests;
import com.epam.healenium.FrameworkPage;
import com.epam.healenium.constants.BrowserType;
import com.epam.healenium.constants.DriverType;
import com.epam.healenium.constants.PagesType;
import com.epam.healenium.settings.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.util.HashMap;
public class AmazonTest {
    static protected WebDriver driver;
    public static void main(String[] args) throws MalformedURLException {

        driver = new DriverContext(DriverType.LOCAL).getDriver(BrowserType.CHROME);
        driver.manage().window().setSize(new Dimension(1200, 800));
        driver.get("https://www.amazon.com");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple Magic Keyboard");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.quit();

    }
}