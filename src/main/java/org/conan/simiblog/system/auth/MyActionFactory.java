package org.conan.simiblog.system.auth;

import org.apache.wicket.WicketRuntimeException;
import org.apache.wicket.security.actions.RegistrationException;
import org.apache.wicket.security.swarm.actions.SwarmActionFactory;

public class MyActionFactory extends SwarmActionFactory {

    /**
     * Constructs a new ActionFactory with in addition to the default actions, organisation and department actions.
     */
    public MyActionFactory() {
        super("department");
        try {
            // note none of the actions registered this way will implement the interface defined here, you will simply get the default action
            register(Department.class, "department");
            // registering an action this way will return the actual implementation specified here
            // however the reason we are using a custom implementation here is because we need to inherit the department action
            // register(Organisation.class, new ImpliesOtherAction(nextPowerOf2(), "organization", this, Department.class));

        } catch (RegistrationException e) {
            throw new WicketRuntimeException("actionfactory was not setup correctly", e);
        }
    }
}
