package com.aplana.chameleonTest.element.custom;

import com.aplana.chameleon.elements.selenium.WebElementFacade;
import org.openqa.selenium.WebElement;

public class CustomInput extends WebElementFacade {

    public CustomInput(WebElement element, String elementName, int waitTimeOut, String driverId) {
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


}
