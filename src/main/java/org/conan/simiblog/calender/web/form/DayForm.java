package org.conan.simiblog.calender.web.form;

import java.util.ArrayList;
import java.util.List;

import org.conan.simiblog.common.model.BaseDTO;
import org.conan.simiblog.event.model.EventDTO;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-8
 * 
 */
public class DayForm extends BaseDTO {

    private static final long serialVersionUID = 2679235538488422132L;

    private String day;
    private List<EventDTO> list = new ArrayList<EventDTO>();

    public List<EventDTO> getList() {
        return list;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

}
