package com.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
  public static WebDriver driver;
  public static ExcelDataProvider excel; 
  public static ConfigDataProvider config;
  @BeforeSuite
  public void BS() throws Exception {
   excel=new ExcelDataProvider();
 config=new ConfigDataProvider();
  }  
  
  @BeforeMethod
   public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
   driver.get(config.getBaseUrl_QA1());
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
   
   
   }

   
   @AfterMethod
   public void tearDown() {
   driver.quit();
   
   } 
   
   
}
