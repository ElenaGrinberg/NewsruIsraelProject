import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.MainPage;
import pages.Sections;
import utills.UseCaseBase;

import static constants.Constant.*;
import static constants.Constant.ALL_NEWS_URL;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SectionsIsraelTest extends UseCaseBase {

    private static MainPage mainPage;
    public static final Logger logger = LogManager.getLogger(SanityTests.class);

    @BeforeAll
    public static void ClassSetup() {
        mainPage = new MainPage();
        mainPage.navigateToMainPage();
    }

    @ParameterizedTest
    @ValueSource(strings = {ISRAEL_SECTION, ISRAEL_SECTION_NEWS, FIRST_NEWS_ISRAEL_SECTION, NEWS_ISRAEL2_SECTION, NEWS_ISRAEL3_SECTION, NEWS_ISRAEL4_SECTION,
            NEWS_ISRAEL5_SECTION, NEWS_ISRAEL10_SECTION, NEWS_ISRAEL11_SECTION, NEWS_ISRAEL22_SECTION, NEWS_ISRAEL30_SECTION, NEWS_ISRAEL40_SECTION,
            NEWS_ISRAEL41_SECTION})
    public void listNewsSectionIsraelTest(String xpath) {
        logger.info("Param test list of news Israel section");
        //mainPage.navigateToMainPage();
        mainPage.waitPresenceOfVisibility(xpath);
        mainPage.moveCursorToElement(MAIN_URL, xpath);
        Boolean success = Sections.sanityElementsExists(xpath);
        mainPage.takeScreenshot("ParamTestListOfNewsIsraelSection " + xpath);
        assertTrue(success);
    }

        @Test
        public void compareTitleOfBignewsNEWS(){
        String expectedTitle = Sections.getTitleFromPath(BIGNEWS_ISR_SECTION);
        String actualTitle = Sections.getTitleFromPath(FIRST_NEWS_ISRAEL_SECTION);
        assertEquals(expectedTitle, actualTitle);

        }






    }

