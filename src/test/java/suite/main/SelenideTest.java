package suite.main;

import Page.ChapterPage;
import Page.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class SelenideTest {

    private String expectedText = "Assert that this text is on the page";

    @Test
    public void testFeature() {

        HomePage homePage = new HomePage();
        homePage.openHomePage();
        ChapterPage chapter1Page = homePage.navigate();
        assertTrue(chapter1Page.getPageSource().contains(expectedText));
        chapter1Page.navigateToHomePage();

    }
}
