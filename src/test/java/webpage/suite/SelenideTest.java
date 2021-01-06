package webpage.suite;

import Page.ChapterPage;
import Page.HomePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;


public class SelenideTest {


    String expectedText = "Assert that this text is on the page";

    @BeforeTest
    public void setUp() throws IOException {

    }

    @Test
    public void testFeature() throws Exception {

        HomePage homePage = new HomePage();
        homePage.openHomePage();

        ChapterPage chapter1Page = homePage.searchAndRedirect();

        chapter1Page.checkPageHasText(expectedText);

        chapter1Page.searchAndRedirectToHomePage();



    }
}
