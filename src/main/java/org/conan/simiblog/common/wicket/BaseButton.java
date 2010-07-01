package org.conan.simiblog.common.wicket;

import org.apache.wicket.markup.html.form.Button;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-2
 *
 */
public abstract class BaseButton extends Button {

    private static final long serialVersionUID = -6134561652691076407L;
    protected Logger log = LoggerFactory.getLogger(getClass());

    public BaseButton(String id) {
        super(id);
    }

}
