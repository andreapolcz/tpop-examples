package north.tpop.core.pageobject;

import north.tpop.core.annotation.Selectable;
import north.tpop.core.annotation.SelectorType;
import north.tpop.core.element.Element;

public class S1Page {

    @Selectable(selectorType = SelectorType.id, selector = "showButton")
    public Element showButton;

    @Selectable(selectorType = SelectorType.id, selector = "hiddenText")
    public Element hiddenText;

    @Selectable(selectorType = SelectorType.id, selector = "contacts")
    public ContactsList contacts;
}
