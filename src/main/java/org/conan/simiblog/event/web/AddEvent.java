package org.conan.simiblog.event.web;

import org.conan.simiblog.wicket.component.event.add.EventAddPanel;
import org.conan.simiblog.wicket.layout.page.LayoutPage;
import org.conan.simiblog.wicket.layout.sidebar.SidebarPanel;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-3
 * 
 */
public class AddEvent extends LayoutPage {

    public AddEvent() {
        add(new EventAddPanel("event.add.panel"));
        add(new SidebarPanel("sidebar.panel"));
    }
}
