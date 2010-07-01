package org.conan.simiblog.wicket.component.login;

import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.conan.simiblog.common.wicket.BasePanel;
import org.conan.simiblog.home.MyHome;
/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-2
 *
 */
public class LoginPanel extends BasePanel {

    private static final long serialVersionUID = -833333614931243465L;

    private LoginForm loginForm = new LoginForm();

    public LoginPanel(String id) {
        super(id);

        Form<LoginForm> login = new LoginHtmlForm("login.form", loginForm);
        add(login);

        login.add(new Button("login.submit") {
            private static final long serialVersionUID = 5115353340031111275L;

            @Override
            public void onSubmit() {
                log.info("Submit, email = " + loginForm.getEmail());
                setResponsePage(MyHome.class);
            }
        });
    }

}
