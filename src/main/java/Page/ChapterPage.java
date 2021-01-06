package Page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ChapterPage {

    private SelenideElement homePageLinkField = $(byCssSelector("body > div.mainbody > p:nth-child(4) > a"));


    public void checkPageHasText(String expectedText) throws Exception {
        if(!getWebDriver().getPageSource().contains(expectedText))
        {
            throw new Exception("Text Not Found");
        }
    }


    public HomePage searchAndRedirectToHomePage() {
        homePageLinkField.click();
        return Selenide.page(HomePage.class);
    }


}
