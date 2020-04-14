package uk.gov.harrow.pages;

import org.openqa.selenium.By;
import uk.gov.harrow.utility.Utility;

public class HomePage extends Utility {
    By loginOrRegistrationLink = By.xpath("//span[@class='icon-fallback']");
    By serviceBtn = By.xpath("//span[@class='button__text'][contains(text(),'Services')]");

    public void clickOnElementLoginOnRegistrationLink() {
        clickOnElement(loginOrRegistrationLink);

    }

    public void clickOnElementServicesBtn() {
        clickOnElement(serviceBtn);
    }
}




