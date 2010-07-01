package org.conan.simiblog.auth.web;

import org.conan.simiblog.wicket.component.register.RegisterPanel;
import org.conan.simiblog.wicket.layout.page.LayoutPage;
import org.conan.simiblog.wicket.layout.sidebar.SidebarPanel;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-2
 * 
 */
public class Register extends LayoutPage {

    public Register() {
        add(new RegisterPanel("register.panel"));
        add(new SidebarPanel("sidebar.panel"));
    }

}
