package edu.aluismarte.diplomado.code;

import edu.aluismarte.diplomado.Data;
import edu.aluismarte.diplomado.model.Holiday;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * No optimize code to calculate due date
 * <p>
 * Created by Aluis on 10/18/2021.
 */
public class UnoptimizedCode {

    public Date calculateDueDate(int daysToWait) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        for (int i = 0; i < daysToWait; i++) {
            calendar.add(Calendar.DATE, 1);
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                calendar.add(Calendar.DATE, 1);
            } else if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                calendar.add(Calendar.DATE, 2);
            }
        }
        List<Holiday> holidays = getHolidays(calendar.get(Calendar.YEAR), calendar.getTime()); // Find holidays to this date
        for (Holiday holiDay : holidays) {
            LocalDate holyDate = holiDay.getHolyDate();
            if (holyDate.getDayOfWeek() != DayOfWeek.SUNDAY && holyDate.getDayOfWeek() != DayOfWeek.SATURDAY) {
                calendar.add(Calendar.DATE, 1);
            }
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                calendar.add(Calendar.DATE, 1);
            } else if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                calendar.add(Calendar.DATE, 2);
            }
        }
        return calendar.getTime();
    }

    /**
     * Get Holidays on a year
     *
     * @param year Year to collect
     * @return List of available holidays
     */
    private List<Holiday> getHolidays(int year, Date lastDate) {
        return Data.HOLY_DAYS.stream().filter(holiday -> {
            LocalDate localDate = LocalDate.from(new java.sql.Date(lastDate.getTime()).toLocalDate());
            return holiday.getYear() == year && holiday.getHolyDate().isBefore(localDate) && holiday.getHolyDate().equals(localDate);
        }).collect(Collectors.toList());
    }
}
