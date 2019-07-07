package com.MergeDateIntervalProgram;

import java.util.Date;

public class DateRange implements Comparable<DateRange>{

    private Date startDate;
    private Date endDate;


    public DateRange(Date startDate,Date endDate){
        this.startDate=startDate;
        this.endDate=endDate;
    }




    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


    @Override
    public int compareTo(DateRange o) {
        return this.startDate.compareTo(o.startDate);
    }

    @Override
    public String toString() {
        return "DateRange{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
