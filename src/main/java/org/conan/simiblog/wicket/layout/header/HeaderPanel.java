package org.conan.simiblog.wicket.layout.header;
 
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
public class HeaderPanel extends BasePanel {

    private static final long serialVersionUID = -2852982492672220357L;

    public HeaderPanel(String id) {
        super(id);

        add(new BookmarkablePageLink<WebPage>("headLogoLink", getSession().getApplication().getHomePage()));

        add(new BookmarkablePageLink<WebPage>("headHompepageLink", getSession().getApplication().getHomePage()));
        add(new BookmarkablePageLink<WebPage>("headAboutusLink", Aboutus.class));
        add(new BookmarkablePageLink<WebPage>("headSitemapLink", Sitemap.class));
    }

}
