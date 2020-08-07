import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.ContactUS;
import utills.UseCaseBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactUsTest extends UseCaseBase{
    private static ContactUS contactUS;
    public static final Logger logger = LogManager.getLogger(ContactUsTest.class);

    @BeforeAll
    public static void classContactUsSetup() {
        contactUS = new ContactUS();
        contactUS.navigateToContactUsPage();
    }
    @Test
    public void contactUSPageOpenedTest() {
        logger.info("Contact US Page Opened Test");
        contactUS.navigateToContactUsPage();
        String expectedResult = "https://www.newsru.co.il/info/feedback/form.html";
        String actualResult = contactUS.contactUsOpened();
       contactUS.takeScreenshot("AutoPageSanityTest");
        assertEquals(expectedResult, actualResult);
    }

}
