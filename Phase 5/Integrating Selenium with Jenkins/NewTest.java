package com.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
publicclass NewTest {
private WebDriver driver;
SoftAssert soft = new SoftAssert();
@Test
publicvoid testEasy() {
driver = new ChromeDriver();
driver.get("https://www.facebook.com");
String title = driver.getTitle();
soft.assertEquals("FB Login", title);
}
@BeforeTest
publicvoid beforeTest() {
driver = new ChromeDriver();
}
@AfterTest
publicvoid afterTest() {
driver.quit();
}
}
