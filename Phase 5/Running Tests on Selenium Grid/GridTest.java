packagecom.gridtest;
import org.openqa.selenium.Platform;
importorg.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL; // Import the URL class
publicclassGridTest {
publicstaticvoid main(String[] args) {
// TODO Auto-generated method stub
DesiredCapabilities cap = new DesiredCapabilities();
cap.setBrowserName("chrome");
cap.setPlatform(Platform.WIN11);
URL url = new URL("http://192.168.0.102:4444");
WebDriver driver = new RemoteWebDriver(url, cap);
driver.get("https://www.google.com"); // Correct the URL to "https://www.google.com" System.out.println("Google Title: " + driver.getTitle());
driver.close();
}
}
