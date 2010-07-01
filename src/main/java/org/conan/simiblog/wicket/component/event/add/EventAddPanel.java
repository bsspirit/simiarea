package org.conan.simiblog.wicket.component.event.add;

import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.conan.simiblog.common.wicket.BasePanel;
import org.conan.simiblog.event.web.ListEvent;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-6
 * 
 */
public class EventAddPanel extends BasePanel {

    private static final long serialVersionUID = 7022218972359498707L;

    private EventAddForm eventAddForm = new EventAddForm();

    public EventAddPanel(String id) {
        super(id);

        Form<EventAddForm> addEventForm = new EventAddHtmlForm("event.add.form", eventAddForm);
        add(addEventForm);

        addEventForm.add(new Button("event.add.submit") {
            private static final long serialVersionUID = 6711553468210249870L;

            @Override
            public void onSubmit() {
                setResponsePage(ListEvent.class);
            }
        });
    }

}
