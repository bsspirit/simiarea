package org.conan.simiblog.wicket.component.event.add;

import java.util.Date;

import org.apache.wicket.datetime.PatternDateConverter;
import org.apache.wicket.datetime.markup.html.form.DateTextField;
import org.apache.wicket.extensions.yui.calendar.DatePicker;
import org.apache.wicket.feedback.ContainerFeedbackMessageFilter;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.validation.validator.StringValidator;
import org.conan.simiblog.SimiConstants;
import org.conan.simiblog.common.wicket.BaseHtmlForm;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-6
 * 
 */
public class EventAddHtmlForm extends BaseHtmlForm<EventAddForm> {

    private static final long serialVersionUID = 4917866823461089009L;

    public EventAddHtmlForm(String id, EventAddForm form) {
        super(id, new CompoundPropertyModel<EventAddForm>(form));

        DateTextField dateTextField = new DateTextField("event.add.date", new PropertyModel<Date>(form, "date"), new PatternDateConverter("yyyy-MM-dd", true));
        dateTextField.add(new DatePicker());
        add(dateTextField);

        TextField<String> content = new TextField<String>("event.add.content", new PropertyModel<String>(form, "content"));
        add(content);
        content.setRequired(true);
        content.add(StringValidator.maximumLength(SimiConstants.VALID_CONTENT_MAX_LENGTH));

        TextField<String> address = new TextField<String>("event.add.address", new PropertyModel<String>(form, "address"));
        add(address);
        address.add(StringValidator.maximumLength(SimiConstants.VALID_ADDRESS_MAX_LENGTH));

        TextField<Float> cost = new TextField<Float>("event.add.cost", new PropertyModel<Float>(form, "cost"));
        add(cost);
        cost.setRequired(true);

        TextArea<String> description = new TextArea<String>("event.add.description", new PropertyModel<String>(form, "description"));
        add(description);

        add(new FeedbackPanel(id + ".feedback", new ContainerFeedbackMessageFilter(this)));
    }

}
