package lekcijaSeptini.labDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoProductsTest extends BaseTest {

    @Test
    public void testAddProductToCart() throws InterruptedException {
        WebElement lietotajVardsIevadesLauks = parluks.findElement(By.id("user-name"));
        lietotajVardsIevadesLauks.sendKeys("standard_user");
        WebElement paroleIevadesLauks = parluks.findElement(By.id("password"));
        paroleIevadesLauks.sendKeys("secret_sauce");

        WebElement loginPogaIevadesLauks = parluks.findElement(By.id("login-button"));
        loginPogaIevadesLauks.click();

        WebElement productPageTitle = parluks.findElement(By.cssSelector("span.title"));
        String actualPageTitleText = productPageTitle.getText();
        Assert.assertEquals(actualPageTitleText,"PRODUCTS");

        Thread.sleep(5000);
    }
}
