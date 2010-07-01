package org.conan.simiblog.system.auth;

import org.apache.wicket.markup.html.link.AbstractLink;
import org.apache.wicket.security.actions.WaspAction;
import org.apache.wicket.security.checks.LinkSecurityCheck;

public class DepartmentLinkCheck extends LinkSecurityCheck {
    private static final long serialVersionUID = 1L;

    private boolean secureDepartment;

    /**
     * Construct.
     * 
     * @param component
     * @param clickTarget
     */
    public DepartmentLinkCheck(AbstractLink component, Class clickTarget, Department department) {
        super(component, clickTarget);
        secureDepartment = department.secure;
        // our department entity has a flag letting us know if it should be protected or not, but you could ofcourse base the decision on anything you like
    }

    /**
     * @see org.apache.wicket.security.checks.LinkSecurityCheck#isActionAuthorized(org.apache.wicket.security.actions.WaspAction)
     */
    public boolean isActionAuthorized(WaspAction action) {
        // for secure departments you need organization rights, else department rights are sufficient
        WaspAction myAction = action.add(getActionFactory().getAction(secureDepartment ? Organization.class : Department.class));
        // this is as easy as adding the required actions and then let the super implementation take over.
        return super.isActionAuthorized(myAction);
    }

}
