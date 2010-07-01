package org.conan.simiblog.common.wicket;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.IModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-2
 * 
 */
public abstract class BaseHtmlForm<T> extends Form<T> {

    private static final long serialVersionUID = -4256579341067518588L;
    protected Logger log = LoggerFactory.getLogger(getClass());

    public BaseHtmlForm(String id) {
        super(id);
    }

    public BaseHtmlForm(final String id, IModel<T> model) {
        super(id, model);
    }

}
