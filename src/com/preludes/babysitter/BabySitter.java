package com.preludes.babysitter;

public class BabySitter {

    //Method to input times of work
    public String sittingJob(int startTime, int endTime){
        if(startTime == 4){
            return "Work can't begin at 4am";
        }
        int hoursWorked = endTime - startTime;
        int rateOfPay = 15;
        int totalPay = hoursWorked * rateOfPay;
        return "$" + Integer.toString(totalPay);
    }
}
