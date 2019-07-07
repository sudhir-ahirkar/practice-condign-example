package com.MergeDateIntervalProgram;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;

public class DateMerger {

    public static void main(String[] args) throws ParseException {

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        Date startDate3 = simpleDateFormat.parse("2014-03-10");
        Date endDate3 = simpleDateFormat.parse("2014-04-15");

        Date startDate4 = simpleDateFormat.parse("2014-04-10");
        Date endDate4 = simpleDateFormat.parse("2014-05-15");

        Date startDate1 = simpleDateFormat.parse("2014-01-01");
        Date endDate1 = simpleDateFormat.parse("2014-01-30");

        Date startDate2 = simpleDateFormat.parse("2014-01-15");
        Date endDate2 = simpleDateFormat.parse("2014-02-15");

        List<DateRange> dateRanges=new CopyOnWriteArrayList<>();
        dateRanges.add(new DateRange(startDate1,endDate1));
        dateRanges.add(new DateRange(startDate2,endDate2));
        dateRanges.add(new DateRange(startDate3,endDate3));
        dateRanges.add(new DateRange(startDate4,endDate4));

        List<DateRange> dateMergerList=   mergeDates(dateRanges);
        System.out.println("dateMergerList======>"+dateMergerList);

    }

    public static List<DateRange> mergeDates(List<DateRange> dateRanges){

        Stack<DateRange> dateRangeStack=new Stack<>();

        if(dateRanges!=null && !dateRanges.isEmpty())
            dateRangeStack.push(dateRanges.get(0));
        else
            return null;

        for(DateRange dateRange:dateRanges){

            DateRange topRanges= dateRangeStack.peek();


            if(topRanges.getEndDate().before(dateRange.getStartDate())){

                dateRangeStack.push(dateRange);

            }else if(topRanges.getEndDate().before(dateRange.getEndDate())){

                topRanges.setEndDate(dateRange.getEndDate());

                dateRangeStack.pop();

                dateRangeStack.push(topRanges);

            }

        }

        return new ArrayList<>(dateRangeStack);
    }
}
