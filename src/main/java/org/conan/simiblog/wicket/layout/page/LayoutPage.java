package org.conan.simiblog.wicket.layout.page;
 
import org.conan.simiblog.common.wicket.BasePage;
import org.conan.simiblog.wicket.layout.footer.FooterPanel;
import org.conan.simiblog.wicket.layout.header.HeaderPanel;

/**
 * Layout page.
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-2
 * 
 */
public class LayoutPage extends BasePage {

    public LayoutPage() {
        add(new HeaderPanel("header.panel"));
        add(new FooterPanel("footer.panel"));
    }

}
