package org.conan.simiblog.wicket.component.register;

import org.apache.wicket.feedback.ContainerFeedbackMessageFilter;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.form.validation.EqualPasswordInputValidator;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.validation.validator.EmailAddressValidator;
import org.apache.wicket.validation.validator.StringValidator;
import org.conan.simiblog.SimiConstants;
import org.conan.simiblog.common.wicket.BaseHtmlForm;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-2
 * 
 */
public class RegisterHtmlForm extends BaseHtmlForm<RegisterForm> {

    private static final long serialVersionUID = -4773010014214180277L;

    public RegisterHtmlForm(String id, RegisterForm registerForm) {
        super(id, new CompoundPropertyModel<RegisterForm>(registerForm));

        TextField<String> email = new RequiredTextField<String>("register.email", new PropertyModel<String>(registerForm, "email"));
        add(email);
        email.add(EmailAddressValidator.getInstance());
        email.add(StringValidator.maximumLength(SimiConstants.VALID_EMAIL_MAX_LENGTH));

        PasswordTextField password = new PasswordTextField("register.password", new PropertyModel<String>(registerForm, "password"));
        add(password);
        password.setRequired(true);
        password.add(StringValidator.lengthBetween(SimiConstants.VALID_PASSWORD_MIX_LENGTH, SimiConstants.VALID_PASSWORD_MAX_LENGTH));

        PasswordTextField repassword = new PasswordTextField("register.repassword", new PropertyModel<String>(registerForm, "repassword"));
        add(repassword);
        repassword.setRequired(true);
        repassword.setResetPassword(false);
        repassword.add(StringValidator.lengthBetween(SimiConstants.VALID_PASSWORD_MIX_LENGTH, SimiConstants.VALID_PASSWORD_MAX_LENGTH));

        add(new EqualPasswordInputValidator(password, repassword));

        add(new FeedbackPanel(id + ".feedback", new ContainerFeedbackMessageFilter(this)));

    }
}
