import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(id = "nav-search-dropdown-card")
    WebElement dropMenu;
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchTxt;
    @FindBy(id = "nav-search-submit-button")
    WebElement searchBtn;
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void selectElement() throws InterruptedException {
        dropMenu.click();
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ARROW_DOWN).perform();
        action.sendKeys(Keys.ARROW_DOWN).perform();
        action.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(3000);
        action.sendKeys(Keys.ENTER).perform();
        action.sendKeys(Keys.ENTER).perform();

    }

    public void search(){
        searchTxt.click();
        searchTxt.sendKeys("bag");
        searchBtn.click();
    }

}
