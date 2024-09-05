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
// * Осуществляем поиск врачей-ортопедов
// *
// * @Evgenia523
// * @version 1.0.0
// *

public class AutoTestDoctor {
    public static void main(String[] args) {
        // Устанавливаем путь к драйверу Chrome
        WebDriver driver = new ChromeDriver(); // Создаем новый экземпляр WebDriver для Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver.manage().window().maximize();   // Максимизируем окно браузера
        driver.get("https://32cdi.ru/"); // Открываем главную страницу сайта

        WebElement doctor =
                driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul[1]/li[2]/a"));
        doctor.click(); //находит в меню кнопка "Врачи" и открывает страницу с врачами клиники

        WebElement ortoped =
                driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/span[3]"));
        ortoped.click(); //находит в меню закладку с врачами ортопедами и показывает с данными врачами ортопедами
    }
}
