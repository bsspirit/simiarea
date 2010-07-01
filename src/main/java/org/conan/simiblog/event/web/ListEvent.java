package org.conan.simiblog.event.web;

import org.conan.simiblog.wicket.component.event.list.EventListPanel;
import org.conan.simiblog.wicket.layout.page.LayoutPage;
import org.conan.simiblog.wicket.layout.sidebar.SidebarPanel;

public class ListEvent extends LayoutPage {

    public ListEvent() {
        add(new SidebarPanel("sidebar.panel"));
        add(new EventListPanel("event.list.panel"));

    }
}
