import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.BasePage;
import pages.MainPage;
import utills.UseCaseBase;
import static constants.Constant.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class SanityTests extends UseCaseBase {
    private static MainPage mainPage;
    public static final Logger logger = LogManager.getLogger(SanityTests.class);

    @BeforeAll
    public static void ClassSetup() {
        mainPage = new MainPage();
        mainPage.navigateToMainPage();
    }


    @Test
    public void mainPageOpenedTest() {
        mainPage.navigateToMainPage();
        String expectedResult = "https://www.newsru.co.il/";
        String actualResult = mainPage.MainPageIsOpen();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void allNewsPageOpenedTest() {
        logger.info("Sanity test All News page");
        mainPage.navigateToAllNewsPage();
        String actualResult = mainPage.PageIsOpen();
        String expectedResult = "https://www.newsru.co.il/allnews/";
        assertEquals(expectedResult, actualResult);
    }


    @ParameterizedTest
    @ValueSource(strings = {LOGO_SITE_XPATH, TOPIC_NAME, LAST_UPDATE, DATE_TOP_XPATH, TIME_CLOCK, SEACH_TOOL, CLOCK_IMG,
            LAST_UPDATE_PATH, BASEMENT_PATH})
    public void sanityTestOfAllNewsPages(String xpath) {
        logger.info("Sanity param test All News page");
        mainPage.navigateToAllNewsPage();
        mainPage.waitPresenceOfVisibility(xpath);
        mainPage.moveCursorToElement(ALL_NEWS_URL,xpath);
        Boolean success = mainPage.sanityElementsExists(xpath);
        mainPage.takeScreenshot("ALLNewsPageSanityTest "+xpath);
        assertTrue(success);


    }

    @Test
    public void inIsraelPageIsOpened() {
        logger.info("Sanity test In Israel page");
        mainPage.navigateToIsraelPage();
        String actualResult = mainPage.PageIsOpen();
        String expectedResult = "https://www.newsru.co.il/israel/";
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {LOGO_SITE_XPATH, TOPIC_NAME, LAST_UPDATE, DATE_TOP_XPATH, TIME_CLOCK, SEACH_TOOL, CLOCK_IMG,
            LAST_UPDATE_PATH, BASEMENT_PATH})
    public void sanityTestIsraelPages(String xpath) {
        logger.info("Sanity param test In Israel page");
        mainPage.navigateToIsraelPage();
        mainPage.waitPresenceOfVisibility(xpath);
        mainPage.moveCursorToElement(IN_ISRAEL_URL,xpath);
        Boolean success = mainPage.sanityElementsExists(xpath);
        mainPage.takeScreenshot("IsraelPageSanityTest " +xpath);
        assertTrue(success);
    }

    @Test
    public void healthPageIsOpened() {
        logger.info("Sanity test Health Pages");
        mainPage.navigateToHealthPage();
        String actualResult = mainPage.PageIsOpen();
        String expectedResult = "https://www.newsru.co.il/health/";
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {LOGO_SITE_XPATH, TOPIC_NAME, LAST_UPDATE, DATE_TOP_XPATH, TIME_CLOCK, SEACH_TOOL, CLOCK_IMG,
            LAST_UPDATE_PATH, BASEMENT_PATH})
    public void sanityTestHealthPages(String xpath) {
        logger.info("Sanity param test Health Pages");
        mainPage.navigateToHealthPage();
        mainPage.waitPresenceOfVisibility(xpath);
        mainPage.moveCursorToElement(HEALTH_URL,xpath);
        Boolean success = mainPage.sanityElementsExists(xpath);
        mainPage.takeScreenshot("HealthPagesSanityTest"+xpath);
        assertTrue(success);
    }
    @Test
    public void mideastPageIsOpened() {
        logger.info("Sanity test Mideast Pages");
        mainPage.navigateToMideastPage();
        String actualResult = mainPage.PageIsOpen();
        String expectedResult = "https://www.newsru.co.il/mideast/";
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {LOGO_SITE_XPATH, TOPIC_NAME, LAST_UPDATE, DATE_TOP_XPATH, TIME_CLOCK, SEACH_TOOL, CLOCK_IMG,
            LAST_UPDATE_PATH, BASEMENT_PATH})
    public void sanityTestMideastPages(String xpath) {
        logger.info("Sanity param test Mideast Pages");
        mainPage.navigateToMideastPage();
        mainPage.waitPresenceOfVisibility(xpath);
        mainPage.moveCursorToElement(MIDDLE_EAST_URL,xpath);
        Boolean success = mainPage.sanityElementsExists(xpath);
        mainPage.takeScreenshot("MideastPagesSanityTest "+ xpath);
        assertTrue(success);
    }

    @Test
    public void worldPageIsOpened() {
        logger.info("Sanity test World news Page");
        mainPage.navigateToWorldPage();
        String actualResult = mainPage.PageIsOpen();
        String expectedResult = "https://www.newsru.co.il/world/";
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {LOGO_SITE_XPATH, TOPIC_NAME, LAST_UPDATE, DATE_TOP_XPATH, TIME_CLOCK, SEACH_TOOL, CLOCK_IMG,
            LAST_UPDATE_PATH, BASEMENT_PATH})
    public void sanityTestWorldPage(String xpath) {
        logger.info("Sanity param test World news Page");
        mainPage.navigateToWorldPage();
        mainPage.waitPresenceOfVisibility(xpath);
        mainPage.moveCursorToElement(WORLD_URL,xpath);
        Boolean success = mainPage.sanityElementsExists(xpath);
        mainPage.takeScreenshot("WorldPageSanityTest"+xpath);
        assertTrue(success);
    }

    @Test
    public void financePageIsOpened() {
        logger.info("Sanity test Finance Page");
        mainPage.navigateToFinancePage();
        String actualResult = mainPage.PageIsOpen();
        String expectedResult = "https://www.newsru.co.il/finance/";
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {LOGO_SITE_XPATH, TOPIC_NAME, LAST_UPDATE, DATE_TOP_XPATH, TIME_CLOCK, SEACH_TOOL, CLOCK_IMG,
            LAST_UPDATE_PATH, BASEMENT_PATH})
    public void sanityTestFinancePage(String xpath) {
        logger.info("Sanity param test Finance Page");
        mainPage.navigateToFinancePage();
        mainPage.waitPresenceOfVisibility(xpath);
        mainPage.moveCursorToElement(FINANCE_URL,xpath);
        Boolean success = mainPage.sanityElementsExists(xpath);
        mainPage.takeScreenshot("FinancePageSanityTest"+xpath);
        assertTrue(success);
    }

    @Test
    public void realtyPageIsOpened() {
        logger.info("Sanity test Realty Page");
        mainPage.navigateToRealtyPage();
        String actualResult = mainPage.PageIsOpen();
        String expectedResult = "https://www.newsru.co.il/realty/";
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {LOGO_SITE_XPATH, TOPIC_NAME, LAST_UPDATE, DATE_TOP_XPATH, TIME_CLOCK, SEACH_TOOL, CLOCK_IMG,
            LAST_UPDATE_PATH, BASEMENT_PATH})
    public void sanityTestRealtyPage(String xpath) {
        logger.info("Sanity param test Realty Page");
        mainPage.navigateToRealtyPage();
        mainPage.waitPresenceOfVisibility(xpath);
        mainPage.moveCursorToElement(REALTY_URL,xpath);
        Boolean success = mainPage.sanityElementsExists(xpath);
        mainPage.takeScreenshot("RealtyPageSanityTest"+xpath);
        assertTrue(success);
    }

    @Test
    public void autoPageIsOpened() {
        logger.info("Sanity test Auto Page");
        mainPage.navigateToAutoPage();
        String actualResult = mainPage.PageIsOpen();
        String expectedResult = "https://www.newsru.co.il/auto/";
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {LOGO_SITE_XPATH, TOPIC_NAME, LAST_UPDATE, DATE_TOP_XPATH, TIME_CLOCK, SEACH_TOOL, CLOCK_IMG,
            LAST_UPDATE_PATH, BASEMENT_PATH})
    public void sanityTestAutoPage(String xpath) {
        logger.info("Sanity param test Auto Page");
        mainPage.navigateToAutoPage();
        mainPage.waitPresenceOfVisibility(xpath);
        mainPage.moveCursorToElement(AUTO_URL,xpath);
        Boolean success = mainPage.sanityElementsExists(xpath);
        mainPage.takeScreenshot("AutoPageSanityTest"+xpath);
        assertTrue(success);
    }

    @Test
    public void sportPageIsOpened() {
        logger.info("Sanity test SPORT News page");
        mainPage.navigateToSportPage();
        String actualResult = mainPage.PageIsOpen();
        String expectedResult = "https://www.newsru.co.il/sport/";
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {LOGO_SITE_XPATH, TOPIC_NAME, LAST_UPDATE, DATE_TOP_XPATH, TIME_CLOCK, SEACH_TOOL, CLOCK_IMG,
            LAST_UPDATE_PATH, BASEMENT_PATH})
    public void sanityTestSportPage(String xpath) {
        logger.info("Sanity PARAM test SPORT News page");
        mainPage.navigateToSportPage();
        mainPage.waitPresenceOfVisibility(xpath);
        mainPage.moveCursorToElement(SPORT_URL,xpath);
        Boolean success = mainPage.sanityElementsExists(xpath);
        mainPage.takeScreenshot("AutoPageSanityTest"+xpath);
        assertTrue(success);
    }

    @Test
    public void restPageIsOpened() {
        logger.info("Sanity test Rest News page");
        mainPage.navigateToRestPage();
        String actualResult = mainPage.PageIsOpen();
        String expectedResult = "https://www.newsru.co.il/rest/";
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {LOGO_SITE_XPATH, TOPIC_NAME, LAST_UPDATE, DATE_TOP_XPATH, TIME_CLOCK, SEACH_TOOL, CLOCK_IMG,
            LAST_UPDATE_PATH, BASEMENT_PATH})
    public void sanityTestRestPage(String xpath) {
        logger.info("Sanity PARAM test Rest News page");
        mainPage.navigateToRestPage();
        mainPage.waitPresenceOfVisibility(xpath);
        mainPage.moveCursorToElement(REST_URL,xpath);
        Boolean success = mainPage.sanityElementsExists(xpath);
        mainPage.takeScreenshot("RestPageSanityTest"+xpath);
        assertTrue(success);
    }

    @Test
    public void pressPageIsOpened() {
        logger.info("Sanity test Press News page");
        mainPage.navigateToPressPage();
        String actualResult = mainPage.PageIsOpen();
        String expectedResult = "https://www.newsru.co.il/press/";
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {LOGO_SITE_XPATH, TOPIC_NAME, LAST_UPDATE, DATE_TOP_XPATH, TIME_CLOCK, SEACH_TOOL, CLOCK_IMG,
            LAST_UPDATE_PATH, BASEMENT_PATH})
    public void sanityTestPressPage(String xpath) {
        logger.info("Sanity param test Press News page");
        mainPage.navigateToPressPage();
        mainPage.waitPresenceOfVisibility(xpath);
        mainPage.moveCursorToElement(PRESS_URL,xpath);
        Boolean success = mainPage.sanityElementsExists(xpath);
        mainPage.takeScreenshot("PressSanityTest"+xpath);
        assertTrue(success);
    }
    @Test
    public void photoPageIsOpened() {
        logger.info("Sanity test Photo page");
        mainPage.navigateToPhotoPage();
        String actualResult = mainPage.PageIsOpen();
        String expectedResult = "https://www.newsru.co.il/photo/";
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {LOGO_SITE_XPATH, TOPIC_NAME, LAST_UPDATE, DATE_TOP_XPATH, TIME_CLOCK, SEACH_TOOL, CLOCK_IMG,
            LAST_UPDATE_PATH, BASEMENT_PATH})
    public void sanityTestPhotoPage(String xpath) {
        logger.info("Sanity param test Photo page");
        mainPage.navigateToPhotoPage();
        mainPage.waitPresenceOfVisibility(xpath);
        mainPage.moveCursorToElement(PHOTO_URL,xpath);
        Boolean success = mainPage.sanityElementsExists(xpath);
        mainPage.takeScreenshot("PhotoSanityTest"+xpath);
        assertTrue(success);
    }
    @Test
    public void archivePageIsOpened() {
        logger.info("Sanity test Archive page");
        mainPage.navigateToArchivePage();
        String actualResult = mainPage.PageIsOpen();
        String expectedResult = "https://www.newsru.co.il/arch/";
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {LOGO_SITE_XPATH, LAST_UPDATE, DATE_TOP_XPATH, TIME_CLOCK, SEACH_TOOL, CLOCK_IMG,
            LAST_UPDATE_PATH, BASEMENT_PATH})
    public void sanityTestArchivePage(String xpath) {
        logger.info("Sanity param test Archive page");
        mainPage.navigateToArchivePage();
        mainPage.waitPresenceOfVisibility(xpath);
        mainPage.moveCursorToElement(ARCHIVE_URL,xpath);
        Boolean success = mainPage.sanityElementsExists(xpath);
        mainPage.takeScreenshot("ArchiveSanityTest"+xpath);
        assertTrue(success);
    }



}
