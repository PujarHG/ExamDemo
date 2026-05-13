package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDemo {
    @Test
    public  static void SeleTest() throws InterruptedException
    {
        WebDriver wd=new ChromeDriver();
        wd.get("https:\\mmec.edu.in");
        wd.manage().window().maximize();
        Thread.sleep(1000);
        wd.quit();
    }
}
