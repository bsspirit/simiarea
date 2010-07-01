package org.conan.simiblog.calender.web;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.conan.simiblog.calender.web.form.DayForm;
import org.conan.simiblog.calender.web.form.MonthForm;
import org.conan.simiblog.db.EventList;
import org.conan.simiblog.event.model.EventDTO;
import org.conan.simiblog.wicket.layout.page.LayoutPage;
import org.conan.simiblog.wicket.layout.sidebar.SidebarPanel;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-8
 * 
 */
public class MonthCalendar extends LayoutPage {

    public MonthCalendar() {
        add(new SidebarPanel("sidebar.panel"));

        MonthForm monthForm = EventList.get1stMonth();

        ListView<DayForm> pageList = new ListView<DayForm>("month.day.table", monthForm.getDayList()) {
            private static final long serialVersionUID = 5165315001307515031L;

            @Override
            protected void populateItem(ListItem<DayForm> dayItem) {
                DayForm dayForm = dayItem.getModelObject();
                dayItem.add(new Label("month.day.box.day", dayForm.getDay()));

                ListView<EventDTO> eventList = new ListView<EventDTO>("month.day.content.table", dayForm.getList()) {
                    private static final long serialVersionUID = 678676786777778881L;

                    @Override
                    protected void populateItem(ListItem<EventDTO> item) {
                        EventDTO dto = item.getModelObject();
                        item.add(new Label("month.day.box.content", dto.getContent()));
                        item.add(new Label("month.day.box.cost", dto.getCost().toString()));
                    }

                };
                add(eventList);
            }
        };
        add(pageList);
    }
}
