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
// * Осуществляем поиск адресов клиники и контактную информацию
// *
// * @Evgenia523
// * @version 1.0.0
// *
public class AutoTestSearchAdress {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); // Создаем новый экземпляр WebDriver для Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver.manage().window().maximize();   // Максимизируем окно браузера
        driver.get("https://32cdi.ru/"); // Открываем главную страницу сайта

        WebElement changevercion =
                driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/p[3]/a"));
        changevercion.click(); //находит кнопку "Как добраться" в шапке страницы и кликает на нее.
        // Открывается страница с адресами клиник и контактной информацией
    }
}
