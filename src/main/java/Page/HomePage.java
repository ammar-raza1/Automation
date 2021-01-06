package Page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static Utils.Utils.BASE_URL;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    private SelenideElement chapter1Field = $(byCssSelector("body > div.mainbody > ul > li:nth-child(1) > a"));

    public ChapterPage searchAndRedirect() {
        chapter1Field.click();
        return Selenide.page(ChapterPage.class);
    }

    public void openHomePage(){
        open(BASE_URL);
    }

}
