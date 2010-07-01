package org.conan.simiblog.wicket.component.search;

import org.apache.wicket.feedback.ContainerFeedbackMessageFilter;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.PropertyModel;
import org.conan.simiblog.common.wicket.BaseHtmlForm;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-2
 * 
 */
public class SearchHtmlForm extends BaseHtmlForm<SearchForm> {

    private static final long serialVersionUID = 4560409782208607446L;

    public SearchHtmlForm(String id, SearchForm searchForm) {
        super(id, new CompoundPropertyModel<SearchForm>(searchForm));

        add(new TextField<String>("search.word", new PropertyModel<String>(searchForm, "word")));
        add(new FeedbackPanel(id + ".feedback", new ContainerFeedbackMessageFilter(this)));
    }

}
