package uk.gov.harrow.testsuite;

import org.testng.annotations.Test;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.testbase.TestBase;

public class TestCase extends TestBase {

    HomePage homePage = new HomePage();

    @Test (priority = 0,groups = "Regression")
    public void verifyUserShouldClickOnLoginOrRegisterLink(){
        homePage.clickOnElementLoginOnRegistrationLink();
    }

    @Test (priority = 1,groups = "Regression")
    public void varifyUserShouldClickOnServicesButton(){
        homePage.clickOnElementServicesBtn();
    }
}
