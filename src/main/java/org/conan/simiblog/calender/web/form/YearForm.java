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
public class YearForm extends BaseDTO {

    private static final long serialVersionUID = -2398249045460604064L;

    private List<MonthForm> monthList = new ArrayList<MonthForm>(12);
    private String year;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<MonthForm> getMonthList() {
        return monthList;
    }

}
