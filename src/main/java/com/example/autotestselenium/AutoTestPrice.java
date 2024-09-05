package com.example.autotestselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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
// * Изучаем цены клиники, отделение "Терапия"
// *
// * @Evgenia523
// * @version 1.0.0
// *
public class AutoTestPrice {
    public static void main(String[] args) {
        // Устанавливаем путь к драйверу Chrome
        WebDriver driver = new ChromeDriver(); // Создаем новый экземпляр WebDriver для Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver.manage().window().maximize();   // Максимизируем окно браузера
        driver.get("https://32cdi.ru/"); // Открываем главную страницу сайта

        WebElement price =
                driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul[1]/li[3]/a"));
        price.click(); //находит в меню кнопку "Цены"

         WebElement price1=
                 driver.findElement(By.xpath("/html/body/div[7]/div[1]/div/div[3]"));
        price1.click(); //находит и открывает закладку с ценами отделения "Терапия"


    }
}
