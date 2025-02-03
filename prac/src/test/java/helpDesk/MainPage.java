package helpDesk;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class MainPage extends BaseSeleniumPage {

    @FindBy(xpath = "/html/body/ytd-app/div[1]/div[2]/ytd-masthead/div[4]/div[2]/yt-searchbox/div[1]/form/input")
    private WebElement Clickbuy;

    @FindBy(xpath = "/html/body/ytd-app/div[1]/div[2]/ytd-masthead/div[4]/div[2]/yt-searchbox/div[1]/form/input")
    private WebElement inputvk;

    @FindBy(xpath = "/html/body/ytd-app/div[1]/div[2]/ytd-masthead/div[4]/div[2]/yt-searchbox/button/yt-icon/span/div")
    private WebElement inputsearch;

    @FindBy(xpath = "/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/ytd-thumbnail/a/yt-image/img")
    private WebElement inputvideo;

    @FindBy(xpath = "/html/body/ytd-app/div[1]/ytd-page-manager/ytd-watch-flexy/div[5]/div[1]/div/div[1]/div[2]/div/div/ytd-player/div/div/div[35]/div[2]/div[2]/button[9]")
    private WebElement inputfs;




    public MainPage(){
       driver.get("https://www.youtube.com/");
        PageFactory.initElements(driver, this);


    }
    public MainPage createTicket(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Clickbuy.click();
        inputvk.sendKeys("гайд на стрелка каламити");
        inputsearch.click();
        inputvideo.click();
        inputfs.click();




        return this;
    }
}
