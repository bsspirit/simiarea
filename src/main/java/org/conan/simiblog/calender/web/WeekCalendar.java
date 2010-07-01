package org.conan.simiblog.calender.web;

import org.apache.wicket.markup.html.basic.Label;
import org.conan.simiblog.wicket.layout.page.LayoutPage;
import org.conan.simiblog.wicket.layout.sidebar.SidebarPanel;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-10
 * 
 */
public class WeekCalendar extends LayoutPage {

    public WeekCalendar() {
        add(new SidebarPanel("sidebar.panel"));
        
        add(new Label("week.day.box.day", "01"));
        add(new Label("week.day.box.content", "Xi dan Da Yue Cheng"));
        add(new Label("week.day.box.cost", "20"));
    }
}
