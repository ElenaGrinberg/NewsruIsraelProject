package constants;

public class Constant {



        public static String VALUE_DOLL_XPATH = "//b[text()='$']";
        public static String VALUE_EURO_XPATH = "//b[text()='€']";

        //RUBRICS
        public static final String ALL_NEWS_XPATH = "//ul[@class='main-menu'] // a[text()='ВСЕ НОВОСТИ']";
        public static final String IN_ISRAEL_XPATH = "//ul[@class='main-menu'] // a[text()='В Израиле']";
        public static final String HEALTH_XPATH = "//ul[@class='main-menu'] // a[text()='Здоровье']";
        public static final String MIDDLE_EAST_XPATH = "//ul[@class='main-menu'] // a[text()='Ближний Восток']";
        public static final String WORLD_XPATH = "//ul[@class='main-menu'] // a[text()='В мире']";
        public static final String FINANCE_XPATH = "//ul[@class='main-menu'] // a[text()='Экономика']";
        public static final String REALTY_XPATH = "//ul[@class='main-menu'] // a[text()='Недвижимость']";
        public static final String AUTO_XPATH = "//ul[@class='main-menu'] // a[text()='Автомобили']";
        public static final String SPORT_XPATH = "//ul[@class='main-menu'] // a[text()='Спорт']";
        public static final String REST_XPATH = "//ul[@class='main-menu'] // a[text()='Досуг']";
        public static final String PRESS_XPATH = "//ul[@class='main-menu'] // a[text()='Пресса']";
        public static final String PHOTO_XPATH = "//ul[@class='main-menu'] // a[text()='Фоторепортажи']";
        public static final String EVENTS_XPATH = "//ul[@class='main-menu'] // a[text()='афиша']";
        public static final String BOARD_XPATH = "//ul[@class='main-menu'] // a[text()='доска']";
        public static final String ARCHIVE_XPATH = "//ul[@class='main-menu'] // a[text()='архив']";
        public static final String ARCHIVE2_XPATH = "//ul[@class='main-menu'] // a[text()='арibs']";


        //Разделы сайта
        //Israel section

        public static final String ISRAEL_SECTION ="(//div[@class='newslist'])[1]";
        public static final String ISRAEL_SECTION_NEWS = "(//div[@class='newslist'])[1]//a[@class='newslist_title']";
        public static final String FIRST_NEWS_ISRAEL_SECTION="(//div[@class='newslist']//a[@class ='newslist_title'])[1]";
        public static final String NEWS_ISRAEL2_SECTION="(//div[@class='newslist']//a[@class ='newslist_title'])[2]";
        public static final String NEWS_ISRAEL3_SECTION="(//div[@class='newslist']//a[@class ='newslist_title'])[3]";
        public static final String NEWS_ISRAEL4_SECTION="(//div[@class='newslist']//a[@class ='newslist_title'])[4]";
        public static final String NEWS_ISRAEL5_SECTION="(//div[@class='newslist']//a[@class ='newslist_title'])[5]";
        public static final String NEWS_ISRAEL10_SECTION="(//div[@class='newslist']//a[@class ='newslist_title'])[10]";
        public static final String NEWS_ISRAEL11_SECTION="(//div[@class='newslist']//a[@class ='newslist_title'])[11]";
        public static final String NEWS_ISRAEL22_SECTION="(//div[@class='newslist']//a[@class ='newslist_title'])[22]";
        public static final String NEWS_ISRAEL30_SECTION="(//div[@class='newslist']//a[@class ='newslist_title'])[30]";
        public static final String NEWS_ISRAEL40_SECTION="(//div[@class='newslist']//a[@class ='newslist_title'])[40]";
        public static final String NEWS_ISRAEL41_SECTION="(//div[@class='newslist']//a[@class ='newslist_title'])[41]";

        //ISRAEL BIG NEWS
        public static final String BIGNEWS_ISR_SECTION="(//div[@class='newsbig'])[1]//a[@class='title'][1]";

