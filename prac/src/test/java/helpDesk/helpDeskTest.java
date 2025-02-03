package helpDesk;

import core.BaseSeleniumTest;
import org.junit.Test;

public class helpDeskTest extends BaseSeleniumTest {

    @Test
    public void checkTicket(){
        MainPage mainPage = new MainPage().createTicket();

    }
}
