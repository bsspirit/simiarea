package org.conan.simiblog;

import java.net.MalformedURLException;

import org.apache.wicket.Page;
import org.apache.wicket.WicketRuntimeException;
import org.apache.wicket.protocol.http.HttpSessionStore;
import org.apache.wicket.security.hive.HiveMind;
import org.apache.wicket.security.hive.config.PolicyFileHiveFactory;
import org.apache.wicket.security.swarm.SwarmWebApplication;
import org.apache.wicket.session.ISessionStore;
import org.conan.simiblog.aboutus.web.Aboutus;
import org.conan.simiblog.aboutus.web.Sitemap;
import org.conan.simiblog.auth.web.Login;
import org.conan.simiblog.auth.web.Register;
import org.conan.simiblog.event.web.AddEvent;
import org.conan.simiblog.event.web.ListEvent;
import org.conan.simiblog.home.MyHome;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-2
 * 
 */
public class SimiApplication extends SwarmWebApplication {

    public SimiApplication() {
    }

    @Override
    public void init() {
        super.init();
        getResourceSettings().setResourcePollFrequency(null);
        getMarkupSettings().setDefaultMarkupEncoding("utf-8");

        mountBookmarkablePage("/aboutus", Aboutus.class);
        mountBookmarkablePage("/login", Login.class);
        mountBookmarkablePage("/register", Register.class);
        mountBookmarkablePage("/home", MyHome.class);
        mountBookmarkablePage("/sitemap", Sitemap.class);
        mountBookmarkablePage("/event/add", AddEvent.class);
        mountBookmarkablePage("/event/list", ListEvent.class);
    }

    @Override
    protected ISessionStore newSessionStore() {
        return new HttpSessionStore(this);
    }

    public Class<? extends Page> getHomePage() {
        return Sitemap.class;
    }

    @Override
    protected Object getHiveKey() {
        // if you are using servlet api 2.5 i would suggest using:
        // return getServletContext().getContextPath();

        // if not you have several options:
        // -an initparam in web.xml
        // -a static object
        // -a random object
        // -whatever you can think of

        // for this example we will be using a fixed string
        return getServletContext().getContextPath();
    }

    @Override
    protected void setUpHive() {
        // create factory
        // For 1.4 use new SwarmPolicyFileHiveFactory(getActionFactory());
        PolicyFileHiveFactory factory = new PolicyFileHiveFactory(getActionFactory());

        try {
            // this example uses 1 policy file but you can add as many as you like
            factory.addPolicyFile(getServletContext().getResource("/WEB-INF/multilogin.hive"));
            factory.setAlias("aboutus", "org.conan.simiblog.aboutus.web.Aboutus");
        } catch (MalformedURLException e) {
            throw new WicketRuntimeException(e);
        }
        // register factory
        HiveMind.registerHive(getHiveKey(), factory);
        // note we are not checking if a hive already exist because this app will only be deployed once

    }

    @Override
    public Class<? extends Page> getLoginPage() {
        return Login.class;
    }

}
