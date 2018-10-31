package com.preludes.babysitter;

public class BabySitter {

    //Method to input times of work
    public int sittingJob(int startTime, int endTime){
        int hoursWorked = endTime - startTime;
        int rateOfPay = 15;
        int totalPay = hoursWorked * rateOfPay;
        return totalPay;
    }
}
