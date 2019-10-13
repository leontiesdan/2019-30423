import org.junit.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public static void TestNameInverter(){


        Assert.assertEquals(Main.NameInverter("Singleton"),"Singleton");
        assertNull(Main.NameInverter(null));
        Assert.assertEquals(Main.NameInverter(""),"");
        Assert.assertEquals(Main.NameInverter("FirstName LastName"),"LastName, FirstName");
        Assert.assertEquals(Main.NameInverter(" SingleWord "),"SingleWord");
        Assert.assertEquals(Main.NameInverter(" FirstName LastName " ),"LastName, FirstName");
        Assert.assertEquals(Main.NameInverter("Mr. FirstName LastName" ),"LastName, FirstName Mr.");
        Assert.assertEquals(Main.NameInverter("Mr. Phd. FirstName LastName" ),"LastName, FirstName Mr. Phd.");


    }


}