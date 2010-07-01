package org.conan.simiblog.common.wicket;

import org.apache.wicket.markup.html.panel.Panel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-2
 * 
 */
public abstract class BasePanel extends Panel {

    private static final long serialVersionUID = 5571662182610565916L;
    protected Logger log = LoggerFactory.getLogger(getClass());

    public BasePanel(String id) {
        super(id);
    }

}
