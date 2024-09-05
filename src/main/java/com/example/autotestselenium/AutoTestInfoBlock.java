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
// * Осуществляем поиск информации и новостей клиники
// *
// * @Evgenia523
// * @version 1.0.0
// *
public class AutoTestInfoBlock {
    public static void main(String[] args) {
        // Устанавливаем путь к драйверу Chrome
        WebDriver driver = new ChromeDriver(); // Создаем новый экземпляр WebDriver для Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver.manage().window().maximize();   // Максимизируем окно браузера
        driver.get("https://32cdi.ru/"); // Открываем главную страницу сайта

        WebElement block =
                driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul[1]/li[7]/a"));
        block.click(); //находит в меню кнопка "Блог" и открывает страницу Блог

        WebElement news =
                driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[1]/div[1]/ul/li[12]/a"));
        news.click(); //находит в подменю "Новости клиники" и открывает страницу с новостями клиники


    }

}
