package org.example.Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class test2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://allureparfum.ru");

        WebElement webElement3 = driver.findElement(By.xpath("(//a[@role='button'])[2]"));

        try {
            WebElement webElementError = driver.findElement(By.name("error"));
        } catch (NoSuchElementException e){
            System.out.println(e.getSuppressed());
        }

        List<WebElement> webElements = driver.findElements(By.name("error"));
        if (webElements.size() > 1) {
        }

        webElement3.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement webElement4 = driver.findElement(By.xpath("(//input[@placeholder='Введите логин или e-mail'])[1]"));
        webElement4.sendKeys("mask15051995@mail.ru");
        WebElement webElement5 = driver.findElement(By.xpath("//input[@placeholder='Введите пароль']"));
        webElement5.sendKeys("Monkey");
        WebElement webElement6 = driver.findElement(By.xpath("//input[@name='Login']"));
        webElement6.click();
        driver.navigate().to("https://allureparfum.ru");
        WebElement webElement7 = driver.findElement(By.xpath("(//input[@placeholder='поиск товара'])[1]"));
        webElement7.click();
        webElement7.sendKeys("83820");
        WebElement webElement8 = driver.findElement(By.xpath("(//input[@value='найти'])[1]"));
        webElement8.click();
        WebElement webElement9 = driver.findElement(By.xpath("(//a[@class='sprite more'])[1]"));
        webElement9.click();
        WebElement webElement10 = driver.findElement(By.xpath("(//a[@rel='nofollow'][contains(text(),'Купить')])[1]"));
        webElement10.click();
        WebElement webElement11 = driver.findElement(By.xpath("(//a[@class='shopping-cart'])[1]"));
        webElement11.click();
        WebElement webElement12 = driver.findElement(By.xpath("(//i[@class='sprite_new del'])[1]"));
        webElement12.click();

        //driver.quit();
    }
}
