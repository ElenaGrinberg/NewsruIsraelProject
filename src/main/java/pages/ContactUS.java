package pages;
import static constants.Constant.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ContactUS extends BasePage{
    private static final Logger logger = LogManager.getLogger(ContactUS.class);

    public void navigateToContactUsPage() {
        navigateToPageByURL(CONTACT_US_URL);
    }

    public String contactUsOpened() {
        String linkSite = pageIsOpen();
        return linkSite;
    }
}
