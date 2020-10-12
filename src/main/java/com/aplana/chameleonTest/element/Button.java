package com.aplana.chameleonTest.element;

import com.aplana.chameleon.elements.selenium.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Button extends WebElementFacade {

    public Button(WebElement element, String elementName, int waitTimeOut, String driverId) {
        super(element, elementName, waitTimeOut, driverId);
    }

    @Override
    public String getErrorMsg() {
        return null;
    }

    @Override
    public String getLabel() {
        return null;
    }

    public void click(){
        getDriver().executeScript("arguments[0].scrollIntoView();", getWrappedElement());
        new WebDriverWait(getDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(getWrappedElement())).click();
    }
}
