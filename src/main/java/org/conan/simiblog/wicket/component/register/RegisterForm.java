package org.conan.simiblog.wicket.component.register;

import org.conan.simiblog.wicket.component.login.LoginForm;

public class RegisterForm extends LoginForm {

    private static final long serialVersionUID = 5159391776000920579L;

    private String repassword;

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

}
