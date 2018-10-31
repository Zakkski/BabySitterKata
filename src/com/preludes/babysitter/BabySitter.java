package com.preludes.babysitter;

public class BabySitter {

    //Method to input times of work
    public String sittingJob(int startTime, int endTime){
        if(startTime < 0 || startTime > 12 || endTime < 0 || endTime > 12){
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

        if(startTime > endTime){
            return "Those times don't work";
        }

        int hoursWorked = endTime - startTime;
        int rateOfPay = 15;
        int totalPay = hoursWorked * rateOfPay;
        return "$" + Integer.toString(totalPay);
    }
}
