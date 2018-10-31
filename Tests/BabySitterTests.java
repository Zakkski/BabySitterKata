import com.preludes.babysitter.BabySitter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BabySitterTests {

    public BabySitter baby;

    @Before
    public void classCreation(){
        baby = new BabySitter();
    }

    //Tests from 5pm - 6pm with Family A
    @Test
    public void workingOneHourWithFamilyA(){
        Assert.assertEquals("$15", baby.sittingJob(5, 6));
    }

    //Tests from 5pm - 7pm with Family A
    @Test
    public void workingTwoHoursWithFamilyA(){
        Assert.assertEquals("$30", baby.sittingJob(5, 7));
    }

    //Test to ensure work doesn't start at 4am
    @Test
    public void enteringAStartTimeOf4ReturnsError(){
        Assert.assertEquals("Work can't begin at 4am", baby.sittingJob(4, 8));
        Assert.assertEquals("Work can't begin at 4am", baby.sittingJob(4, 2));
        Assert.assertEquals("Work can't begin at 4am", baby.sittingJob(4, 10));
    }

    //Test to ensure work doesn't end at 5pm
    @Test
    public void enteringAnEndTimeOf5ReturnsError(){
        Assert.assertEquals("Work can't end at 5pm", baby.sittingJob(7, 5));
        Assert.assertEquals("Work can't end at 5pm", baby.sittingJob(10, 5));
        Assert.assertEquals("Work can't end at 5pm", baby.sittingJob(2, 5));
    }

    //Test to ensure start time is before end time (in the pm)
    @Test
    public void enteringAnEndTimeThatIsBeforeStartTimeReturnsError(){
        Assert.assertEquals("Those times don't work", baby.sittingJob(7, 6));
        Assert.assertEquals("Those times don't work", baby.sittingJob(9, 7));
        Assert.assertEquals("Those times don't work", baby.sittingJob(12, 8));
    }

    //Test to ensure start time and end time are not the same
    @Test
    public void sameStartAndEndReturnsError(){
        Assert.assertEquals("The start time and end time are the same", baby.sittingJob(6, 6));
    }

    /*Tests still needed
    * -Make sure start and end times are not out of bounds
    * -can take an input of different families
    * -make sure times function with am and pm (End times don't begin before start times)
    * -make sure inputs are not the same
    *
    * Objectives
    * -Convert final return to int
    * -Refactor time verification code into separate method
    * */
}
