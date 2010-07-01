package org.conan.simiblog.system.auth;

import org.apache.wicket.Component;
import org.apache.wicket.security.actions.WaspAction;
import org.apache.wicket.security.swarm.models.SwarmCompoundPropertyModel;

public class DepartmentModel<T> extends SwarmCompoundPropertyModel<T> {

    private static final long serialVersionUID = 1L;

    /**
     * Construct.
     * 
     * @param object
     */
    public DepartmentModel(Object object) {
        super(object);
    }

    /**
     * @see org.apache.wicket.security.swarm.models.SwarmModel#getSecurityId(org.apache.wicket.Component)
     */
    public String getSecurityId(Component component) {
        return "department"; // remember the name of the datapermission? this is it
    }

    /**
     * @see org.apache.wicket.security.models.ISecureModel#isAuthorized(org.apache.wicket.Component, org.apache.wicket.security.actions.WaspAction)
     */
    public boolean isAuthorized(Component component, WaspAction action) {
        WaspAction myAction = action;
        Object obj = getObject();
        // the department entity not to be confused with the department action further down.
        if (obj instanceof Department) {
            Department department = (Department) obj;
            // for secure departments you need organization rights, else department rights are sufficient
            myAction = action.add(getActionFactory().getAction(department.secure ? Organization.class : Department.class));
        }
        return super.isAuthorized(component, myAction);
    }

}
