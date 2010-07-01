package org.conan.simiblog.system.auth;

import org.apache.wicket.security.hive.authentication.Subject;
import org.apache.wicket.security.hive.authorization.Principal;

public class MyPrincipal implements Principal {

    private static final long serialVersionUID = 1888563417844721822L;
    private String name;

    public MyPrincipal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean implies(Subject subject) {
        return false;
    }
}