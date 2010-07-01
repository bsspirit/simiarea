package org.conan.simiblog.wicket.component.event.list;

import java.util.ArrayList;
import java.util.List;

import org.conan.simiblog.common.model.BaseDTO;
import org.conan.simiblog.db.EventList;
import org.conan.simiblog.event.model.EventDTO;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-6
 * 
 */
public class EventListForm extends BaseDTO {

    private static final long serialVersionUID = -4054784590146940415L;

    private List<EventDTO> list = new ArrayList<EventDTO>();

    public List<EventDTO> getList() {
        // TODO Conan: temp list
        list.addAll(EventList.list);
        return list;
    }

}
