package org.conan.simiblog.system.auth;

import org.apache.wicket.security.authentication.LoginException;
import org.apache.wicket.security.hive.authentication.DefaultSubject;
import org.apache.wicket.security.hive.authentication.Subject;
import org.apache.wicket.security.hive.authentication.UsernamePasswordContext;

public class MyContext extends UsernamePasswordContext {

    public MyContext(String username, String password) {
        super(username, password);
    }

    /**
     * @see org.apache.wicket.security.hive.authentication.UsernamePasswordContext#getSubject(String, String)
     */
    @Override
    protected Subject getSubject(String username, String password) throws LoginException {
        // authenticate username, password, throw exception if not found
        DefaultSubject user = new DefaultSubject();
        // grant principals: (user.addPrincipal(Principal))
        // Note Subjects are read only, but implementations like DefaultSubject will usually have some sort of way for you to add principals. Implementations are required to honor the readonly flag
        // which swarm sets immediately after obtaining the subject.

        return user;
    }

}
