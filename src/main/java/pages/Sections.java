package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sections extends BasePage{

    private static final Logger logger = LogManager.getLogger(Sections.class);

    public static boolean sanityElementsExists(String xpath) {
        Boolean isVisible = elementExists(xpath);
        return isVisible;
    }

    public static String getTitleFromPath(String xpath){
       String title = getValueByXpath(xpath);
       return title;

    }

}
