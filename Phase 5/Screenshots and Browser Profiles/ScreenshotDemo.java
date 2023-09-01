package com.ecommerce.test;
import java.io.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
publicclass ScreenshotDemo {
publicstaticvoid main(String[] args) throws InterruptedException, IOException {
WebDriver driver = new ChromeDriver(); // new FirefoxDriver();
demoTakingScreenshot(driver);
driver.close();
}
staticvoid demoTakingScreenshot(WebDriver driver) throws InterruptedException, IOException {
String baseUrl = "File:///C:\\Users\\lenovo\\Phase5\\hello-selenium\\src\\main\\resources\\test.html";
driver.get(baseUrl);
TakesScreenshot scrShot = ((TakesScreenshot) driver);
File imgTmpFile = scrShot.getScreenshotAs(OutputType.FILE);
File destinationPath = new File("F:/tmp/myScreenshot.jpg");
Files.copy(imgTmpFile, destinationPath); 
}
}
