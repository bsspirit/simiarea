package org.conan.simiblog.wicket.component.event.list;

import org.apache.wicket.feedback.ContainerFeedbackMessageFilter;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PageableListView;
import org.apache.wicket.markup.html.navigation.paging.PagingNavigator;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.conan.simiblog.common.wicket.BaseHtmlForm;
import org.conan.simiblog.event.model.EventDTO;
import org.conan.simiblog.util.DateConvert;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-6
 * 
 */
public class EventListHtmlForm extends BaseHtmlForm<EventListForm> {

    private static final long serialVersionUID = 1304038560546227692L;

    public EventListHtmlForm(String id, EventListForm form) {
        super(id, new CompoundPropertyModel<EventListForm>(form));

        final PageableListView<EventDTO> eventList = new PageableListView<EventDTO>("event.list.table", form.getList(), 10) {
            private static final long serialVersionUID = 2203372098357354703L;

            @Override
            protected void populateItem(ListItem<EventDTO> item) {
                final EventDTO event = (EventDTO) item.getModelObject();
                item.add(new Label("id", Integer.toString(event.getId())));
                item.add(new Label("content", event.getContent()));
                item.add(new Label("address", event.getAddress()));
                item.add(new Label("cost", Float.toString(event.getCost())));
                item.add(new Label("date", DateConvert.formatDate(event.getDate())));
            }
        };

        add(eventList);
        add(new PagingNavigator("pageNav", eventList));
        
        add(new FeedbackPanel(id + ".feedback", new ContainerFeedbackMessageFilter(this)));
    }

}
