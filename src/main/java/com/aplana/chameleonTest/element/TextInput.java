package com.aplana.chameleonTest.element;

import com.aplana.chameleon.elements.selenium.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextInput extends WebElementFacade {

    public TextInput(WebElement element, String elementName, int waitTimeOut, String driverId) {
        super(element, elementName, waitTimeOut, driverId);
    }

    public String getPlaceholder(){
        return getWrappedElement().findElement(By.xpath("./../..//div[contains(@data-marker,'Error')]")).getText();
    }

    public void sendKeys(CharSequence... keysToSend) {
        getWrappedElement().click();
        getWrappedElement().sendKeys(keysToSend);
    }

    @Override
    public String getErrorMsg() {
        return null;
    }

    @Override
    public String getLabel() {
        return null;
    }
}
