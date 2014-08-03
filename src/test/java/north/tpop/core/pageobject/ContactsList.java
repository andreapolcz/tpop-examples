package north.tpop.core.pageobject;

import north.tpop.core.annotation.Path;
import north.tpop.core.annotation.PathType;
import north.tpop.core.annotation.RepeatableOver;
import north.tpop.core.annotation.Selectable;
import north.tpop.core.annotation.SelectorType;
import north.tpop.core.element.Element;
import north.tpop.core.element.RepeatableElement;

public class ContactsList extends Element {

    @Path(PathType.Relative)
    @Selectable(by = SelectorType.tagName, value = "li")
    @RepeatableOver(Contact.class)
    public RepeatableElement<Contact> items;

    @Path(PathType.Relative)
    @Selectable(by = SelectorType.className, value = "title")
    public Element title;
}
