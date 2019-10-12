package assignment_01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNameInverter {
    @Test
    public void testInvertName()
    {
        Assertions.assertNull(NameInverter.invertName(null));
        Assertions.assertEquals(NameInverter.invertName(""), "");
        Assertions.assertEquals(NameInverter.invertName("SingleWord"), "SingleWord");
        Assertions.assertEquals(NameInverter.invertName("FirstName LastName"), "LastName, FirstName");
        Assertions.assertEquals(NameInverter.invertName(" SingleWord "), "SingleWord");
        Assertions.assertEquals(NameInverter.invertName(" FirstName LastName "), "LastName, FirstName");
        Assertions.assertEquals(NameInverter.invertName("Mr. FirstName LastName"), "LastName, FirstName Mr.");
        Assertions.assertEquals(NameInverter.invertName("Mrs. FirstName LastName"), "LastName, FirstName Mrs.");
        Assertions.assertEquals(NameInverter.invertName("Mr. Phd. FirstName LastName"), "LastName, FirstName Mr. Phd.");
    }
}
