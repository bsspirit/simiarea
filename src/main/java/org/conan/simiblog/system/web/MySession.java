package org.conan.simiblog.system.web;

import org.apache.wicket.Request;
import org.apache.wicket.protocol.http.WebSession;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-2
 * 
 */
public class MySession extends WebSession {

    private static final long serialVersionUID = -8417910523621956628L;

    private boolean auth;

    public MySession(Request request) {
        super(request);
    }

    public boolean isAuth() {
        return auth;
    }

    public void setAuth(boolean auth) {
        this.auth = auth;
    }

}
