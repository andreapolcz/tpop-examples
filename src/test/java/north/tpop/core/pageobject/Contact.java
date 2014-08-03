package north.tpop.core.pageobject;

import north.tpop.core.annotation.PathType;
import north.tpop.core.annotation.Selectable;
import north.tpop.core.annotation.SelectorType;
import north.tpop.core.element.Element;

public class Contact extends Element {

    @Selectable(selectorType = SelectorType.className, selector = "name", pathType = PathType.Relative)
    public Element name;

    @Selectable(selectorType = SelectorType.className, selector = "email", pathType = PathType.Relative)
    public Element email;

}
