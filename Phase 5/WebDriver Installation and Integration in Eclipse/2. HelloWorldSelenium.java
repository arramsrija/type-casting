import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
publicclass HelloWorldSelenium {
publicstaticvoid main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver(); 
String baseUrl = "https://www.google.com";
driver.get(baseUrl);
//do some testing here
System.out.println("Title of the webpage " + driver.getTitle());
}
}
