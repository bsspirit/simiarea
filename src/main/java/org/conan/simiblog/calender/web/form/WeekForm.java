package org.conan.simiblog.calender.web.form;

import java.util.ArrayList;
import java.util.List;

import org.conan.simiblog.common.model.BaseDTO;

/**
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-8
 * 
 */
public class WeekForm extends BaseDTO {

    private static final long serialVersionUID = -1996367137571135319L;

    private List<DayForm> dayList = new ArrayList<DayForm>(7);
    private String month;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public List<DayForm> getDayList() {
        return dayList;
    }

}
