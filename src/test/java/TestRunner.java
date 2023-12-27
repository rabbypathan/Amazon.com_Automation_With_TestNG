import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner extends Setup {

    @Test(priority = 1, description = "Select the Element from Drop Down")
    public void selectElement() throws InterruptedException {
        HomePage page = new HomePage(driver);
        page.selectElement();
        Thread.sleep(5000);

        String textActual=driver.findElement(By.className("pageBanner")).getText();
        String textExpected="The Baby Store\n" +
                "Shop top baby toys, clothing, formula, diaper, and maternity products";
        Assert.assertEquals(textActual,textExpected);
    }

    @Test(priority = 2, description = "Insert the text for search and click the search button")
    public void Search() throws InterruptedException {
        HomePage page = new HomePage(driver);
        page.search();
        Thread.sleep(5000);

        String textActual=driver.findElement(By.className("a-size-medium-plus")).getText();
        String textExpected="Results";
        Assert.assertEquals(textActual,textExpected);

    }

    @Test(priority = 3, description = "Close the Browser")
    public void closeBrowser(){
        driver.quit();
    }
}
