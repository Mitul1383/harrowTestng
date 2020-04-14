package uk.gov.harrow.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.gov.harrow.basepage.BasePage;
import uk.gov.harrow.browserselector.BrowserSelector;
import uk.gov.harrow.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();
    String  baseUrl = loadProperty.getProperty("baseUrl");
    String  browser = loadProperty.getProperty("browser");

    @BeforeMethod(groups = {"Regression"})
    public void openBrowser(){
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);

         }

    @AfterMethod (groups = {"Regression"})
    public void tearDown(){
        driver.quit();;
    }

}
