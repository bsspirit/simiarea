package org.conan.simiblog.wicket.component.event.list;

import org.apache.wicket.markup.html.form.Form;
import org.conan.simiblog.common.wicket.BasePanel;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-6
 * 
 */
public class EventListPanel extends BasePanel {

    private static final long serialVersionUID = -7515819868594038729L;

    public EventListPanel(String id) {
        super(id);

        EventListForm evetListForm = new EventListForm();
        Form<EventListForm> form = new EventListHtmlForm("event.list.form", evetListForm);
        add(form);
    }

}
