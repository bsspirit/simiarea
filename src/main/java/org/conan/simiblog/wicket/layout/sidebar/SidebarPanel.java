package org.conan.simiblog.wicket.layout.sidebar;
 
import org.conan.simiblog.common.wicket.BasePanel;
import org.conan.simiblog.wicket.component.search.SearchPanel;
/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-3
 *
 */
public class SidebarPanel extends BasePanel {

    private static final long serialVersionUID = -4600230064807223019L;

    public SidebarPanel(String id) {
        super(id);
        
        add(new SearchPanel("search.panel"));
    }

}
