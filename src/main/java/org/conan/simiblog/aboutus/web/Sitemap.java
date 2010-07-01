package org.conan.simiblog.aboutus.web;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.security.components.markup.html.links.SecurePageLink;
import org.conan.simiblog.account.web.MyAccount;
import org.conan.simiblog.account.web.SweetAccount;
import org.conan.simiblog.auth.web.Login;
import org.conan.simiblog.auth.web.Register;
import org.conan.simiblog.calender.web.DayCalendar;
import org.conan.simiblog.calender.web.MonthCalendar;
import org.conan.simiblog.calender.web.WeekCalendar;
import org.conan.simiblog.calender.web.YearCalendar;
import org.conan.simiblog.event.web.AddEvent;
import org.conan.simiblog.event.web.ListEvent;
import org.conan.simiblog.home.MyHome;
import org.conan.simiblog.wicket.layout.page.LayoutPage;
import org.conan.simiblog.wicket.layout.sidebar.SidebarPanel;

/**
 * Sitemap.
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-2
 * 
 */
public class Sitemap extends LayoutPage {

    public Sitemap() {

        add(new BookmarkablePageLink<WebPage>("sitemapLink", Sitemap.class));
        add(new SecurePageLink<WebPage>("aboutusLink", Aboutus.class));
        add(new BookmarkablePageLink<WebPage>("loginLink", Login.class));
        add(new BookmarkablePageLink<WebPage>("registerLink", Register.class));

        add(new BookmarkablePageLink<WebPage>("myAccountLink", MyAccount.class));
        add(new BookmarkablePageLink<WebPage>("sweetAccountLink", SweetAccount.class));

        add(new BookmarkablePageLink<WebPage>("yearCalendarLink", YearCalendar.class));
        add(new BookmarkablePageLink<WebPage>("monthCalendarLink", MonthCalendar.class));
        add(new BookmarkablePageLink<WebPage>("weekCalendarLink", WeekCalendar.class));
        add(new BookmarkablePageLink<WebPage>("dayCalendarLink", DayCalendar.class));

        add(new BookmarkablePageLink<WebPage>("myHomeLink", MyHome.class));

        add(new BookmarkablePageLink<WebPage>("addEventLink", AddEvent.class));
        add(new BookmarkablePageLink<WebPage>("listEventLink", ListEvent.class));

        add(new SidebarPanel("sidebar.panel"));
    }

}
