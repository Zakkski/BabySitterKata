package com.preludes.babysitter;

public class Family {

    public int period1Start;
    public int period1End;
    public int period1Rate;
    public int period2Start;
    public int period2End;
    public int period2Rate;
    public int period3Start;
    public int period3End;
    public int period3Rate;


    public Family(int period1Start, int period1End, int period1Rate, int period2Start, int period2End, int period2Rate){

        this.period1Start = period1Start;
        this.period1End = period1End;
        this.period1Rate = period1Rate;
        this.period2Start = period2Start;
        this.period2End = period2End;
        this.period2Rate = period2Rate;

    }

    public Family(int period1Start, int period1End, int period1Rate, int period2Start, int period2End, int period2Rate, int period3Start, int period3End, int period3Rate){

        this.period1Start = period1Start;
        this.period1End = period1End;
        this.period1Rate = period1Rate;
        this.period2Start = period2Start;
        this.period2End = period2End;
        this.period2Rate = period2Rate;
        this.period3Start = period3Start;
        this.period3End = period3End;
        this.period3Rate = period3Rate;

    }

    public String sittingJob(int startTime, int endTime){

        //Code to catch any errors with time

        boolean timesAreInBounds = (startTime < 0 || startTime > 12 || endTime < 0 || endTime > 12);
        boolean startInPM = (5 <= startTime && 12 >= startTime);
        boolean endInPM = (5 <= endTime && 12 >= endTime);

        if(timesAreInBounds){
            return "Those times do not exist";
        }
        else if(startTime == 4){
            return "Work can't begin at 4am";
        }
        else if(endTime == 5){
            return "Work can't end at 5pm";
        }
        else if (startTime == endTime){
            return "The start time and end time are the same";
        }

        if(!startInPM)
            startTime += 12;

        if(!endInPM)
            endTime += 12;

        if(startTime > endTime){
            return "Those times don't work";
        }

        //Math to calculate total pay

        int hoursWorked = endTime - startTime;
        int totalPay = hoursWorked * period1Rate;
        return "$" + Integer.toString(totalPay);
    }
}
