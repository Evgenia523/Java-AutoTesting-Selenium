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
// * Осуществляем запись на консультацию
// *
// * @Evgenia523
// * @version 1.0.0
// *
public class AutoTestUserForm {
    public static void main(String[] args) throws InterruptedException {
        // Устанавливаем путь к драйверу Chrome
        WebDriver driver = new ChromeDriver(); // Создаем новый экземпляр WebDriver для Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver.manage().window().maximize();   // Максимизируем окно браузера
        driver.get("https://32cdi.ru/"); // Открываем главную страницу сайта

        WebElement searchField =
                driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div[2]/span"));
        searchField.click(); //находит кнопку "Записаться на консультацию" и кликает на нее

        WebElement first_name =
                driver.findElements(By.xpath("/html/body/div[25]/div/div[1]/div/div/div/form/span[1]/input")).get(0);
        first_name.sendKeys("Евгения"); //заполняет имя
        first_name.submit();
        Thread.sleep(3000);

        WebElement phone =
                driver.findElements(By.xpath("/html/body/div[25]/div/div[1]/div/div/div/form/span[2]/input")).get(0);
        phone.sendKeys("89271222294"); //заполняет номер телефона
        phone.submit();
        Thread.sleep(3000);

        WebElement email =
                driver.findElements(By.xpath("/html/body/div[25]/div/div[1]/div/div/div/form/span[3]/input")).get(0);
        email.sendKeys("evgenia523@mail.ru"); //заполняет электронный адрес
        email.submit();
        Thread.sleep(3000);

        WebElement comment =
                driver.findElements(By.xpath("/html/body/div[25]/div/div[1]/div/div/div/form/span[4]/textarea")).get(0);
        comment.sendKeys("Записаться на консультацию по установке брекетов"); //заполняет поле сообщение
        comment.submit();
        Thread.sleep(3000);

        WebElement acceptance =
                driver.findElements(By.xpath("/html/body/div[25]/div/div[1]/div/div/div/form/div[2]/div[1]/span/span/span/input")).get(0);
        acceptance.click(); //ставим галочку на согласие на обработку

        //нажимаем галочку "Я не робот", проходим предлагаемый тест и затем кнопку "Отправить"
    }
}
