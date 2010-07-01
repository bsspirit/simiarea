package org.conan.simiblog.wicket.component.register;

import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.conan.simiblog.auth.web.Login;
import org.conan.simiblog.common.wicket.BasePanel;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-2
 * 
 */
public class RegisterPanel extends BasePanel {

    private static final long serialVersionUID = 2900710803842595517L;
    
    private RegisterForm registerForm = new RegisterForm();

    public RegisterPanel(String id) {
        super(id);
        
        Form<RegisterForm> register = new RegisterHtmlForm("register.form", registerForm);
        add(register);

        register.add(new Button("register.submit") {
            private static final long serialVersionUID = -7266238075983520909L;

            @Override
            public void onSubmit() {
                log.info("Register : " + registerForm.getEmail());
                setResponsePage(Login.class);
            }
        });
    }

}
