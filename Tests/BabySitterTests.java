import com.preludes.babysitter.BabySitter;
import org.junit.Assert;
import org.junit.Test;

public class BabySitterTests {

    //Testing to make sure class creation doesn't cause any errors
    @Test
    public void mainClassCreation(){
        BabySitter baby = new BabySitter();
    }

    //Tests from 5pm - 6pm with Family A
    @Test
    public void workingOneHourWithFamilyA(){
        BabySitter baby = new BabySitter();
        Assert.assertEquals(15, baby.sittingJob(5, 6));
    }
}
