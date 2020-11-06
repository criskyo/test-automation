package seleniumgluecode;

import org.openqa.selenium.chrome.ChromeDriver;
import pom.HomePage;

public class TestBase {

    private ChromeDriver driver = Hooks.getDriver();
    protected HomePage homePage = new HomePage();

}
