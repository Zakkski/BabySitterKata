package com.preludes.babysitter;

public class BabySitter {

    //Method to input times of work
    public String sittingJob(int startTime, int endTime){

        //Code to catch any errors with time

        boolean timesAreOutOfBounds = (startTime < 0 || startTime > 12 || endTime < 0 || endTime > 12);
        boolean startInPM = (5 <= startTime && 12 >= startTime);
        boolean endInPM = (5 <= endTime && 12 >= endTime);

        if(timesAreOutOfBounds){
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

        if(!startInPM && endInPM)
        {
            return "Start time can't be in the AM while end time is PM";
        }

        if(startTime > endTime){
            return "Those times don't work";
        }


        //Math to calculate total pay

        int hoursWorked = endTime - startTime;
        int rateOfPay = 15;
        int totalPay = hoursWorked * rateOfPay;
        return "$" + Integer.toString(totalPay);
    }
}
