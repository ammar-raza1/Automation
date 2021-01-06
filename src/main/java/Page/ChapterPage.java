package Page;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ChapterPage {

    public String getPageSource() {
        return getWebDriver().getPageSource();
    }

    public HomePage navigateToHomePage() {
        $(By.linkText("Home Page")).click();
        return Selenide.page(HomePage.class);
    }

}
