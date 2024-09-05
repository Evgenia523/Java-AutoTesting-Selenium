package com.example.autotestselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
       ______     __
      / ____/__  / /__  ____  (_)_  ______ ___
      \__ \/ _ \/ / _ \/ __ \/ / / / / __ `__ \
    ___/ /  __/ /  __/ / / / / /_/ / / / / / /
    /____/\___/_/\___/_/ /_/_/\__,_/_/ /_/ /_/
    ------------------------------------------

 */
//**
// * Класс представляет собой автотест функциональности веб-страницы.
// * Осуществляем поиск необходимой информации в строке поиска
// *
// * @Evgenia523
// * @version 1.0.0
// *
public class AutoTestSearch {
    public static void main(String[] args) throws InterruptedException {
        // Устанавливаем путь к драйверу Chrome
        WebDriver driver = new ChromeDriver(); // Создаем новый экземпляр WebDriver для Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver.manage().window().maximize();   // Максимизируем окно браузера
        driver.get("https://32cdi.ru/"); // Открываем главную страницу сайта

        WebElement search =
                driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul[3]/li/form/input"));
        search.click(); //находит строку поиска
        Thread.sleep(2000);

        WebElement searchtext =
                driver.findElements(By.xpath("/html/body/div[3]/div[3]/ul[3]/li/form/input")).get(0);
        searchtext.sendKeys("Профессиональная чистка зубов"); //набираем необходимый запрос
        searchtext.submit(); //осушествляем пойск, открывается информация по запрсу
    }
}
