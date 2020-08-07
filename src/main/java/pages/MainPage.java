package pages;
import static constants.Constant.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainPage extends BasePage {
    private static final Logger logger = LogManager.getLogger(MainPage.class);
    //Открытие страниц рубрик

    public void navigateToMainPage() {
        navigateToPageByURL(MAIN_URL);
    }
    public String MainPageIsOpen() {
        String textUrl = pageIsOpen();
        return textUrl;
    }
    public void navigateToAllNewsPage() {
        navigateToPageByURL(ALL_NEWS_URL);
    }
    public void navigateToIsraelPage() {
        navigateToPageByURL(IN_ISRAEL_URL);
    }
    public void navigateToHealthPage() {
        navigateToPageByURL(HEALTH_URL);
    }
    public void navigateToMideastPage() {
        navigateToPageByURL(MIDDLE_EAST_URL);
    }
    public void navigateToWorldPage() {
        navigateToPageByURL(WORLD_URL);
    }
    public void navigateToFinancePage() {
        navigateToPageByURL(FINANCE_URL);
    }
    public void navigateToRealtyPage() {
        navigateToPageByURL(REALTY_URL);
            }
    public void navigateToAutoPage() {
        navigateToPageByURL(AUTO_URL);
    }
    public void navigateToSportPage() {
        navigateToPageByURL(SPORT_URL);
    }
    public void navigateToRestPage() {
        navigateToPageByURL(REST_URL);
    }
    public void navigateToPressPage() {
        navigateToPageByURL(PRESS_URL);
    }
    public void navigateToPhotoPage() {
        navigateToPageByURL(PHOTO_URL);
    }
    public void navigateToArchivePage() {
        navigateToPageByURL(ARCHIVE_URL);
    }

    //инструменты
    public String PageIsOpen() {
        String textUrl = pageIsOpen();
        return textUrl;
    }


    public boolean sanityElementsExists(String xpath) {
        Boolean isVisible = elementExists(xpath);
        return isVisible;
    }



}

