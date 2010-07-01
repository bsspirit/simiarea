package org.conan.simiblog.aboutus.web;

import org.conan.simiblog.system.auth.AuthenticatedPage;
import org.conan.simiblog.wicket.layout.sidebar.SidebarPanel;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-2
 * 
 */
public class Aboutus extends AuthenticatedPage {

    public Aboutus() {
        add(new SidebarPanel("sidebar.panel"));
    }


}
