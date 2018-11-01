import com.preludes.babysitter.BabySitter;
import com.preludes.babysitter.Family;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BabySitterTests {

    public Family famA;
    public Family famB;
    public Family famC;

    @Before
    public void classCreation(){
        famA = new Family(5, 10,15, 11, 16, 20);
        famB = new Family(5,9,12,10,11,8,12,16,16);
        famC = new Family(5,8,15,9,16,15);
    }

    //Tests from 5pm - 6pm with Family A
    @Test
    public void workingOneHourWithFamilyA(){
        Assert.assertEquals("$15", famA.sittingJob(5, 6));
    }

    //Tests from 5pm - 7pm with Family A
    @Test
    public void workingTwoHoursWithFamilyA(){
        Assert.assertEquals("$30", famA.sittingJob(5, 7));
    }

    //Test to ensure work doesn't start at 4am
    @Test
    public void enteringAStartTimeOf4ReturnsError(){
        Assert.assertEquals("Work can't begin at 4am", famA.sittingJob(4, 8));
        Assert.assertEquals("Work can't begin at 4am", famA.sittingJob(4, 2));
        Assert.assertEquals("Work can't begin at 4am", famA.sittingJob(4, 10));
    }

    //Test to ensure work doesn't end at 5pm
    @Test
    public void enteringAnEndTimeOf5ReturnsError(){
        Assert.assertEquals("Work can't end at 5pm", famA.sittingJob(7, 5));
        Assert.assertEquals("Work can't end at 5pm", famA.sittingJob(10, 5));
        Assert.assertEquals("Work can't end at 5pm", famA.sittingJob(2, 5));
    }

    //Test to ensure start time is before end time (if both are pm or am)
    @Test
    public void enteringAnEndTimeThatIsBeforeStartTimeReturnsError(){
        Assert.assertEquals("Those times don't work", famA.sittingJob(7, 6));
        Assert.assertEquals("Those times don't work", famA.sittingJob(3, 1));
        Assert.assertEquals("Those times don't work", famA.sittingJob(12, 8));
    }


    //Test to ensure start time is before end time (if one is am and one pm)
    @Test
    public void enteringAnEndTimeInPMAndStartTimeInAMReturnsError(){
        Assert.assertEquals("Those times don't work", famA.sittingJob(2, 6));
    }

    //Test to ensure start time and end time are not the same
    @Test
    public void sameStartAndEndReturnsError(){
        Assert.assertEquals("The start time and end time are the same", famA.sittingJob(6, 6));
    }

    //Test to make sure times entered are from 1-12
    @Test
    public void outOfBoundsTimesReturnError(){
        Assert.assertEquals("Those times do not exist", famA.sittingJob(13, 4));
        Assert.assertEquals("Those times do not exist", famA.sittingJob(2, 34));
        Assert.assertEquals("Those times do not exist", famA.sittingJob(123, 554));
    }

    //Begin tests to work with different families...

    @Test
    public void familyAForTwoHours(){
        Assert.assertEquals("$30", famA.sittingJob(5,7));
    }

    //Test for family B's beginning rate

    @Test
    public void familyBForTwoHours(){
        Assert.assertEquals("$24", famB.sittingJob(5, 7));
    }

    //Test for family C's beginning rate

    @Test
    public void familyCForTwoHours(){
        Assert.assertEquals("$30", famC.sittingJob(5, 7));
    }

    //Test that family A's rate is different for later hours
    @Test
    public void familyAInTheAM(){
        Assert.assertEquals("$40", famA.sittingJob(1, 3));
    }



    /*Tests still needed
    * -different hours charge different amounts

    *
    * Objectives
    * -Convert final return to int
    * -Refactor time verification code into separate method
    * */
}
