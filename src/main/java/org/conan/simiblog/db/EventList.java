package org.conan.simiblog.db;

import java.util.ArrayList;
import java.util.List;

import org.conan.simiblog.calender.web.form.DayForm;
import org.conan.simiblog.calender.web.form.MonthForm;
import org.conan.simiblog.event.model.EventDTO;
import org.conan.simiblog.util.DateConvert;

/**
 * Temp list object.
 * 
 * @author <a href="mailto:bsspirit@gmail.com">Conan Zhang</a>
 * @date 2010-5-8
 * 
 */
public class EventList {

    public static List<EventDTO> list = new ArrayList<EventDTO>();

    static {
        if (list.size() == 0) {
            for (int i = 1, num = 1; i < 5; i++) {
                for (int j = 1; j < 5; j++) {
                    for (int k = 1; k < 3; k++) {
                        EventDTO event = new EventDTO();
                        event.setId(num++);
                        event.setDate(DateConvert.newDate("2010-0" + i + "-0" + j));
                        event.setCost((i + j) * 10 - 7f);
                        event.setContent("movie");
                        event.setAddress("XiDan DaYueCheng");
                        list.add(event);
                    }

                }
            }
        }
    }

    public static MonthForm get1stMonth() {
        int month = 1;
        MonthForm monthForm = new MonthForm();
        monthForm.setMonth(String.valueOf(month));

        for (EventDTO event : list) {
            if (Integer.parseInt(DateConvert.getMonth(event.getDate())) == month
                    && Integer.parseInt(DateConvert.getDay(event.getDate())) == month) {
                String day = DateConvert.getDay(event.getDate());

                int tmp = 0;
                for (DayForm dayList : monthForm.getDayList()) {
                    if (dayList.getDay().equals(day)) {
                        dayList.getList().add(event);
                        tmp = 1;
                        break;
                    }
                }

                if (tmp == 0) {
                    DayForm dayForm = new DayForm();
                    dayForm.setDay(day);
                    dayForm.getList().add(event);
                    monthForm.getDayList().add(dayForm);
                }
            }
        }
        return monthForm;
    }
}
