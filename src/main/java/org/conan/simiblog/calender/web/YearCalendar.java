package org.conan.simiblog.calender.web;

import org.apache.wicket.markup.html.basic.Label;
import org.conan.simiblog.wicket.layout.page.LayoutPage;
import org.conan.simiblog.wicket.layout.sidebar.SidebarPanel;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-8
 * 
 */
public class YearCalendar extends LayoutPage {
    public YearCalendar() {
        add(new SidebarPanel("sidebar.panel"));

        add(new Label("year.month.box.month", "Junary"));
        add(new Label("year.month.box.day", "02"));
        add(new Label("year.month.box.content", "Xi Dan Da Yue Cheng"));
        add(new Label("year.month.box.cost", "20 Yuan"));
    }
}
