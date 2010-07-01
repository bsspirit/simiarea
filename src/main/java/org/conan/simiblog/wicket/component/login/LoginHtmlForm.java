package org.conan.simiblog.wicket.component.login;

import org.apache.wicket.feedback.ContainerFeedbackMessageFilter;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.form.TextField;
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
public class LoginHtmlForm extends BaseHtmlForm<LoginForm> {
    private static final long serialVersionUID = 8656243592968680245L;

    public LoginHtmlForm(String id, LoginForm loginForm) {
        super(id, new CompoundPropertyModel<LoginForm>(loginForm));

        TextField<String> email = new RequiredTextField<String>("login.email", new PropertyModel<String>(loginForm, "email"));
        add(email);
        email.add(EmailAddressValidator.getInstance());
        email.add(StringValidator.maximumLength(SimiConstants.VALID_EMAIL_MAX_LENGTH));

        PasswordTextField password = new PasswordTextField("login.password", new PropertyModel<String>(loginForm, "password"));
        add(password);
        password.setRequired(true);
        password.add(StringValidator.lengthBetween(SimiConstants.VALID_PASSWORD_MIX_LENGTH, SimiConstants.VALID_PASSWORD_MAX_LENGTH));

        add(new FeedbackPanel(id + ".feedback", new ContainerFeedbackMessageFilter(this)));
    }

}
