package north.tpop.core.pageobject;

import north.tpop.core.annotation.PathType;
import north.tpop.core.annotation.RepeatableOver;
import north.tpop.core.annotation.Selectable;
import north.tpop.core.annotation.SelectorType;
import north.tpop.core.element.Element;
import north.tpop.core.element.RepeatableElement;

public class ContactsList extends Element {

    @Selectable(by = SelectorType.tagName, value = "li", pathType = PathType.Relative)
    @RepeatableOver(Contact.class)
    public RepeatableElement<Contact> items;

    @Selectable(by = SelectorType.className, value = "title", pathType = PathType.Relative)
    public Element title;
}