        //BOTTOM STRIP
        public static final String BOTTOM_OUTPUT_INFO = "//ul[@class='basement not-for-print']";
        public static final String BOTTOM_CURRENT_DATE = "//li[@class='current-date']";
        public static final String CONTACT_US = "//a[text()='Обратная связь']";
        public static final String TEAM_INFO = "//a[text()='Состав редакции']";
        public static final String RSS_LINK = "//a[@href='/info/rss/main.html']";
        public static final String NEWSRU_RUSSIA_LINK_PATCH = "//a[text()='самые быстрые новости из России и со всего мира.']";
        public static final String PRICE_LIST_PATCH = "//a[text()='Price List (MS Word file)']";
        public static final String COPY_RIGHTS = "(//li[text()])[24]";

        //Elements
        public static final String LOGO_SITE_XPATH = "//div[@class='logo'] // a[@title='Новости Израиля']";
        public static final String TOPIC_NAME = "//span[@class = 'topic-name']";
        public static final String LAST_UPDATE = "//a[@class='lastupdate']";
        public static final String DATE_TOP_XPATH = "//div[@class='date_wrap']//div[@class='date']";
        public static final String TIME_CLOCK = "//span[@class='time_clock']";
        public static final String CLOCK_IMG = "//div[@id='clock']";
        public static final String SEACH_TOOL = "//input[@type='text']";
        public static final String PLASHKA1_XPATH = "(//div[@class = 'plashka'])[1]";
        public static final String PLASHKA2_XPATH = "(//div[@class = 'plashka'])[2]";
        public static final String PLASHKA3_XPATH = "(//div[@class = 'plashka'])[3]";
        public static final String PLASHKA4_XPATH = "(//div[@class='plashka'])[4]";
        public static final String PLASHKA5_XPATH = "(//div[@class='plashka'])[4]";
        public static final String PLASHKA6_XPATH = "(//div[@class='plashka'])[6]";
        public static final String PLASHKA7_XPATH = "(//div[@class='plashka'])[7]";
        public static final String PLASHKA8_XPATH = "(//div[@class='plashka'])[8]";
        public static final String PLASHKA9_XPATH = "(//div[@class='plashka'])[9]";
        public static final String PLASHKA10_XPATH = "(//div[@class='plashka'])[10]";
        public static final String LAST_UPDATE_PATH = "//a[@class='lastupdate']";
        public static final String BASEMENT_PATH = "//ul[@class='basement not-for-print']";




        //URLs of Pages and Rubrics
        public static String MAIN_URL = "https://www.newsru.co.il";
        public static String ALL_NEWS_URL = "http://newsru.co.il/allnews/";
        public static String IN_ISRAEL_URL = "http://newsru.co.il/israel/";
        public static String HEALTH_URL = "http://newsru.co.il/health/";
        public static String MIDDLE_EAST_URL = "http://newsru.co.il/mideast/";
        public static String WORLD_URL = "http://newsru.co.il/world/";
        public static String FINANCE_URL = "http://newsru.co.il/finance/";
        public static String REALTY_URL = "http://newsru.co.il/realty/";
        public static String AUTO_URL = "http://newsru.co.il/auto/";
        public static String SPORT_URL = "http://newsru.co.il/sport/";
        public static String REST_URL = "http://newsru.co.il/rest/";
        public static String PRESS_URL = "http://newsru.co.il/press/";
        public static String PHOTO_URL = "http://newsru.co.il/photo/";
        public static String CULTURE_EVENTS_URL = "http://bravo.newsru.co.il/";
        public static String BOARD_URL = "http://doska.newsru.co.il/";
        public static String ARCHIVE_URL = "http://newsru.co.il/arch/";
        //Contact_US_PAGE
        public static final String HEAD_CONTACT_US_PATH = "//div[text()='Письмо в редакцию']";
        public static final String BUTTON_SEND = "//input[@value ='Отправить']";
        public static String CONTACT_US_URL = "https://www.newsru.co.il/info/feedback/form.html";


//    public static String
//    public static String
//    public static String
//    public static String
//    public static String
    }


