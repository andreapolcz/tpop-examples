package north.tpop.core.pageobject;

import north.tpop.core.annotation.Path;
import north.tpop.core.annotation.PathType;
import north.tpop.core.annotation.Selectable;
import north.tpop.core.annotation.SelectorType;
import north.tpop.core.element.Element;

public class Contact extends Element {

    @Path(PathType.Relative)
    @Selectable(by = SelectorType.className, value = "name")
    public Element name;

    @Path(PathType.Relative)
    @Selectable(by = SelectorType.className, value = "email")
    public Element email;

}
