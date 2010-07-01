package org.conan.simiblog.wicket.layout.footer;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.conan.simiblog.aboutus.web.Aboutus;
import org.conan.simiblog.aboutus.web.Sitemap;
import org.conan.simiblog.common.wicket.BasePanel;
 
/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-2
 * 
 */
public class FooterPanel extends BasePanel {

    private static final long serialVersionUID = -2274383850751680284L;

    public FooterPanel(String id) {
        super(id);

        add(new BookmarkablePageLink<WebPage>("footHomepageLink", getSession().getApplication().getHomePage()));
        add(new BookmarkablePageLink<WebPage>("footAboutusLink", Aboutus.class));
        add(new BookmarkablePageLink<WebPage>("footSitemapLink", Sitemap.class));
    }

}
