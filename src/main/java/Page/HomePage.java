package Page;

import Config.PropertiesConfig;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {


    public ChapterPage navigate() {
        $(By.linkText("Chapter1")).click();
        return Selenide.page(ChapterPage.class);
    }

    public void openHomePage() {
        open(PropertiesConfig.loadFile().getProperty("base.url"));
    }

}
