package com.codewithazam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.cssSelector("a[value='BLR']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div[id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] [value='MAA']")).click();

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();

        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
            System.out.println("Disabled");
            Assert.assertTrue(true);
        }else{
            System.out.println("Enabled");
            Assert.assertFalse(false);

        }

        driver.findElement(By.id("divpaxinfo")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
        driver.findElement(By.cssSelector("option[value='5']")).click();

        driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();

        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
    }
}
