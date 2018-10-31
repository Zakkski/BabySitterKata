package com.preludes.babysitter;

public class BabySitter {

    //Method to input times of work
    public String sittingJob(int startTime, int endTime){
        if(startTime == 4){
            return "Work can't begin at 4am";
        }
        else if(endTime == 5){
            return "Work can't end at 5pm";
        }

        if(startTime > endTime){
            return "Those times don't work";
        }

        int hoursWorked = endTime - startTime;
        int rateOfPay = 15;
        int totalPay = hoursWorked * rateOfPay;
        return "$" + Integer.toString(totalPay);
    }
}
